package com.learning.LibraryManagement;

public class Member extends User {

    private final int borrowedBookCount;
    private static final int MAX_BORROW_LIMIT = 5;

    public Member(String name, String contactInfo, int borrowedBookCount) {
        super(name, contactInfo);
        this.borrowedBookCount = borrowedBookCount;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Books Borrowed : " + borrowedBookCount);
    }

    @Override
    public boolean canBorrowBook() {
        return borrowedBookCount < MAX_BORROW_LIMIT;
    }
}
