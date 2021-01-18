package three;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;

/**
 * <li>Vezano za liniju 25:</li>
 * moze bez .toString(); , jer se ona automatski pozove.
 * Mi moramo overrajdati metodu toString() od super class(Object), jer u suprotnom nam šalje memorijsku lokaciju, a ne vrijednosti.
 *
 * <li>VEzano za liniju 23:</li>
 * prije java 8 nije postoja LAMDA operator koji se koristi za kreiranje objekata tipa funkcionalnog interfejsa!
 * u tu svrhu su postojali tzv anonimus inner type
 */

public class PersonExecutor {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        List<Person> personList = personDAO.readPersonList();
        System.out.println("C++ način:");
        printPersons(personList);
        System.out.println("ENHANCED način:");
        printPersonsEnhanced(personList);
/*
        PersonChecker personChecker = new PersonChecker() {
            @Override
            public boolean checkPerson(Person person) {
                System.out.println("Ispiši bilo šta");
                return false;
            }
        };
        personChecker.checkPerson(personList.get(1));

        PersonChecker personChecker = (Person p) -> { // ili jos krace ... -> true;  zagrada!
            return true;                              //bez bloka koda koji sadrzi return true; unutar viticastih
        };
        boolean ceker = personChecker.checkPerson(personList.get(2)); // zato sto nema nista unutar metode
        System.out.println(ceker);
        //OVO KREIRAMO UNUTAR TIJELA METODE
 */
        System.out.println("FUNCTIONAL STYLE:");
        printPersonFunctionalStyle(personList);
        System.out.println("PUNOLJETNI:");
        printAdaults(personList);
        System.out.println("PUNOLJETNI SA PARAMETROM int age :");
        olederThen(personList, 18);
        System.out.println("MALOLJETNI:");
        printMinors(personList);
        System.out.println("MALOLJETNI SA PARAMETROM int age :");
        youngeThen(personList,18);
        System.out.println("SPISAK MUŠKIH OSOBA:");
        printWithGender(personList,Gender.MALE);
        System.out.println("SPISAK ŽENSKIH OSOBA:");
        printWithGender(personList,Gender.FEMALE);
    }

    // C++ petlja
    static void printPersons(List<Person> listaPersona) {
        for (int i = 0; i < listaPersona.size(); i++) {
            Person person = listaPersona.get(i);
            System.out.println(person.toString());
        }

    }

    // Enhanced for loop
    static void printPersonsEnhanced(List<Person> listaPersona) {
        for (Person person : listaPersona) {
            System.out.println(person);
        }

    }

    static void printPersonFunctionalStyle(List<Person> listaPersona) {
        Consumer<Person> consumer = (Person p) -> System.out.println(p);
        listaPersona.forEach(consumer);
    }

    static void printAdaults(List<Person> punoljetneOsobe) {
        for (Person p : punoljetneOsobe) {
            if (p.getAge() >= 18) {
                System.out.println(p);
            }
        }
    }

    static void printMinors(List<Person> maloljetneOsobe) {
        for (Person p : maloljetneOsobe) {
            if (p.getAge() < 18) {
                System.out.println(p);
            }
        }
    }

    static void olederThen(List<Person> punoljetni, int age) {
        for (Person p : punoljetni) {
            if (p.getAge() >= age) {
                System.out.println(p);
            }
        }
    }

    static void youngeThen(List<Person> maloljetni, int age) {
        for (Person p : maloljetni) {
            if (p.getAge() < age) {
                System.out.println(p);
            }
        }
    }
    static void printWithGender(List<Person> listaOsoba, Gender spol){
        for(Person p : listaOsoba){
            if(p.getGender().equals(spol)){
                System.out.println(p);
            }
        }
    }

}