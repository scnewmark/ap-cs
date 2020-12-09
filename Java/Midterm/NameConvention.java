package Midterm;

public class NameConvention {
    public static String nameConvention(int period, String name) {
        String first = name.split("\s")[0];
        String last = name.split("\s")[1];
        return String.format("(P%d) %s %s", period, first, last);
    }
    public static void main(String[] args) {
        System.out.println(nameConvention(2, "Samuel Newmark"));
    }
}
