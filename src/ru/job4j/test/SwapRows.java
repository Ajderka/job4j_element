package ru.job4j.test;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int[][] array = new int[data.length][];
        array[dst] = data[src];
        array[src] = data[dst];
        data[dst] = array[dst];
        data[src] = array[src];
    }
}
