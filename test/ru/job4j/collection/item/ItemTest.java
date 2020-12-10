package ru.job4j.collection.item;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void whenWeSortDirectly() {
        List<Item> items = new ArrayList<>(List.of(
                new Item("Book", 12),
                new Item("Pen", 7),
                new Item("Bag", 3),
                new Item("Table", 5),
                new Item("Note", 1)));
        items.sort(new SortById());
        List<Item> items2 = List.of(
                new Item("Note", 1),
                new Item("Bag", 3),
                new Item("Table", 5),
                new Item("Pen", 7),
                new Item("Book", 12));
        assertThat(items, is(items2));
    }

    @Test
    public void whenWeSortReverse() {
        List<Item> items = new ArrayList<>(List.of(
                new Item("Book", 12),
                new Item("Pen", 7),
                new Item("Bag", 3),
                new Item("Table", 5),
                new Item("Note", 1)));
        items.sort(new SortByReverseId());
        List<Item> items2 = List.of(
                new Item("Book", 12),
                new Item("Pen", 7),
                new Item("Table", 5),
                new Item("Bag", 3),
                new Item("Note", 1));
        assertThat(items, is(items2));
    }
}