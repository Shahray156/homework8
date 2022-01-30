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
}
