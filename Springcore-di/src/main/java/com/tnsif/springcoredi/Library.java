// To define a Class representing a Library, containing a list of books and displaying them
package com.tnsif.springcoredi;

import java.util.List;

public class Library {
    // List of books present in the library
    private List<Book> books;

    // Constructor for dependency injection, initializes the list of books
    public Library(List<Book> books) {
        this.books = books;
    }

    // Method to display details of all books in the library
    public void displayBooks() {
        System.out.println("Books in the Library:");
        // Iterate through the list of books and print each book's details
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
