package ru.job4j.oop.vehicle;

public class Aircraft implements Vehicle {
    @Override
    public void move() {
        System.out.println("Полетели");
    }
}
