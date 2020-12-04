package ru.job4j.test.second;

public class HighTemp {
    private int hTemp;

    public HighTemp(int ht1) {
        this.hTemp = ht1;
    }

    //приходит экземпляр для сравнения
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    boolean lessThenTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}
