package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = 0;
        for (String s : value) {
            if (s.equals(key)) {
                return rsl;
            }
            rsl++;
        }
        if (rsl >= value.length) {
            throw new ElementNotFoundException("Нет такого элемента");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            FindEl.indexOf(new String[]{"asd", "zxc", "qwe"}, "asd");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
