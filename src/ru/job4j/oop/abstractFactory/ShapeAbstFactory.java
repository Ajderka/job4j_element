package ru.job4j.oop.abstractFactory;

public interface ShapeAbstFactory {
    Shape createTriangle();

    Shape createRectangle();

  Shape createEmpty();
}
