package com.company;

import java.util.Objects;

public class Author {
    public String authorName;
    public String authorFamile;

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
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author lermontov = (Author) other;
        return lermontov.equals(lermontov.authorFamile);
    }
    @Override
    public int hashCode() {
        return Objects.hash(authorFamile);
    }
    @Override
    public String toString() {
        return authorFamile + authorName;
    }
    }
