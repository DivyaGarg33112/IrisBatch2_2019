package com.iris.models;

import javax.persistence.Embeddable;

/*@Embeddable says it is a value type object . It will be 
 * depending on some entity object for its existence.*/
@Embeddable
public class Address {
	
	private String addressLine1;
	private String addressLine2;
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + "]";
	}
	
	
}
