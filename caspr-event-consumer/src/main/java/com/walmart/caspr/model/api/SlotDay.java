package com.walmart.caspr.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class SlotDay {

	@JsonProperty("slotDate")
	private String slotDate;
	@JsonProperty("storeId")
	private String storeId;
	@JsonProperty("fulfillmentStoreId")
	private String fulfillmentStoreId;
	@JsonProperty("accessPointId")
	private String accessPointId;
	@JsonProperty("supportedTimezone")
	private String supportedTimezone;
	@JsonProperty("fulfillmentType")
	private String fulfillmentType;
	@JsonProperty("slots")
	private List<Object> slots = null;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accessPointId == null) ? 0 : accessPointId.hashCode());
		result = prime * result + ((fulfillmentStoreId == null) ? 0 : fulfillmentStoreId.hashCode());
		result = prime * result + ((fulfillmentType == null) ? 0 : fulfillmentType.hashCode());
		result = prime * result + ((slotDate == null) ? 0 : slotDate.hashCode());
		result = prime * result + ((slots == null) ? 0 : slots.hashCode());
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
		SlotDay other = (SlotDay) obj;
		if (accessPointId == null) {
			if (other.accessPointId != null)
				return false;
		} else if (!accessPointId.equals(other.accessPointId))
			return false;
		if (fulfillmentStoreId == null) {
			if (other.fulfillmentStoreId != null)
				return false;
		} else if (!fulfillmentStoreId.equals(other.fulfillmentStoreId))
			return false;
		if (fulfillmentType == null) {
			if (other.fulfillmentType != null)
				return false;
		} else if (!fulfillmentType.equals(other.fulfillmentType))
			return false;
		if (slotDate == null) {
			if (other.slotDate != null)
				return false;
		} else if (!slotDate.equals(other.slotDate))
			return false;
		if (slots == null) {
			if (other.slots != null)
				return false;
		} else if (!slots.equals(other.slots))
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
