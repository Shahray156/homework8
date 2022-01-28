package com.company;


public class Main {

    public static void main(String[] args) {

    }
            public static void Book(Author authorName, int year, String bookName) {
                Book palahniuk = new Book("Palahniuk", 1996, "Fight club");
                palahniuk.setYear(1997);
                System.out.println("Автор книги: " + authorName);
                System.out.println("Год издания книги: " + year);
                System.out.println("Название книги: " + bookName);

                Book lermontov = new Book("Лермонтов", 1840, "Мцыри");
                lermontov.setYear(1840);
                System.out.println("Автор книги: " + authorName);
                System.out.println("Год издания книги: " + year);
                System.out.println("Название книги: " + bookName);
            }


        }


