package com.learning.LibraryManagement.LibraryManagement;

public abstract class User {

    private static int counter = 0;

    private final String userId;

    private String name;
    private String contactInfo;

    private static int totalUsers = 0;

    public User() {
        this.userId = generateRandomId();
        totalUsers++;
    }

    private static final String generateRandomId() {
        return String.valueOf(counter++);
    }

    public User(User others) {
        this.userId = others.userId;
        this.name = others.name;
        this.contactInfo = others.contactInfo;
        totalUsers++;
    }


    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public abstract void displayDashboard();

    public abstract boolean canBorrowBook();

    private int getTotalUsers() {
        return totalUsers;
    }
}
