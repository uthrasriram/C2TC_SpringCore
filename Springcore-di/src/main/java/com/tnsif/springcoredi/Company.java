//To define a Class representing a Company with its departments and employees
package com.tnsif.springcoredi;

import java.util.List;

public class Company {
    // Name of the company
    private String companyName; 

    // List of departments within the company
    private List<Department> departmentList;

    // Getter for the companyName
    public String getCompanyName() {
        return companyName;
    }

    // Setter for the companyName
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Getter for the departmentList
    public List<Department> getDepartmentList() {
        return departmentList;
    }

    // Setter for the departmentList
    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    // Method to print the company name and details of all departments and employees
    public void printCompanyDetails() {
        System.out.println("Company Name: " + companyName);
        // Iterate through each department
        for (Department department : departmentList) {
            System.out.println("Department Name: " + department.getDepartmentName());
            // Iterate through each employee in the department
            for (Employee employee : department.getEmployeeList()) {
                System.out.println(employee); // Print employee details
            }
        }

        
    }
}
