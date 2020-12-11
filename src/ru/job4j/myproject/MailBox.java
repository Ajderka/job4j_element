package ru.job4j.myproject;

import java.util.HashMap;
import java.util.Map;

public class MailBox {
    public static Map<Integer, Integer> countingNumbers(int amount) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = 1; i <= amount; i++) {
            for (int j = i; j > 0; j /= 10) {
                result.compute(j % 10, (k, v) -> v == null ? 1 : v + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Map<Integer, Integer> except = countingNumbers(288);
        except.forEach((key, value) -> System.out.println(key + " - " + value));
        long endTime = System.currentTimeMillis();
        System.out.println("Затраченное время - " + (endTime - startTime) + "ms");
    }
}
