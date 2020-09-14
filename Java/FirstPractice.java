package Java;

public class FirstPractice {
    final static int DAYS_PER_WEEK = 7;
    public static void main(String[] args) {
        int x;
        x = 27;
        System.out.println("x = " + x);

        x = x + 1;
        System.out.println("x = " + (int)(x + 1));

        System.out.println("x = " + x);

        x = Integer.MAX_VALUE;
        System.out.println("x = " + x);

        x = Integer.MIN_VALUE;
        System.out.println("x = " + (x + 1));

        System.out.println("x = " + (Integer.MAX_VALUE + 1));
        System.out.println("x = " + (Integer.MIN_VALUE - 1));
        System.out.println("x = " + (Integer.MIN_VALUE));

        double y = 6.2;
        System.out.println("y = " + y);

        y = 27;
        System.out.println("y = " + y);

        char a = '$';
        System.out.println("a = " + a);

        a = '\'';
        System.out.println("a = " + a);

        String b = "Hello";
        String c = "World";
        System.out.println(b + "\n" + "\\\n" + c);

        int days = 212;
        System.out.printf(days + " days is %6f weeks.\n", (float)days / DAYS_PER_WEEK);
        
        int e = 6;
        int f = 27;
        System.out.println(e + " + " + f + " = " + (e + f) + " (not 627)");

        double g = 5.8 * 2;
        double h = 2.5;
        System.out.println("integer part of g / h = " + (int)(g / h));
    }
}
