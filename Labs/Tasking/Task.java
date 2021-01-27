package Labs.Tasking;

public class Task {

    final static int DRIPS_PER_GALLON = 15140;

    public static int favorite() {
        int value = ((((16 * 65) + 12) * 72) / 68);
        int result = value - 1;
        return result;
    }

    public static int wasted(double r, int d) {
        double drips = r * (1440 * d);
        int wastedGallons = (int) Math.round(drips / DRIPS_PER_GALLON);
        return wastedGallons;
    }

    public static int count(double a, double b, int mL) {
        double volume = 5 * Math.PI * a * ((b * b) / 24);
        double containsBeans = 0.698 * mL;
        double totalBeans = containsBeans / volume;
        return (int)totalBeans;
    }
}
