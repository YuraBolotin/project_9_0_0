package com.bolotin;

public class Book {
    private final Author authorName;
    private String name;
    private int yearPublishing;

    public Book(String name, Author authorName, int yearPublishing) {

        this.name = name;
        this.authorName = authorName;
        this.yearPublishing = yearPublishing;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
}
