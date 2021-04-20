package com.labs.library;

import java.io.*;
import java.util.*;

public class Library {
    private ArrayList<Book> books;

    public Library() { this.books = new ArrayList<Book>(); }
    public Library(final ArrayList<Book> books) { this.books = new ArrayList<Book>(books); }

    public Library(final String filename) throws FileNotFoundException {
        final File input = new File(filename);
        final Scanner reader = new Scanner(input);

        books = new ArrayList<Book>();

        while (reader.hasNextLine()) {
            final Scanner parser = new Scanner(reader.nextLine()).useDelimiter("\\t");
            String title, author;
            int rating;

            if (parser.hasNext()) title = parser.next();
            else continue;

            if (parser.hasNext()) author = parser.next();
            else continue;

            if (parser.hasNextInt()) rating = parser.nextInt();
            else continue;

            this.addBook(new Book(title, author, rating));
            parser.close();
        }
        reader.close();
    }

    public Library union(final Library l) {
        final ArrayList<Book> books = new ArrayList<Book>(this.books);
        books.addAll(l.getBooks());
        return new Library(books);
    }

    public ArrayList<Book> getBooks() { return this.books; }
    public void setBooks(final ArrayList<Book> books) { this.books = new ArrayList<Book>(books); }

    public Book getBook(final int index) { return this.books.get(index); }
    public void setBook(final int index, final Book book) { this.books.set(index, book); }

    public void addBook(final Book book) { this.books.add(book); }
    public void addBooks(final ArrayList<Book> books) { this.books.addAll(books); }

    public Book removeBook(final int index) { return this.books.remove(index); }
    public boolean removeBook(final Book book) { return this.books.remove(book); }

    public boolean contains(final Book book) { return this.books.contains(book); }

    public int indexOf(final Book book) { return this.books.indexOf(book); }

    public Library searchByTitle(final String query) {
        final Library results = new Library();
        for (final Book b: this.books) {
            if (b.getTitle().toLowerCase().contains(query.toLowerCase())) {
                results.addBook(b);
            }
        }
        return results;
    }

    public Library searchByAuthor(final String query) {
        final Library results = new Library();
        for (final Book b: this.books) {
            if (b.getAuthor().toLowerCase().contains(query.toLowerCase())) {
                results.addBook(b);
            }
        }
        return results;
    }

    public Library searchByRating(final int rating) {
        final Library results = new Library();
        for (final Book b: this.books) {
            if (b.getRating() == rating) {
                results.addBook(b);
            }
        }
        return results;
    }

    @Override
    public boolean equals(final Object o) {
        final Library lib = (Library) o;
        return lib.getBooks().equals(this.getBooks());
    }

    @Override
    public String toString() {
        return Arrays.toString(this.books.toArray());
    }
}
