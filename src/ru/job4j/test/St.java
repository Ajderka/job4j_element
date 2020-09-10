package ru.job4j.test;

public class St {
    public static boolean eq(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }
        boolean result = false;
        char[] massLeft = left.toCharArray();
        char[] massRight = right.toCharArray();
        for (int i = 0; i < massLeft.length; i++) {
            result = false;
            for (int j = 0; j < massRight.length; j++) {
                if (massLeft[i] == massRight[j]) {
                    result = true;
                    massRight[j] = '0';
                    break;
                }
            }
            if (!result) {
                return false;
            }
        }
        return result;
    }
}
