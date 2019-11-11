package com.iris;

public class Course {
	private int courseId;
	private String courseName;
	private double courseFees;
	
	public Course(int courseId, String courseName, double courseFees) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFees = courseFees;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName
				+ ", courseFees=" + courseFees + "]";
	}
	
	
	
}
