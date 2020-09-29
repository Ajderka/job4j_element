package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void period() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        assertThat(rsl, closeTo(8, 0.001));
    }

    @Test
    public void period1() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        Point c = new Point(1, 1);
        Triangle triangle = new Triangle(a, b, c);
        assertFalse(triangle.exist());
    }
}