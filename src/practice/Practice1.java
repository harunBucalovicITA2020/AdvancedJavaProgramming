package practice;

public class Practice1 {
    public static void main(String[] args) {
        int number = divideBy(2);
        System.out.println(number);
        System.out.println(divideBy(5));
        System.out.println( multiplyBy(3));



    }

    static int divideBy(int number) {
        int broj = 50;
        int rezultat = broj / number;
        return rezultat;
    }
    static int multiplyBy(int number){
        int broj = 4;
        int rezultat = broj*number;
        return rezultat;
    }

}
