package ru.job4j.oop.strategy;

public class Paint {
    public void draw(Shape shape) {
        System.out.print(shape.draw());
    }

    public static void main(String[] args) {
        Paint context = new Paint();
        Shape triangle = new Triangle();
        context.draw(triangle);
        Shape square = new Square();
        context.draw(square);
    }
}