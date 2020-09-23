package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        this.load += another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery a = new Battery(60);
        Battery b = new Battery(35);
        System.out.println("a load " + a.load + " b load " + b.load);
        a.exchange(b);
        System.out.println("a load " + a.load + " b load " + b.load);
    }
}
