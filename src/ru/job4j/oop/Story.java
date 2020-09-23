package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl masha = new Girl();
        Wolf wolf = new Wolf();
        wolf.eat(masha);
        masha.help(petya);
        petya.kill(wolf);

    }
}
