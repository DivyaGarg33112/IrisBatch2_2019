package com.iris.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	private int personId;
	private String personName;
	private int personAge;
	private Address personAddress;

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
	public Address getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(Address personAddress) {
		this.personAddress = personAddress;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName
				+ ", personAge=" + personAge + ", personAddress="
				+ personAddress + "]";
	}
	
	
	
}
