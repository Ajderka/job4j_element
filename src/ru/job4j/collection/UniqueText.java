package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = false;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>(Arrays.asList(origin));
        HashSet<String> check2 = new HashSet<>(Arrays.asList(text));
        if (check.equals(check2)) {
            return true;
        }
        return rsl;
    }
}
