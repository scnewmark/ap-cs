package Midterm;

public class IsAlphaNumeric {
    public static int isAlphaNumeric(char ch) {
        if (ch > 64 && ch < 91) {
            return 2;
        } else if (ch > 96 && ch < 123) {
            return 3;
        } else if (ch > 47 && ch < 58) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(isAlphaNumeric('a'));
    }
}
