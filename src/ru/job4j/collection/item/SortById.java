package ru.job4j.collection.item;

import java.util.Comparator;

public class SortById implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
