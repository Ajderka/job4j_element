package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Wolfer wolfer = new Wolfer();
        Fox fox = new Fox();
        Ball ball = new Ball();
        hare.eat(ball);
        ball.run(hare);
        wolfer.eat(ball);
        ball.run(wolfer);
        fox.eat(ball);
    }
}
