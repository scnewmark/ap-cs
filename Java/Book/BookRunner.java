package Book;

public class BookRunner {
	public static void main(String args[]) {
        Book textBook = new Book();
        System.out.println(textBook.getBookISBN());
        
        Book book = new Book("Hitchhikers Guide to the Galaxy", 345391802);

        textBook.setBookName("Learn JAVA now!!!");
        textBook.setBookISBN(12345678);
        
        System.out.println(book);
        System.out.println(textBook);

        System.out.println("Book 0 name: " + textBook.getBookName() + " ISBN(" + textBook.getBookISBN() + ")");
        System.out.println("Book 1 name: " + book.getBookName() + " ISBN(" + book.getBookISBN() + ")");

        System.out.println(textBook);
        System.out.println(book);
	}
}