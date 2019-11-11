package com.iris;

public class Laptop {
	
	private int ram;
	private String company;
	
	public Laptop(){
		System.out.println("I m non-parameterised constructor");
	}
	
	public Laptop(int ram,String company){
		System.out.println("I m parameterised constructor");
		this.ram=ram;
		this.company=company;
	}
	
	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void printLaptopDetails(){
		System.out.println("\n-====Laptop Details====-");
		System.out.println("Ram : "+ram+" GB");
		System.out.println("Make : "+company);
	}
	
}
