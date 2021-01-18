package six;

import java.sql.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PersonTester {
    public static void main(String[] args) {

        PersonDAO personDAO = new PersonDAO();
        List<Person> personList = personDAO.getAllPersons();
        System.out.println(personList.get(0));
        processPerson(personList,p->p.getId()<3,person -> System.out.println("Sve osobe iz liste ciji je id manji od 3 : "  + person));


    }

    static void processPerson(List<Person> lista, Predicate<Person> predicate, Consumer<Person>consumer) {
        for (Person p : lista) {
           if(predicate.test(p)){
               consumer.accept(p);
           }
        }
    }

}
