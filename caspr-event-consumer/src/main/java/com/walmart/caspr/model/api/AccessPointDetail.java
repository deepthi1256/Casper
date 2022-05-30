package com.walmart.caspr.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class AccessPointDetail {

	@JsonProperty("accessPointId")
	private String accessPointId;
	@JsonProperty("accessPointName")
	private String accessPointName;
	@JsonProperty("supportedTimezone")
	private String supportedTimezone;
	@JsonProperty("locationInstructions")
	private String locationInstructions;
	@JsonProperty("minimumPurchase")
	private String minimumPurchase;
	@JsonProperty("storeId")
	private String storeId;
	@JsonProperty("fulfillmentStoreId")
	private String fulfillmentStoreId;
	@JsonProperty("serviceAddress")
	private ServiceAddress serviceAddress;
	@JsonProperty("isPilotTraining")
	private Boolean isPilotTraining;
	@JsonProperty("isTest")
	private Boolean isTest;
	@JsonProperty("isCrowdSourced")
	private Boolean isCrowdSourced;
	@JsonProperty("acceptsEbtYN")
	private String acceptsEbtYN;
	@JsonProperty("ebtPayInPerson")
	private String ebtPayInPerson;
	@JsonProperty("allowAgeRestricted")
	private Boolean allowAgeRestricted;
	@JsonProperty("allowAlcohol")
	private Boolean allowAlcohol;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acceptsEbtYN == null) ? 0 : acceptsEbtYN.hashCode());
		result = prime * result + ((accessPointId == null) ? 0 : accessPointId.hashCode());
		result = prime * result + ((accessPointName == null) ? 0 : accessPointName.hashCode());
		result = prime * result + ((allowAgeRestricted == null) ? 0 : allowAgeRestricted.hashCode());
		result = prime * result + ((allowAlcohol == null) ? 0 : allowAlcohol.hashCode());
		result = prime * result + ((ebtPayInPerson == null) ? 0 : ebtPayInPerson.hashCode());
		result = prime * result + ((fulfillmentStoreId == null) ? 0 : fulfillmentStoreId.hashCode());
		result = prime * result + ((isCrowdSourced == null) ? 0 : isCrowdSourced.hashCode());
		result = prime * result + ((isPilotTraining == null) ? 0 : isPilotTraining.hashCode());
		result = prime * result + ((isTest == null) ? 0 : isTest.hashCode());
		result = prime * result + ((locationInstructions == null) ? 0 : locationInstructions.hashCode());
		result = prime * result + ((minimumPurchase == null) ? 0 : minimumPurchase.hashCode());
		result = prime * result + ((serviceAddress == null) ? 0 : serviceAddress.hashCode());
		result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
		result = prime * result + ((supportedTimezone == null) ? 0 : supportedTimezone.hashCode());
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
		AccessPointDetail other = (AccessPointDetail) obj;
		if (acceptsEbtYN == null) {
			if (other.acceptsEbtYN != null)
				return false;
		} else if (!acceptsEbtYN.equals(other.acceptsEbtYN))
			return false;
		if (accessPointId == null) {
			if (other.accessPointId != null)
				return false;
		} else if (!accessPointId.equals(other.accessPointId))
			return false;
		if (accessPointName == null) {
			if (other.accessPointName != null)
				return false;
		} else if (!accessPointName.equals(other.accessPointName))
			return false;
		if (allowAgeRestricted == null) {
			if (other.allowAgeRestricted != null)
				return false;
		} else if (!allowAgeRestricted.equals(other.allowAgeRestricted))
			return false;
		if (allowAlcohol == null) {
			if (other.allowAlcohol != null)
				return false;
		} else if (!allowAlcohol.equals(other.allowAlcohol))
			return false;
		if (ebtPayInPerson == null) {
			if (other.ebtPayInPerson != null)
				return false;
		} else if (!ebtPayInPerson.equals(other.ebtPayInPerson))
			return false;
		if (fulfillmentStoreId == null) {
			if (other.fulfillmentStoreId != null)
				return false;
		} else if (!fulfillmentStoreId.equals(other.fulfillmentStoreId))
			return false;
		if (isCrowdSourced == null) {
			if (other.isCrowdSourced != null)
				return false;
		} else if (!isCrowdSourced.equals(other.isCrowdSourced))
			return false;
		if (isPilotTraining == null) {
			if (other.isPilotTraining != null)
				return false;
		} else if (!isPilotTraining.equals(other.isPilotTraining))
			return false;
		if (isTest == null) {
			if (other.isTest != null)
				return false;
		} else if (!isTest.equals(other.isTest))
			return false;
		if (locationInstructions == null) {
			if (other.locationInstructions != null)
				return false;
		} else if (!locationInstructions.equals(other.locationInstructions))
			return false;
		if (minimumPurchase == null) {
			if (other.minimumPurchase != null)
				return false;
		} else if (!minimumPurchase.equals(other.minimumPurchase))
			return false;
		if (serviceAddress == null) {
			if (other.serviceAddress != null)
				return false;
		} else if (!serviceAddress.equals(other.serviceAddress))
			return false;
		if (storeId == null) {
			if (other.storeId != null)
				return false;
		} else if (!storeId.equals(other.storeId))
			return false;
		if (supportedTimezone == null) {
			if (other.supportedTimezone != null)
				return false;
		} else if (!supportedTimezone.equals(other.supportedTimezone))
			return false;
		return true;
	}
	 
}
