package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when1thenMon() {
        String str = SwitchWeek.nameOfDay(1);
        assertThat(str, is("Понедельник"));
    }

    @Test
    public void when2thenTue() {
        String str = SwitchWeek.nameOfDay(2);
        assertThat(str, is("Вторник"));
    }

    @Test
    public void when3thenWed() {
        String str = SwitchWeek.nameOfDay(3);
        assertThat(str, is("Среда"));
    }

    @Test
    public void when4thenThu() {
        String str = SwitchWeek.nameOfDay(4);
        assertThat(str, is("Четверг"));
    }

    @Test
    public void when5thenFri() {
        String str = SwitchWeek.nameOfDay(5);
        assertThat(str, is("Пятница"));
    }

    @Test
    public void when6thenSat() {
        String str = SwitchWeek.nameOfDay(6);
        assertThat(str, is("Суббота"));
    }

    @Test
    public void when7thenSun() {
        String str = SwitchWeek.nameOfDay(7);
        assertThat(str, is("Воскресенье"));
    }

    @Test
    public void when23thenError() {
        String str = SwitchWeek.nameOfDay(23);
        assertThat(str, is("Ошибка"));
    }
}