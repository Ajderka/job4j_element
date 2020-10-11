package ru.job4j.oop.vehicle;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поехали на поезде");
    }
}
