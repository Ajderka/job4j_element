package ru.job4j.test;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BonusCupCoffeeTest {

    @Test
    public void whenPut9And3thenWeHave12() {
        int n = 13;
        assertThat(BonusCupCoffee.countCup(10, 3), is(n));
    }

}