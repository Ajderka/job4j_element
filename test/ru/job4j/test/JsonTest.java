package ru.job4j.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class JsonTest {
    @Test
    public void test() {
        assertEquals(4, Json.calculate(2, 2));
        assertEquals(9, Json.calculate(3, 2));
        assertEquals(3, Json.calculate(3, 1));
        assertEquals(128, Json.calculate(2, 7));
    }

}