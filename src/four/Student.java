package four;

import java.time.LocalDate;
import java.time.Period;

/**
 * <li>MORAM OVERRAJDATI METODU TO STRING IZ SUPER KLASE A TO JE JAVA.LANG.OBJECT KLASA </li>
 * AKO TO NE URADIM POZIVACE SE TO STRING METODA OBJECT KLASE KOJA CE MI KAO ISPIS SLATI MEMORIJSKU LOKACIUJU,
 * A NE PODATKE NA TIM LOKACIJAMA KOJE MENI USTVARI TREBAJU!
 */

public class Student {
    private final String name;
    private final String surename;
    private final LocalDate birthday;
    private final Gender gender;

    public Student(String name, String surename, Gender gender, LocalDate birthday) {
        this.name = name;
        this.surename = surename;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return
                "name :'" + name + '\'' +
                ", surename :' " + surename + '\'' +
                ", birthday : " + birthday +
                ", gender : " + gender ;

    }
    public int getAge(){
        LocalDate now = LocalDate.now();
        Period yearsUntillNow = birthday.until(now);
        int years = yearsUntillNow.getYears();
        return years;
    }
}
