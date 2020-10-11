package ru.job4j.test.insta;

public abstract class AbsB {
    int stop;
    boolean start;

    boolean begin(boolean bool) {
        return start;
    }

    abstract char ret(int i);
}
