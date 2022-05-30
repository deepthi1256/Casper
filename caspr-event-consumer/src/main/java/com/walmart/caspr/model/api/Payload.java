package com.walmart.caspr.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Payload {

	@JsonProperty("startDate")
	private String startDate;
	@JsonProperty("endDate")
	private String endDate;
	@JsonProperty("supportExpress")
	private Boolean supportExpress;
	@JsonProperty("supportedSlotTypes")
	private List<String> supportedSlotTypes = null;
	@JsonProperty("slotDays")
	private List<SlotDay> slotDays = null;
	@JsonProperty("accessPointDetails")
	private List<AccessPointDetail> accessPointDetails = null;
	@JsonProperty("serviceInfo")
	private ServiceInfo serviceInfo;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accessPointDetails == null) ? 0 : accessPointDetails.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((serviceInfo == null) ? 0 : serviceInfo.hashCode());
		result = prime * result + ((slotDays == null) ? 0 : slotDays.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((supportExpress == null) ? 0 : supportExpress.hashCode());
		result = prime * result + ((supportedSlotTypes == null) ? 0 : supportedSlotTypes.hashCode());
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
		Payload other = (Payload) obj;
		if (accessPointDetails == null) {
			if (other.accessPointDetails != null)
				return false;
		} else if (!accessPointDetails.equals(other.accessPointDetails))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (serviceInfo == null) {
			if (other.serviceInfo != null)
				return false;
		} else if (!serviceInfo.equals(other.serviceInfo))
			return false;
		if (slotDays == null) {
			if (other.slotDays != null)
				return false;
		} else if (!slotDays.equals(other.slotDays))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (supportExpress == null) {
			if (other.supportExpress != null)
				return false;
		} else if (!supportExpress.equals(other.supportExpress))
			return false;
		if (supportedSlotTypes == null) {
			if (other.supportedSlotTypes != null)
				return false;
		} else if (!supportedSlotTypes.equals(other.supportedSlotTypes))
			return false;
		return true;
	}
	 
	
}
