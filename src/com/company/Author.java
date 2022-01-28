package com.company;

public class Author {
    private String authorName;
    private String authorFamile;

    public Author(String authorName, String authorFamile) {
        this.authorName = authorName;
        this.authorFamile = authorFamile;
        }

        public String getAuthorName() {
            return authorName;
        }
        public String getAuthorFamile() {
            return authorFamile;
        }
    }
