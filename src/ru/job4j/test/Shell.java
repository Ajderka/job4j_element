package ru.job4j.test;

public class Shell {
    String str = "/";
    String[] mass = new String[6];

    public void cd(String path) {
        String[] split = path.split("/");
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("..") && i != 0) {
                mass[i] = "";
                mass[i - 1] = "";
            } else if (split[i].equals("..") && i == 0) {
                mass[i] = "";
                break;
            }
            mass[i] = split[i];
        }
    }

    public String pwd() {
        for (int i = 0; i < mass.length; i++) {
            str += str + mass[i] + "/";
        }
        return str;
    }
}
