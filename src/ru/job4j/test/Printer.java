package ru.job4j.test;

public class Printer {

    public static String printerError(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.getNumericValue(chars[i]) > 22 && Character.getNumericValue(chars[i]) < 36) {
                count++;
            }
        }
        System.out.println(String.format("%d/%d", count, s.length()));
        return String.format("%d/%d", count, s.length());
    }
}