package com.walmart.caspr.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ServiceInfo {

	@JsonProperty("fulfillmentType")
	private String fulfillmentType;
	@JsonProperty("reservationType")
	private String reservationType;
	@JsonProperty("dispenseType")
	private String dispenseType;
	@JsonProperty("priority")
	private Integer priority;
	@JsonProperty("carrier")
	private String carrier;
	@JsonProperty("fulfillmentOption")
	private String fulfillmentOption;
	@JsonProperty("locationType")
	private String locationType;
	@JsonProperty("accessType")
	private String accessType;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accessType == null) ? 0 : accessType.hashCode());
		result = prime * result + ((carrier == null) ? 0 : carrier.hashCode());
		result = prime * result + ((dispenseType == null) ? 0 : dispenseType.hashCode());
		result = prime * result + ((fulfillmentOption == null) ? 0 : fulfillmentOption.hashCode());
		result = prime * result + ((fulfillmentType == null) ? 0 : fulfillmentType.hashCode());
		result = prime * result + ((locationType == null) ? 0 : locationType.hashCode());
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((reservationType == null) ? 0 : reservationType.hashCode());
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
		ServiceInfo other = (ServiceInfo) obj;
		if (accessType == null) {
			if (other.accessType != null)
				return false;
		} else if (!accessType.equals(other.accessType))
			return false;
		if (carrier == null) {
			if (other.carrier != null)
				return false;
		} else if (!carrier.equals(other.carrier))
			return false;
		if (dispenseType == null) {
			if (other.dispenseType != null)
				return false;
		} else if (!dispenseType.equals(other.dispenseType))
			return false;
		if (fulfillmentOption == null) {
			if (other.fulfillmentOption != null)
				return false;
		} else if (!fulfillmentOption.equals(other.fulfillmentOption))
			return false;
		if (fulfillmentType == null) {
			if (other.fulfillmentType != null)
				return false;
		} else if (!fulfillmentType.equals(other.fulfillmentType))
			return false;
		if (locationType == null) {
			if (other.locationType != null)
				return false;
		} else if (!locationType.equals(other.locationType))
			return false;
		if (priority == null) {
			if (other.priority != null)
				return false;
		} else if (!priority.equals(other.priority))
			return false;
		if (reservationType == null) {
			if (other.reservationType != null)
				return false;
		} else if (!reservationType.equals(other.reservationType))
			return false;
		return true;
	}
	
	
}
