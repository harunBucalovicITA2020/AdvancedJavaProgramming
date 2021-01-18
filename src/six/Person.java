package six;

import java.util.List;

public class Person {
    private int id;
    private String name;
    private String surename;

    public Person() {
        return;
    }

    public Person(int id, String name, String surename) {
        this.id = id;
        this.name = name;
        this.surename = surename;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    @Override
    public String toString() {
        return id + ". " +
                " name: " + name +
                ", surename: " + surename;
    }
}
