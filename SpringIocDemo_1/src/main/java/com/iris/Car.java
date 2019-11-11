package com.iris;

public class Car {
	
	private int CarNumber;
	private String carModel;
	private Engine engineObj;
	public void setCarNumber(int carNumber) {
		CarNumber = carNumber;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public void setEngineObj(Engine engineObj) {
		this.engineObj = engineObj;
	}
	
	@Override
	public String toString() {
		return "Car [CarNumber=" + CarNumber + ", carModel=" + carModel
				+ ", engineObj=" + engineObj + "]";
	}
	
	
}
