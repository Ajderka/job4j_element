package ru.job4j.test;

public class Symmetry {
    public static boolean check(int i) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(i));
        for (int j = 0; j < stringBuilder.length() / 2; j++) {
            if (stringBuilder.charAt(j) != stringBuilder.charAt(stringBuilder.length() - j - 1)) {
                return false;
            }
        }
        return true;
    }
}
