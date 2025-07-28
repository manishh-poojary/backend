package com.learning.LibraryManagement.LibraryManagement;

public class TextBook extends Book {

    private String subject;
    private int edition;

    public TextBook(String isbn, String title, String author, String subject, int edition) {
        super(isbn, title, author);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    public void displayBookDetails() {
        System.out.println("TextBook - ISBN: " + this.getIsbn() + ", Title: " + this.getTitle() + "," +
                " Author: " + this.getAuthor() + ", Subject: " + subject + ", Edition: " + edition);

    }
}
