package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left < right ? right : left;
    }

    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        return result > third ? result : third;
    }
}
