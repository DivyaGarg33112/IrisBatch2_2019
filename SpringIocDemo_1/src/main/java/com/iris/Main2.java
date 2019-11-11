package com.iris;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

	public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("springs.xml");
	Student stud=context.getBean("studObj",Student.class);
	
	//System.out.println("\n===Student Details======");
	//System.out.println("Student Id : "+stud.getStudentId());
	System.out.println("Student Name : "+stud.getStudentName());
	
	/*Address addr=stud.getStudentAddress();
	System.out.println("Student Address : "+addr);
	
	List<Course> courseList=stud.getCourses();
	for(Course c:courseList){
		System.out.println(c);
	}*/
	
	stud.setStudentName("ABC Student");
	
	Student stud1=context.getBean("studObj",Student.class);
	System.out.println("Updated Name : "+stud1.getStudentName());
	
	}

}
