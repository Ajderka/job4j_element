package ru.job4j.converter;

public class Converter {
    private static double rubleToEuro(double value) {
        double rsl = value / 88;
        return rsl;
    }

    private static double rubleToDollar(double value) {
        double rsl = value / 74;
        return rsl;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar");
    }
}
