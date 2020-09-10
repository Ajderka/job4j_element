package ru.job4j.test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import ru.job4j.test.St;

public class StTest {

    @Test
    public void whenEq() {
        assertThat(St.eq("Hello", "Hlloe"), is(true));
    }

    @Test
    public void whenNotEq() {
        assertThat(St.eq("Hello", "Halle"), is(false));
    }

    @Test
    public void whenNotMultiEq() {
        assertThat(St.eq("heloo", "hello"), is(false));
    }
}