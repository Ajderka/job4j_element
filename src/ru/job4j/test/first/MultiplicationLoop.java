package ru.job4j.test.first;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int multiplicated = a;
        for (int i = a + 1; i <= b; i++) {
            multiplicated = multiplicated * i;
        }
        return multiplicated;
    }
}
