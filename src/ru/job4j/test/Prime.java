package ru.job4j.test;

public class Prime {

    //самый изящный способ определения простого числа
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 31;

        if (num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("elementary number");
        } else {
            System.out.println("not elementary number");
        }
    }
}
