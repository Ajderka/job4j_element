package ru.job4j.collection.lexsort;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int o1int = Integer.parseInt(o1.split("\\.")[0]);
        int o2int = Integer.parseInt(o2.split("\\.")[0]);
        return Integer.compare(o1int, o2int);
    }
}
