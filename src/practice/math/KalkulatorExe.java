package practice.math;

public class KalkulatorExe {
    public static void main(String[] args) {
        Kalkulator calculateSum = new Kalkulator();
        double sumaPrvaMetoda = calculateSum.sum(12.2, 13.8);
        System.out.println(sumaPrvaMetoda);
        Kalkulator calculateSubtraction = new Kalkulator();
        double razlikaDrugaMetoda = calculateSubtraction.subtraction(9.0,11.0);
        System.out.println(razlikaDrugaMetoda);
        Kalkulator calculateSubtractionCopy = new Kalkulator();
        double kopiranaMetodaRazlika = calculateSubtractionCopy.subtraction("Harun",15.0,10.7);
        System.out.println(kopiranaMetodaRazlika);

    }
}
