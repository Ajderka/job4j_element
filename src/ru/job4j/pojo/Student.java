package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String firstname;
    private String lastname;
    private String group;
    private Date date;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{"
                + "firstname='" + firstname + '\''
                + ", secondname='" + lastname + '\''
                + ", group='" + group + '\''
                + ", date=" + date
                + '}';
    }
}
