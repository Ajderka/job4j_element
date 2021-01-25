package ru.job4j.test;

public class DegreeLoop {
    public static int sum(int num) {
        int sum = 0;
        while (num > 10) {
            sum += num % 10;
            num = num / 10;
        }
        return sum + num;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        System.out.println(sum(1234));
    }
}
