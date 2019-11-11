package com.iris.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="VehicleT")
public class Vehicle {

	@Id
	private int vehicleNumber;
	private String company;
	private String type;
	
	@OneToOne(mappedBy="vehicle")
	private User user;
	
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicleNumber=" + vehicleNumber + ", company="
				+ company + ", type=" + type + "]";
	}
	
	
}
