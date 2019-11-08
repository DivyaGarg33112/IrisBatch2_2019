package com.iris.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Person {
	
	@Id
	private int personId;
	private String personName;
	private int personAge;
	
	@ElementCollection
	@JoinTable(name="PersonAddress",joinColumns=
	@JoinColumn(name="PersonId"))
	private Set<Address> addrSet=new HashSet<>();
	
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
	public Set<Address> getAddrSet() {
		return addrSet;
	}
	public void setAddrSet(Set<Address> addrSet) {
		this.addrSet = addrSet;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName
				+ ", personAge=" + personAge + "]";
	}

		
	
}
