package com.company;

import java.util.Objects;

public class Book {
        private Author authorName;
        private int year;
        private final String bookName;


        public Book (Author authorName, int year, String bookName) {
            this.authorName = authorName;
            this.year = year;
            this.bookName = bookName;
        }

        public String getBookName() {
            return bookName;
        }
        public Object getAuthorName() {
            return authorName;
        }

        public int getYear() {
            return year;
        }
        public void setYear() {
            this.year = year;
        }
        public void setYear(int year) {
        }
        @Override
        public boolean equals(Object other) {
            if (this.getClass() != other.getClass()) {
                return false;
            }
            Book palahniuk = (Book) other;
            return bookName.equals(palahniuk.bookName);
        }
        @Override
        public int hashCode() {
            return Objects.hash(bookName);
    }
        @Override
        public String toString() {
            return bookName + ":" + authorName;
        }
    }
