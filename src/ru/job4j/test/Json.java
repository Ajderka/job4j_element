package ru.job4j.test;

public class Json {
    public static int calculate(int a, int n) {
        int result = a;
        for (int i = 1; i < n; i++) {
            result *= a;
        }
        return result;
    }
}
