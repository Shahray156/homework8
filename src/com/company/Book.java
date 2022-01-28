package com.company;

    import java.time.LocalDate;

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

          //  int currentYear = LocalDate.now(). getYear();
          //  if (year < 1996 || year > currentYear) {
           //     System.out.println("Invalide publishing year parametr: " + year);
           //     return;
          //  }
           // this.year = year;
        }
    }

