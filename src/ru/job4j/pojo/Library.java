package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("CleanCode", 551);
        Book book2 = new Book("JavaMachine", 1255);
        Book book3 = new Book("GIT", 324);
        Book book4 = new Book("SQL", 545);
        Book[] lib = new Book[4];
        lib[0] = book1;
        lib[1] = book2;
        lib[2] = book3;
        lib[3] = book4;
        for (Book book : lib) {
            System.out.println(book.getNameBook() + " - " + book.getNumberOfPages() + ";");
        }
    }
}
