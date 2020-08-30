package ru.job4j.condition;

public class Point {
    private static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(3, 22, 3, 4);
        System.out.println("result (3, 22) to (3, 4) " + result1);
        double result2 = Point.distance(12, 234, 22, 123);
        System.out.println("result (12, 234) to (22, 123) " + result2);
    }
}
