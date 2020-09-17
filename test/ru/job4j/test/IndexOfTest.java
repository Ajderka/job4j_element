package ru.job4j.test;


import org.junit.Test;

import static org.junit.Assert.*;

public class IndexOfTest {

    @Test
    public void whenNotContain() {
        assertEquals(-1, IndexOf.indexOf(
                new char[]{'a', 'b', 'c'},
                'd',
                1
        ));
    }

    @Test
    public void whenOrdinary() {
        assertEquals(3, IndexOf.indexOf(
                new char[]{'a', 'b', 'c', 'd'},
                'd',
                1
        ));
    }

    @Test
    public void whenByNumber() {
        assertEquals(6, IndexOf.indexOf(
                new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'd'},
                'd',
                2
        ));
    }

}