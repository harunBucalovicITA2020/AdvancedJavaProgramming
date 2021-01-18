package one;

public class Exeptions {
    public static void main(String[] args) {

        double number = devideBy(17);



    }
    public static double devideBy(int number) {

        double rezult = 0;
        if (number != 0) {
            double broj = 100;
            rezult = broj / number;
            System.out.println(rezult);

        }
        return rezult;
    }
}
