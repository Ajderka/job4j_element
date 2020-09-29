package ru.job4j.condition;

public class Point {
    private final int x;
    private final int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return Math.sqrt(Math.pow((that.x - this.x), 2) + Math.pow((that.y - this.y), 2));
    }

    public double distance3d(Point that) {
        return Math.sqrt(Math.pow((that.x - this.x), 2) + Math.pow((that.y - this.y), 2) + Math.pow((that.z - this.z), 2));
    }

    public void info() {
        System.out.printf("Point[%s, %s, %s]%n", this.x, this.y, this.z);
    }
}
