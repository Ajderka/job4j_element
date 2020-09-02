package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 80;
    }

    public static int rubleToDollar(int value) {
        return value / 70;
    }
}
