package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] input = new int[] {4, 1, 6, 2, 5, 3, 8, 7};
        int[] result = turn.back(input);
        int[] expect = new int[] {7, 8, 3, 5, 2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithNotEvenAmountOfElementsThenTurnedArray() {
        Turn turn = new Turn();
        int[] input = new int[] {4, 3, 2, 1, 6, 7, 8};
        int[] result = turn.back(input);
        int[] expect = new int[] {8, 7, 6, 1, 2, 3, 4};
        assertThat(result, is(expect));
    }
}