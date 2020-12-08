package ru.job4j.stream.flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    private List<Integer> listsMatrixToList(List<List<Integer>> matrix) {
        return matrix.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    private List<Integer> massiveMatrixToMassive(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FlatMap flatMap = new FlatMap();
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        System.out.println(flatMap.listsMatrixToList(matrix));
        Integer[][] integers = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println(flatMap.massiveMatrixToMassive(integers));
    }
}