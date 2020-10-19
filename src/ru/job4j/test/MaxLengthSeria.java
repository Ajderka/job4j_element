package ru.job4j.test;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int count = 1;
        int temp = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                count++;
                if ((array.length - 2) == i && count > temp) {
                    return count;
                }
            } else if (temp < count) {
                temp = count;
                count = 1;
            } else {
                count = 1;
            }

        }
        return temp;
    }
}
