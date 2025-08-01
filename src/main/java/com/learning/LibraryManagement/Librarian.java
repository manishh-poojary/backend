package com.learning.LibraryManagement;

public class Librarian extends User {

    private String employeeNumber;

    public Librarian(String name, String contactInfo, String employeeNumber) {
        super(name, contactInfo);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard");
        System.out.println("Employee NUmber : " + employeeNumber);

    }

    @Override
    public boolean canBorrowBook() {
        return true;
    }

//    void addNewBook(Book newBook) {
//    }
//
//    void removeBook(Book removeBook) {
//    }
}
