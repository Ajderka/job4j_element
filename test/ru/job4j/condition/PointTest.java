package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double result = a.distance(b);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void when34to56then282() {
        double expected = 2.82;
        Point a = new Point(3, 4);
        Point b = new Point(5, 6);
        double result = a.distance(b);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void when66to54then223() {
        double expected = 2.23;
        Point a = new Point(6, 6);
        Point b = new Point(5, 4);
        double result = a.distance(b);
        Assert.assertEquals(expected, result, 0.01);
    }
}