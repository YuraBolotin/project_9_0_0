package com.bolotin;

public class Author {
    private String name;
    private String surname;
    private Author FullName;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getFullName() {
        return this.name + this.surname;
    }
}
