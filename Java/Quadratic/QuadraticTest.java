package Quadratic;

public class QuadraticTest {
    public static int realRoots;
    public static int imaginaryRoots;
    public static void main(String[] args) {
        Quadratic eqn1 = new Quadratic(2, 2, -24);
        System.out.println(eqn1);

        Quadratic eqn2 = new Quadratic(3, 12, 12);
        Quadratic eqn3 = new Quadratic(1, -10, 34);

        eqn1.solve();
        eqn2.solve();
        eqn3.solve();

        System.out.println(eqn1);
        System.out.println(eqn2);
        System.out.println(eqn3);

        System.out.println("real roots = " + realRoots);
        System.out.println("imaginary roots = " + imaginaryRoots);
    }
}
