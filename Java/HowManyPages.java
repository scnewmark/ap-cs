
import java.util.Scanner;

public class HowManyPages {
   public static void main( String[] args ) {
      // set up input scanner
      Scanner sc = new Scanner(System.in);
      // get the age
      System.out.println("Enter your age: ");
      final int age = sc.nextInt();
      sc.nextLine();
      
      sc.close();
      // call the pages method to compute the number of pages to be read
      final int required = pages(age);
      // display result (pages to be read)
      System.out.println(age + " year olds should read at least " + required + " pages before giving up on a book");
   }
   
   public static int pages(int usersAge) {
        int requiredPages = (100 - usersAge);
        return requiredPages;
   }
}