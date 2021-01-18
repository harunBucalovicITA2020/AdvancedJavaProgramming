package practice.math;


public class Kalkulator {


    public double sum(double... brojevi) {
        double suma = 0.0;
        for (double dec : brojevi) {
            suma += dec;
        }
        return suma;
    }

    public double subtraction(double... brojevi) {
        double razlika = 0.0;
        for (int i = 0; i < brojevi.length; i++) {
            razlika = -razlika +- brojevi[i];
        }
        return razlika;
    }
    public double subtraction(String name, double... numbers){
               return subtraction(numbers);
        }

}
