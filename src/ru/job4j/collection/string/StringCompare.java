package ru.job4j.collection.string;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        for (int i = 0; i < (Math.min(o1.length(), o2.length())); i++) {
            int compare = Character.compare(o1.charAt(i), o2.charAt(i));
            if (o1.length() < o2.length() && i == o1.length() - 1 && compare == 0) {
                return -1;
            } else if (o2.length() < o1.length() && i == o2.length() - 1 && compare == 0) {
                return 1;
            }
            if (compare == 0) {
                continue;
            }
            return compare;
        }
        return 0;
    }
/*  public int compare(String o1, String o2) {
      int result = 0;
      for (int i = 0; i < Math.min(o1.length(), o2.length()) && result == 0; i++) {
          result = o1.charAt(i) - o2.charAt(i);
      }
      return result == 0 ? o1.length() - o2.length() : result;
  }*/
}
