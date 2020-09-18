package ru.job4j.array;

public class Sequence {
    public static void main(String[] args) {
        int[][] massive = new int[3][3];
        massive[0][0] = 1;
        massive[0][1] = 2;
        massive[0][2] = 3;
        massive[1][0] = 4;
        massive[1][1] = 5;
        massive[1][2] = 6;
        massive[2][0] = 7;
        massive[2][1] = 8;
        massive[2][2] = 9;

        for (int[] mas : massive) {
            for (int m : mas) {
                System.out.println(m);
            }
        }
    }
}
