package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = x -> x.getAddress().equals(key)
                || x.getName().equals(key)
                || x.getPhone().equals(key)
                || x.getSurname().equals(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person p : persons) {
            if (combine.test(p)) {
                result.add(p);
            }
        }
        return result;
    }
}
