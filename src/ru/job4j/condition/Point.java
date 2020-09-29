package ru.job4j.condition;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow((that.x - this.x), 2) + Math.pow((that.y - this.y), 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double result = a.distance(b);
        System.out.println("result (0, 0) to (2, 0) " + result);
        Point c = new Point(3, 22);
        Point d = new Point(3, 4);
        double result1 = c.distance(d);
        System.out.println("result (3, 22) to (3, 4) " + result1);
        Point e = new Point(12, 234);
        Point f = new Point(22, 123);
        double result2 = e.distance(f);
        System.out.println("result (12, 234) to (22, 123) " + result2);
    }
}
