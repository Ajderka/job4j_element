package ru.job4j.test;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        double win = percent * prize;
        if (win <= pay) {
            return 0;
        } else {
            return (int) win - pay;
        }
    }
}
