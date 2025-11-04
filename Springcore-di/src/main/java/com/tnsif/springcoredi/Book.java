// To define a Class representing a Book entity with title and author details
package com.tnsif.springcoredi;

public class Book {
    // Private fields to store the title and author of the book
    private String title;
    private String author;
    private int bid;
    
    private Department department;
    
    public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Book(Department department)
    {
    	this.department=department;
    }
    // Constructor that allows dependency injection for the title and author of the book
    public Book(String title, String author, int bid) {
        this.title = title;  // Sets the book's title
        this.author = author;  // Sets the book's author
        this.bid=bid;
    }

    // Getter method to access the title of the book
    public String getTitle() {
        return title;
    }

    // Getter method to access the author of the book
    public String getAuthor() {
        return author;
    }

    public int getBid() {
		return bid;
	}
    
    // Override toString method to return the book details in a readable format
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", bid=" + bid + "]";
	}

	public void displayDepartment() {
	    if (department != null) {
	        System.out.println("Department Name: " + department.getDepartmentName());
	    } else {
	        System.out.println("No department assigned.");
	    }
	}

   
}
