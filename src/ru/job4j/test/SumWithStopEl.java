package ru.job4j.test;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                for (int j = 0; j < i; j++) {
                    sum += data[j];
                }
                if (sum % 2 == 0) {
                    return sum;
                } else {
                    break;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(count(mass, 5));

    }
}