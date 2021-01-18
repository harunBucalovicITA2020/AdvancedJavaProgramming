package three;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    List<Person> personList = new ArrayList<>(); // trebalo bi da je ovo polje ove klse, kao npr String nesto = "nesto";, int broj = 23;

    public List<Person> readPersonList() {
        personList.add(new Person("Anesa", "Nuhanović", Gender.FEMALE, LocalDate.of(1990, 10, 15)));
        personList.add(new Person("Harun", "Bucalović", Gender.MALE, LocalDate.of(1986, 8, 21)));
        personList.add(new Person("Irfan", "Bičakčić", Gender.MALE, LocalDate.of(2012, 7, 20)));
        personList.add(new Person("Faruk", "Bičakčić", Gender.MALE, LocalDate.of(2013, 9, 7)));
        personList.add(new Person("Ruzmira", "Bucalović", Gender.FEMALE, LocalDate.of(1953, 11, 22)));
        personList.add(new Person("Senad", "Bucalović", Gender.MALE, LocalDate.of(1958, 8, 21)));
        personList.add(new Person("Aida", "Bičakčić", Gender.FEMALE, LocalDate.of(1984, 5, 22)));
        personList.add(new Person("Emir", "Bičakčić", Gender.MALE, LocalDate.of(1979, 2, 13)));
        return personList;
    }
}
