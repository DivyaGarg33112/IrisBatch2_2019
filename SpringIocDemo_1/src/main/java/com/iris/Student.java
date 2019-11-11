package com.iris;

import java.util.List;

public class Student {
	
	private int studentId;
	private String studentName;
	private Address studentAddress;
	private List<Course> courses;
	
	public Student(int studentId,String studentName,Address addr){
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentAddress=addr;
	}
	public void setCourses(List<Course> courses){
		this.courses=courses;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", studentAddress=" + studentAddress
				+ ", courses=" + courses + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setStudentName(String studentName){
		this.studentName=studentName;
	}
	
}
