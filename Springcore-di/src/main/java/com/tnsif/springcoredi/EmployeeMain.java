// To demonstrate dependency injection using Spring framework
package com.tnsif.springcoredi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
    public static void main(String[] args) {
        // Load the Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("dept.xml");

        // Retrieve the Company bean
        Company company = context.getBean("company", Company.class);

        // Print the company details, including departments and employees
        company.printCompanyDetails();
        
		/*
		 * // Iterate through each department and find the second highest salary for
		 * (Department department : company.getDepartmentList()) { Double
		 * secondHighestSalary = department.getSecondHighestSalary(); if
		 * (secondHighestSalary != null) {
		 * System.out.println("Second Highest Salary in " +
		 * department.getDepartmentName() + ": " + secondHighestSalary); } else {
		 * System.out.
		 * println("Not enough employees to determine the second highest salary in " +
		 * department.getDepartmentName()); } }
		 */
        
    }
}
