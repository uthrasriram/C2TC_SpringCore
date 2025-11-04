package com.tnsif.springcoredemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {
		public static void main(String[] args) {
			
			ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
			Mobile mobile = context.getBean("mobile", Mobile.class);
			mobile.call();
			mobile.data();
		}
}

