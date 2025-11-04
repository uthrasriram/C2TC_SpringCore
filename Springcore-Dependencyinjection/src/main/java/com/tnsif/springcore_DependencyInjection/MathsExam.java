package com.tnsif.springcore_DependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MathsExam {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		
		//setter injection
		Student th=con.getBean("tamil",Student.class);
		Student rv=con.getBean("reventh",Student.class);
		
		th.showInfo();
		rv.showInfo();
		
		//Constructor injection
		Student1 sk=con.getBean("sakthi",Student1.class);
		Student1 hm=con.getBean("hema",Student1.class);
		
		sk.showInfo();
		hm.showInfo();
		
	}
}


