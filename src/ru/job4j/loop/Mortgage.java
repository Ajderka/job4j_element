package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, int percent) {
        int year = 0;
        while (amount < salary) {
            salary = salary - amount;
            salary = salary + salary * percent / 100;
            year++;
        }
        return ++year;
    }
}