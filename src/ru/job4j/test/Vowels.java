package ru.job4j.test;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (validate(str.charAt(i))) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    private static boolean validate(char str) {
        if (str == ('a') || str == ('e') || str == ('i') || str == ('o') || str == ('u')) {
            return true;
        }
        return false;
    }
}