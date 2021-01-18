package three;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private final String name;
    private final String surename;
    private final Gender gender;
    private final LocalDate birthDay;

    public Person(String name, String surename, Gender gender, LocalDate birthDay) {
        this.name = name;
        this.surename = surename;
        this.gender = gender;
        this.birthDay = birthDay;

    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period odRodjenjaDoSada = birthDay.until(now);
        int years = odRodjenjaDoSada.getYears();
        return years;
    }

    @Override
    public String toString() {
        return name + " " + surename + ", spol: "+ gender + " , datum rodjenja: " + birthDay;
    }
}

