package com.walmart.caspr.service.impl;

import com.walmart.caspr.model.HttpRequest;
import com.walmart.caspr.model.api.ResponseBody;
import com.walmart.caspr.service.CasperService;
import io.netty.channel.ChannelOption;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;
import reactor.netty.transport.logging.AdvancedByteBufFormat;
import reactor.util.function.Tuple2;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

@Service
@Slf4j
public class CasperServiceImpl implements CasperService {

    @Autowired
    private WebClient webClient;

    @Override
    public Mono<ResponseBody> postPayloadToCasper(HttpRequest casperIncomingMessage, String message) {
            Map<String, String> headers = casperIncomingMessage.getHeaders();
        Map<String,String> cookies = casperIncomingMessage.getCookies();

        webClient=	WebClient.create("http://localhost:8080/api/v1/postm");
        //webClient=	WebClient.create(casperIncomingMessage.getUrl());

        LinkedMultiValueMap headersMap = getHeaders(headers);
        MultiValueMap<String, String> myCookies = getCookies(cookies);
        return webClient.post()
                .body(Mono.just(casperIncomingMessage.getPayLoad()),String.class)
                .headers(header->header.addAll(headersMap))
                .cookies(cookie->cookie.addAll(myCookies))
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(ResponseBody.class)
                .elapsed()
                .doOnNext(tuple -> log.info("Capser API took : " + tuple.getT1() + " ms ."))
                .map(Tuple2::getT2)
                .single();


    }

    private MultiValueMap<String, String> getCookies(Map<String, String> cookies) {
        MultiValueMap<String, String> myCookies = new LinkedMultiValueMap<>();
        if(Objects.nonNull(cookies) && !cookies.isEmpty()){
            cookies.forEach((k, v)->{
                myCookies.put(k, Arrays.asList(v));
            });
        }
        return myCookies;
    }

    private LinkedMultiValueMap getHeaders(Map<String, String> headers) {
        LinkedMultiValueMap headersMap = new LinkedMultiValueMap<>();
        if(Objects.nonNull(headers) && !headers.isEmpty()){
            headers.forEach((k, v)->{
                headersMap.put(k, Arrays.asList(v));
            });
        }
        return headersMap;
    }


}
