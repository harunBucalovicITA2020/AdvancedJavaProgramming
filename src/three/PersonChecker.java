package three;

/**
 * <li>Funkcionalni interfejs može imati:</li>
 * 1. polja i to samo public static final
 * 2. jednu i samo jednu apstraktnu metodu
 * 3. druge metodete tipa void ili nekog drugog povratnog tipa
 * 4. defaultne metode koje su u potpunosti definirane. npr. default void checkPerson(Person person){System.out.println(person);}
 *
 * <li>NE može imati:</li>
 * 1. konstruktor
 * 2. više apstraktnih metoda
 * <p>
 * FUNKCIONALNI INTERFEJSI SE NAJBOLJE KOMBINUJU SA STREAMING API
 * <p>
 * u liniji 18 mozemo napisati i public abstract boolean
 */

@FunctionalInterface
public interface PersonChecker {
    boolean checkPerson(Person person);
}
