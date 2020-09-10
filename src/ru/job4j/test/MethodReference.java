package ru.job4j.test;

import java.util.function.Consumer;

public class MethodReference {

    public void applyByInstance() {
        MethodReference methodReference = new MethodReference();
        Consumer<String> consumerByInstance = (value) -> methodReference.consumerByInstance(value);
        consumerByInstance.accept("Hello");
    }

    public static void applyByClass() {
        Consumer<String> consumerByClass = (value) -> MethodReference.consumerByClass(value);
        consumerByClass.accept("Hello");
    }

    private void consumerByInstance(String input) {
        System.out.print("From instance: " + input);
    }

    private static void consumerByClass(String input) {
        System.out.print("From class: " + input);
    }

}

