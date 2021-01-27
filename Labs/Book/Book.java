package Labs.Book;

public class Book {
    String bookName;
    int bookISBN;

    public Book() {
        bookName = "None";
        bookISBN = 0;
    }

    public Book(String name, int ISBN) {
        bookName = name;
        bookISBN = ISBN;
    }

    public String setBookName(String bookname) {
        this.bookName = bookname;
        return this.bookName;
    }

    public int setBookISBN(int ISBN) {
        this.bookISBN = ISBN;
        return this.bookISBN;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookISBN() {
        return this.bookISBN;
    }

    public String toString() {
        return this.bookName + " " + this.bookISBN;
    }
}
