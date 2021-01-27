package Labs.InOrder;

import java.util.Scanner;

public class InOrderRunner {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter x, y, and z: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        InOrder values = new InOrder(x, y, z);
        System.out.println("\n" + x + " <= " + y + " <= " + z + " is \n" + values.isInOrder());
        values.orderValues();
        System.out.println("The correct order is " + values.getNumOne() + " <= " + values.getNumTwo() + " <= " + values.getNumThree());
    }
}
