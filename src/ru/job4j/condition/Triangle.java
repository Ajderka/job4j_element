package ru.job4j.condition;

public class Triangle {
    private final double ab;
    private final double ac;
    private final double bc;

    public Triangle(final Point a, final Point b, final Point c) {
        this.ab = a.distance(b);
        this.ac = a.distance(c);
        this.bc = b.distance(c);
    }

    public boolean exist() {
        return (ab + ac) > bc && (ab + bc) > ac && (ac + bc) > ab;
    }

    public double period() {
        return (ab + ac + bc) / 2;
    }

    public double area() {
        return Math.sqrt((period() - ab) * (period() - bc) * (period() - ac));
    }
}
