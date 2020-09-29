package ru.job4j.test;

import java.util.Scanner;

public class Help1 {

    public static void main(String[] args) {
        double n;
        double a = 1;

        Scanner in = new Scanner(System.in);

        while ((n = in.nextDouble()) != 0) {
            a *= n;
        }
        System.out.println(a);
        in.close();
    }
}
