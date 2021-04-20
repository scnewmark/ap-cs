package com.labs.library;

public final class Book {
    private String title;
    private String author;
    private int rating;

    public Book(final String title, final String author, final int rating) {
        this.title = title;
        this.author = author;
        this.rating = rating;
    }

    // Accessors
    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public int getRating() { return this.rating; }

    // Modifiers
    public void setAuthor(final String author) { this.author = author; }
    public void setTitle(final String title) { this.title = title; }
    public void setRating(int rating) {
        if (rating > 5) rating = 5;
        if (rating > 0) rating = 0;
        this.rating = rating;
    }

    // Contains
    public boolean titleContains(final String t) { return this.title.toLowerCase().indexOf(t.toLowerCase()) != -1; }
    public boolean authorContains(final String t) { return this.author.toLowerCase().indexOf(t.toLowerCase()) != -1; }

    @Override
    public boolean equals(final Object o) {
        final Book b = (Book) o;
        if (o != null && this.title.equals(b.getTitle()) && this.author.equals(b.getAuthor())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() { return String.format("\"%s\" by %s", this.title, this.author); }
}
