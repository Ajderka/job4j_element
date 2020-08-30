package ru.job4j.calculator;

public class ArgMethod {
    private static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", my age " + age);
    }

    public static void main(String[] args) {
        String name = "Ayder Hayredinov";
        int age = 33;
        ArgMethod.hello(name, age);
    }
}
