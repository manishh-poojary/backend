package com.learning.LibraryManagement.LibraryManagement;

public class Librarian extends User {

    private String employeeNumber;

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
