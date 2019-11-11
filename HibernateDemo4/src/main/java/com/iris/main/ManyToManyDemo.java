package com.iris.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.iris.models.Course;
import com.iris.models.Student;
import com.iris.utility.SessionFactoryProvider;

public class ManyToManyDemo {

	public static void main(String[] args) {
	
	Session session=SessionFactoryProvider.getSessionFactory().openSession();
	Transaction tx=session.beginTransaction();
	
	Course c1=new Course();
	c1.setCourseName("Java");
	
	Course c2=new Course();
	c2.setCourseName("Big Data and Hadoop");
	
	Student stud=new Student();
	stud.setStudentName("Gourav");
	List<Course> list=stud.getCoursesEnrolled();
	list.add(c1);
	list.add(c2);
	
	session.save(stud);
	
		
	tx.commit();
	session.close();
	
	

	}

}
