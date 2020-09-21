/* Sample program run
Enter faucet drips per minute: 3.75
Enter number of days: 30
A faucet with 3.75 drips per minute over 30 days will waste 10.700132100396301 gallons of water */

package Java;
import java.util.Scanner;

public class Drips {
    final static int DRIPS_PER_GALLON = 15140;

    public static double calculate(double dripsPerMinute, int days) {
        double drips = dripsPerMinute * (1440 * days);
        double wastedGallons = drips / DRIPS_PER_GALLON;
        return wastedGallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter faucet drips per minute: ");
        double drips = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter number of days: ");
        int days = sc.nextInt();
        sc.nextLine();
        
        sc.close();

        System.out.println("A faucet with " + drips + " drips per minute over " + days + " days will waste " + calculate(drips, days) + " gallons of water.");
    }
}