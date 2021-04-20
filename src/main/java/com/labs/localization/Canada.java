package com.labs.localization;

public class Canada extends AbstractLocale {
    private final static double EXCHANGE_RATE = 1.26;
    private final static int CST_OFFSET = +1;

    public Canada() {
        super("Canada", "French");
    }

    @Override
    public String getGreeting() {
        return "Bonjour";
    }

    @Override
    public String getLocalTime(int hour, int min) {
        return String.format(String.format("%d:%02d", hour + CST_OFFSET, min));
    }

    @Override
    public String getCurrencySymbol() {
        return "C$";
    }

    @Override
    public double getCurrencyValue(final double dollarAmount) {
        return (double) dollarAmount * EXCHANGE_RATE;
    }
}
