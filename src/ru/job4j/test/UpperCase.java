package ru.job4j.test;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] result = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            if (Character.isLetter(string[i]) && Character.isLowerCase(string[i])) {
                result[i] = Character.toUpperCase(string[i]);
                continue;
            }
            result[i] = string[i];
        }
        return result;
    }
}
