package com.bolotin;

import java.util.Objects;

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

    public String toString() {
        return this.name + " " + this.authorName + " " + this.yearPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublishing == book.yearPublishing && Objects.equals(authorName, book.authorName) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, name, yearPublishing);
    }
}
