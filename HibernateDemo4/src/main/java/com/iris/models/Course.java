package com.iris.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Course_T")
public class Course {
	
	@Id
	@GeneratedValue
	private int courseId;
	private String courseName;
	
	@ManyToMany(mappedBy="coursesEnrolled")
	private List<Student> students=new ArrayList<>();
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	

}
