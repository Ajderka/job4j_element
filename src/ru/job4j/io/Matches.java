package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private static int validationInput(int in) {
        Scanner input = new Scanner(System.in);
        while (in <= 0 || in > 3) {
            System.out.println("Неверный ввод. Введите число от 1 до 3!");
            in = Integer.parseInt(input.nextLine());
        }
        return in;
    }

    private static boolean isWin(int matches) {
        if (matches <= 0) {
            System.out.println("Игрок победил, поздравляем!");
            return true;
        }
        return false;
    }

    private static int turnPlayer(int math, int player) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игрок " + player + " тянет спичку. Выберите количество от 1 до 3");
        int in = Integer.parseInt(input.nextLine());
        math -= validationInput(in);
        return math;
    }

    private static void logic() {
        int math = 11;
        System.out.println("Начальное количество спичек - " + math);
        while (math > 0) {
            math = turnPlayer(math, 1);
            if (isWin(math)) {
                break;
            }
            System.out.println("Оставшееся количество спичек - " + math);
            math = turnPlayer(math, 2);
            if (isWin(math)) {
                break;
            }
            System.out.println("Оставшееся количество спичек - " + math);
        }
    }

    public static void main(String[] args) {
        Matches.logic();
    }
}
