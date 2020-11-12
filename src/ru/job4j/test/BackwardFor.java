package ru.job4j.test;

public class BackwardFor {
    public static void out(int m, int n) {
        for (int i = m; i > n; i--) {
            System.out.println(i);
        }
    }
}

//Нужно вывести числа от M до N. N не включено. M > N.