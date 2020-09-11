package Java;

public class FirstPractice {
    public static void main(String[] args) {
        int x;
        x = 27;
        System.out.println("x = " + x);

        x = x + 1;
        System.out.println(x + 1);

        System.out.println("x = " + x);

        x = Integer.MAX_VALUE;
        System.out.println(x);

        x = Integer.MIN_VALUE;
        System.out.println(x);;

        double y = 6.2;
        System.out.println(y);

        y = 27;
        System.out.println(y);

        char a = '$';
        System.out.println(a);

        a = '\'';
        System.out.println(a);

        String b = "Hello";
        String c = "World";
        System.out.println(b + "\n" + "\\\n" + c);
        
        final int DAYS_PER_WEEK = 7;
        int days = 212;
        System.out.println(days + " days is " + (days / DAYS_PER_WEEK) + " weeks.");
    }
}
