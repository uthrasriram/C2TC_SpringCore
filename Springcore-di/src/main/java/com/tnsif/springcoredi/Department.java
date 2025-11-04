// To define a Class representing a Department in the company
package com.tnsif.springcoredi;

import java.util.List;

public class Department {
    // Name of the department
    private String departmentName; 

    // List of employees in the department
    private List<Employee> employeeList;

    // Getter for the departmentName
    public String getDepartmentName() {
        return departmentName;
    }

    // Setter for the departmentName
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    // Getter for the employeeList
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    // Setter for the employeeList
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;

        // Automatically set the department for each employee
        for (Employee employee : employeeList) {
            employee.setDepartment(this);
        }
    }

    // Method to get the second highest salary from the employee list
    public Double getSecondHighestSalary() {
        // Sort the list of employee salaries in descending order and return the second highest salary
        return employeeList.stream()
                .map(Employee::getSalary)
                .sorted((a, b) -> Double.compare(b, a)) // Sort in descending order
                .skip(1) // Skip the first (highest) salary
                .findFirst() // Get the next (second highest) salary
                .orElse(null); // Return null if there is no second highest salary
    }
}
