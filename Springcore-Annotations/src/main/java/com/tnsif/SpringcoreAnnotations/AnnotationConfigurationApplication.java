package com.tnsif.SpringcoreAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	public class AnnotationConfigurationApplication {

	    public static void main(String[] args) {
	        // Creating Spring Application Context using Annotation-based Configuration
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        // Retrieving the MusicTeacher bean from the context
	        MusicTeacher obj = context.getBean("getTeacherInfo", MusicTeacher.class);

	        // Setting the teacher's name using the setter method
	        obj.setName("Rahul Ravi");

	        // Displaying teacher information
	        System.out.println(obj.getTeacherInfo());
	    }
	}


