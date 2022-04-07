package com.bolotin;

public class Main {

    public static void main(String[] args) {

        Author FedorDost = new Author("Fedor", "Dostoevsky");
        Book idiot = new Book("Idiot", FedorDost, 1869);

        Author Pushkin = new Author("Alexandr", "Pushkin");
        Book fullSobr = new Book("Полное собрание сочинений", Pushkin, 2022);

        System.out.println(idiot.getName() + " " + idiot.getAuthorName().getName() + " " + idiot.getAuthorName().getSurname() + " " + idiot.getYearPublishing());
        System.out.println(fullSobr.getName() + " " + fullSobr.getAuthorName().getName() + " " + fullSobr.getAuthorName().getSurname() + " " + fullSobr.getYearPublishing());

        fullSobr.setYearPublishing(2021);
        System.out.println(fullSobr.getName() + " " + fullSobr.getAuthorName().getName() + " " + fullSobr.getAuthorName().getSurname() + " " + fullSobr.getYearPublishing());
//        задание к уроку 1.10 "методы объектов"
        System.out.println();
        System.out.println("задание к уроку 1.10 \"методы объектов\"");
        System.out.println(FedorDost);
        System.out.println(idiot);

    }
}
