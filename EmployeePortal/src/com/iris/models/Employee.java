package com.iris.models;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String gender;
	private String city;
	private String email;
	private String password;
	
	public Employee(){}
	
	
	
	public Employee(String employeeName, String gender, String city,
			String email, String password) {
		super();
		this.employeeName = employeeName;
		this.gender = gender;
		this.city = city;
		this.email = email;
		this.password = password;
	}



	public Employee(int employeeId, String employeeName, String gender,
			String city, String email, String password) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.city = city;
		this.email = email;
		this.password = password;
	}



	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", gender=" + gender + ", city=" + city
				+ ", email=" + email + ", password=" + password + "]";
	}
	
	
}
