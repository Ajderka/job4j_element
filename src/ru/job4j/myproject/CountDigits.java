package ru.job4j.myproject;

import java.util.HashMap;
import java.util.Map;

public class CountDigits {
    private Map<Integer, Integer> digits = new HashMap<>();
    private char[] bits; //Bit values are specified in the decimal numeric base.

    public CountDigits() {
        for (int i = 0; i < 10; i++) {
            digits.put(i, 0);
        }
    }

    public void count(int numberOfApartments) {
        bits = Integer.valueOf(numberOfApartments).toString().toCharArray();
        for (int i = 0; i < bits.length; i++) {
            sumDigitsInBitness(i);
        }
        System.out.println(digits);
    }

    private void sumDigitsInBitness(int bitPosition) {
        for (int i = 0; i < 10; i++) {
            digits.put(i, sum(bitPosition, i) + digits.get(i));
        }
    }

    private int sum(int bitPosition, int digit) {
        int result = 0;
        int bitness = (int) Math.pow(10, bits.length - bitPosition - 1);
        int leftPart = trimNumber(bitPosition, "right");
        int rightPart = trimNumber(bitPosition, "left");
        int remainder = digit <= (bits[bitPosition] - '0') ? rightPart + 1 : 0;
        int i = (digit == 0 && leftPart != 0) ? 1 : 0;
        if ((digit != 0
                && (digit <= (bits[bitPosition] - '0') || (digit > (bits[bitPosition] - '0') && (bitPosition != 0)))
        )
                || (digit == 0 && leftPart != 0)
        ) {
            result = (leftPart - i) * bitness + remainder;
        }
        return result;
    }

    private int trimNumber(int bitPosition, String discardedPart) {
        StringBuilder cutPart = new StringBuilder();
        if (discardedPart.equals("right")) {
            for (int i = 0; i < bitPosition; i++) {
                cutPart.append(bits[i]);
            }
            if (cutPart.toString().equals("")) {
                cutPart.append(0);
            }
        }
        if (discardedPart.equals("left")) {
            for (int i = bitPosition + 1; i < bits.length; i++) {
                cutPart.append(bits[i]);
            }
            if (cutPart.toString().equals("")) {
                cutPart.append(0);
            }
        }
        return Integer.parseInt(cutPart.toString());
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            new CountDigits().count(13);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }
}
