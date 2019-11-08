package com.iris.models;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	private int personId;
	private String personName;
	private int personAge;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="addressLine1",column=@Column(name="Pre_Addr1")),
		@AttributeOverride(name="addressLine2",column=@Column(name="Pre_Addr2")),
	})
	private Address presentAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="addressLine1",column=@Column(name="Per_Addr1")),
		@AttributeOverride(name="addressLine2",column=@Column(name="Per_Addr2")),
	})
	private Address permanentAddress;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public Address getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(Address presentAddress) {
		this.presentAddress = presentAddress;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName
				+ ", personAge=" + personAge + ", presentAddress="
				+ presentAddress + ", permanentAddress=" + permanentAddress
				+ "]";
	}
	
	
		
}
