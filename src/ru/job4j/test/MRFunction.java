package ru.job4j.test;

import java.util.function.Function;

public class MRFunction {
    public static Function<Double, Double> apply() {
        Function<Double, Double> math = Math :: sqrt;
        return math;
    }
}
