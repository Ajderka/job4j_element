package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Поехали");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Количество пассажиров - " + number);
    }

    @Override
    public int fillUp(int liters) {
        int res = liters * 25;
        System.out.println("Заправлено " + liters + " литров");
        return res;
    }

    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.go();
        bus.passengers(3);
        System.out.println("Цена : " + bus.fillUp(39));
    }
}
