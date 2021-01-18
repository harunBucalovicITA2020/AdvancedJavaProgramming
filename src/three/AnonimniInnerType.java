package three;

public class AnonimniInnerType {
    public static void main(String[] args) {
        PersonChecker personChecker = new PersonChecker() {
            @Override
            public boolean checkPerson(Person person) {
                System.out.println("Ispiši bilo šta");
                return false;
            }
        };

    }
}
