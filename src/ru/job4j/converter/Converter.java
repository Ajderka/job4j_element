package ru.job4j.converter;

public class Converter {
    private static int rubleToEuro(int value) {
        return value / 88;
    }

    private static int rubleToDollar(int value) {
        return value / 74;
    }

    public static void main(String[] args) {
        int in = 190;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected == out2;
        System.out.println("140 rubles are 2. Test result : " + passed2);
    }
}
