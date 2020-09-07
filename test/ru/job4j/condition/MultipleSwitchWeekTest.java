package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMonThenNumberOne() {
        int i = MultipleSwitchWeek.numberOfDay("Monday");
        assertThat(i, is(1));
    }

    @Test
    public void whenNotWeekThenZero() {
        int i = MultipleSwitchWeek.numberOfDay("Ajderka");
        assertThat(i, is(0));
    }
}