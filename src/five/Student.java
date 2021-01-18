package five;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private String surename;

    public Student(int id, String name, String surename) {
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
        return
                id + ": name: " + name + ", surename: " + surename;
    }

}
