package ru.job4j.test;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder();
        for (String st : s.split(" ")) {
            sb.append(st.toUpperCase().charAt(0));
        }
        return sb.toString();
    }
}
