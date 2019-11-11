package com.iris.autowiring;

public class Circle {
	
	private Point pointA;
	
	public Circle(Point pointA){
		this.pointA=pointA;
	}
	
	/*public void setPointA(Point pointA) {
		this.pointA = pointA;
	}*/

	
	@Override
	public String toString() {
		return "Circle [pointA=" + pointA + "]";
	}
	
	
	
	
}
