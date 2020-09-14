package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        boolean prime = false;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && number != i) {
                break;
            } else if (number % i == 0) {
                prime = true;
                break;
            }
        }
        return prime;
    }
}