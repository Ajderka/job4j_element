package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstname("Ayder");
        student.setLastname("Hayredinov");
        student.setGroup("A-14");
        student.setDate(new Date());

        System.out.println(student);
    }
}
