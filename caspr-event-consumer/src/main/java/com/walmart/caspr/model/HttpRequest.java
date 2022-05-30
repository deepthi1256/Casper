package com.walmart.caspr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;


public class HttpRequest {
    @JsonProperty("url")
    private String url;
    @JsonProperty("method")
    private String method;
    @JsonProperty("headers")
    private Map<String,String> headers;
    @JsonProperty("cookies")
    private Map<String,String> cookies;
    @JsonProperty("payLoad")
    private String payLoad;
    @JsonProperty("response")
    private HttpResponse response;
    @JsonProperty("validator")
    private Validator validator;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
     public Map<String, String> getHeaders() {
        return headers;
    }
     public void setHeaders(String name, String value) {
        this.headers.put(name, value);
    }
     public Map<String, String> getCookies() {
        return cookies;
    }
     public void setCookies(String name, String value) {
        this.cookies.put(name,value);
    }

    public String getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(String payLoad) {
        this.payLoad = payLoad;
    }

    public HttpResponse getResponse() {
        return response;
    }

    public void setResponse(HttpResponse response) {
        this.response = response;
    }

    public Validator getValidator() {
        return validator;
    }

    public void setValidator(Validator validator) {
        this.validator = validator;
    }
}
