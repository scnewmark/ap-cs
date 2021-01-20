package Library;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LibraryRunner {
    public static void main(String[] args) throws FileNotFoundException {
        Library myLib = new Library("/Users/scnewmark/Desktop/school/CompSci/Java/Library/demo.txt");

        System.out.println("size =  " + myLib.getBooks().size());
        System.out.println("toString() = " + myLib.toString());

        System.out.println("contains = " + myLib.contains(new Book("Things Fall Apart", "Chinua Achebe", 0)));

        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("Missing You", "Harlan Coben", 4));
        list.add(new Book("We Are Water: A Novel", "Wally Lamb", 3));
        list.add(new Book("Undeniable", "Madeline Sheehan", 3));
        list.add(new Book("What She Left Behind", "Ellen M. Wiseman", 4));

        Library newLib = new Library(list);

        System.out.println("myLib searchByAuthor() = " + myLib.searchByAuthor("Chinua"));
        System.out.println("newLib searchByAuthor() = " + newLib.searchByAuthor("fyodor"));
        System.out.println("myLib searchByTitle() = " + myLib.searchByTitle("The"));
        System.out.println("newLib searchByTitle() = " + newLib.searchByTitle("The"));
        System.out.println("myLib searchByRating() = " + myLib.searchByRating(5));
        System.out.println("newLib searchByRating() = " + newLib.searchByRating(5));

        System.out.println("union = " + myLib.union(newLib));

        System.out.println("getBooks() = " + newLib.getBooks());

        Library lib = new Library();

        lib.addBooks(newLib.getBooks());

        System.out.println("equals() = " + lib.equals(newLib));
        System.out.println("equals() = " + lib.equals(myLib));
    }

}