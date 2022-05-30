package com.walmart.caspr.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ServiceAddress {

	@JsonProperty("isApoFpo")
	private String isApoFpo;
	@JsonProperty("isPoBox")
	private String isPoBox;
	@JsonProperty("country")
	private String country;
	@JsonProperty("geoPoint")
	private GeoPoint geoPoint;
	@JsonProperty("city")
	private String city;
	@JsonProperty("postalCode")
	private String postalCode;
	@JsonProperty("addressLineOne")
	private String addressLineOne;
	@JsonProperty("stateOrProvinceName")
	private String stateOrProvinceName;
	@JsonProperty("state")
	private String state;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressLineOne == null) ? 0 : addressLineOne.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((geoPoint == null) ? 0 : geoPoint.hashCode());
		result = prime * result + ((isApoFpo == null) ? 0 : isApoFpo.hashCode());
		result = prime * result + ((isPoBox == null) ? 0 : isPoBox.hashCode());
		result = prime * result + ((postalCode == null) ? 0 : postalCode.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((stateOrProvinceName == null) ? 0 : stateOrProvinceName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ServiceAddress other = (ServiceAddress) obj;
		if (addressLineOne == null) {
			if (other.addressLineOne != null)
				return false;
		} else if (!addressLineOne.equals(other.addressLineOne))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (geoPoint == null) {
			if (other.geoPoint != null)
				return false;
		} else if (!geoPoint.equals(other.geoPoint))
			return false;
		if (isApoFpo == null) {
			if (other.isApoFpo != null)
				return false;
		} else if (!isApoFpo.equals(other.isApoFpo))
			return false;
		if (isPoBox == null) {
			if (other.isPoBox != null)
				return false;
		} else if (!isPoBox.equals(other.isPoBox))
			return false;
		if (postalCode == null) {
			if (other.postalCode != null)
				return false;
		} else if (!postalCode.equals(other.postalCode))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (stateOrProvinceName == null) {
			if (other.stateOrProvinceName != null)
				return false;
		} else if (!stateOrProvinceName.equals(other.stateOrProvinceName))
			return false;
		return true;
	}
	 

}
