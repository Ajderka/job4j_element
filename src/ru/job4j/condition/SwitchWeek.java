package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        if (day < 1 || day > 7) {
            return "Ошибка";
        }
        String name;
        switch (day) {
            case 1:
                name = "Понедельник";
                break;
            case 2:
                name = "Вторник";
                break;
            case 3:
                name = "Среда";
                break;
            case 4:
                name = "Четверг";
                break;
            case 5:
                name = "Пятница";
                break;
            case 6:
                name = "Суббота";
                break;
            default:
                name = "Воскресенье";
                break;
        }
        return name;
    }
}