package Labs;

import java.util.Scanner;

public class Tastable {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the Shelf Life: ");
      int shelfLife = sc.nextInt();
      sc.nextLine();
      
      int tasteableAge = ( 7 + ( shelfLife / 2 ) );

      sc.close();
      
      System.out.println(shelfLife + " shelf life tastes best when it is at least " + tasteableAge + " weeks old.");
   }
}