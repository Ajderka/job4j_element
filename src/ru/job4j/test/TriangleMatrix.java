package ru.job4j.test;

public class TriangleMatrix {
    public static int[][] rows(int count) {
        int x = 1;
        int[][] triangle = new int[count][];
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = x++;
            }
        }
        return triangle;
    }
}
