package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNumeric {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-11);
        list.add(13);
        list.add(-12);
        list.add(1);
        list.add(-2);
        list.add(3);
        list.add(-5);
        List<Integer> list1 = list.stream()
                .filter(x -> x > 0)
                .collect(Collectors.toList());
        for (Integer s : list1) {
            System.out.println(s);
        }
    }
}
