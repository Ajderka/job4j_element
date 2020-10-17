package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        Fact.calc(-1);
    }

    @Test
    public void whenTo5then120() {
        int res = Fact.calc(5);
        assertThat(res, is(120));
    }
}