package com.company;


public class Main {

    public static void main(String[] args) {

    }
            public static void Book(Author authorName, int year, String bookName) {
                Book palahniuk = new Book( new Author("Chuck", "Palahniuk"),  1996,"Fight club");
                palahniuk.setYear(1996);
                System.out.println(palahniuk);

                Book lermontov = new Book( new Author ("Михаил","Лермонтов"), 1840, "Мцыри");
                lermontov.setYear(1840);
                System.out.println(lermontov);
            }


        }


