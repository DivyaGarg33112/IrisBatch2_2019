package com.iris;

public class Engine {
	private int cc;
	private String make;
	
	public Engine(int cc,String make){
		this.cc=cc;
		this.make=make;
	}
	public String toString(){
		return "cc= "+cc+" and make = "+make;
	}
}
