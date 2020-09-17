package ru.job4j.test;

public class IndexOf {
    public static int indexOf(char[] string, char c, int number) {
        int result = -1;
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c && ++count == number) {
                return i;
            }
        }
        return result;
    }
}
