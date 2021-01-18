package three;

/**
 * <li>OVDJE ĆU UZ KORISTENJE SAMO JEDNE FUNKCIJE ZAMIJENITI SVE FUNKICIJE KOJE SAM KORISTIO U PersonExecutor klasi</li>
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TesterLamda {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        List<Person> personList = personDAO.readPersonList();

        System.out.println("SVE OSOBE UNUTAR LISTE:");
        printPeople(personList, p -> true);

        System.out.println("MALOLJETNE OSOBE IZ LISTE:");
        printPeople(personList, p -> p.getAge() < 18);

        System.out.println("ŽENSKE OSOBE IZ LISTE:");
        printPeople(personList, p -> p.getGender().equals(Gender.FEMALE));

        System.out.println("MUŠKE OSOBE IZ LISTE:");
        printPeople(personList,person -> person.getGender().equals(Gender.MALE));

        System.out.println("KORIŠTENJE CONSUMERA:");
        processPeople(personList,p-> p.getAge()>18, p-> System.out.println(p));

    }

    static void printPeople(List<Person> list, PersonChecker checker) {
        for (Person p : list) {
            if (checker.checkPerson(p)) {
                System.out.println(p);
            }
        }
    }
    static void processPeople(List<Person> personList, PersonChecker personChecker, Consumer<Person> personConsumer){
        for(Person person: personList){
            if(personChecker.checkPerson(person)){
                personConsumer.accept(person);
            }
        }
    }

}
