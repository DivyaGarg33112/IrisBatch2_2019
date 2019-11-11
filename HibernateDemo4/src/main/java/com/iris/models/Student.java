package com.iris.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="Student_T")
public class Student {
	
	@Id
	@GeneratedValue
	private int studentId;
	private String studentName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="ThirdTab",joinColumns=@JoinColumn(name="SId"),
	inverseJoinColumns=@JoinColumn(name="cId"))
	private List<Course> coursesEnrolled=new ArrayList<Course>();

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Course> getCoursesEnrolled() {
		return coursesEnrolled;
	}

	public void setCoursesEnrolled(List<Course> coursesEnrolled) {
		this.coursesEnrolled = coursesEnrolled;
	}
	
	
	
}
