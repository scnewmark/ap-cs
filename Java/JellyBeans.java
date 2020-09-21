package Java;
import java.util.Scanner;

public class JellyBeans {
    final static Scanner sc = new Scanner(System.in);

    public static int beans(int size, double height, double length) {
        double volume = 5 * Math.PI * length * ((height * height) / 24);
        double containsBeans = 0.698 * size;
        double totalBeans = containsBeans / volume;
        return (int)totalBeans;
    }

    public static void main(String[] args) {
        System.out.println("Enter jelly bean length (cm): ");
        double beanLength = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter jelly bean height (cm): ");
        double beanHeight = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter jar size (mL): ");
        int jarSize = sc.nextInt();
        sc.nextLine();

        System.out.println("Estimate for number of jelly beans with average\nlength: " + beanLength + " cm" + "\nheight: " + beanHeight + " cm");
        System.out.println("in a jar of size" + jarSize + " mL is\n" + (beans(jarSize, beanHeight, beanLength)));
    }
}
