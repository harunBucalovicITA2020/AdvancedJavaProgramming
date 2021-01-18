package practice;

/**
 * KADA HOCU DA NAPRAVIM MATRICU POPUNJENU NULAMA !!
 * 1.mogu smanjivati broj redova ili broj kolona , tako sto cu mjesto ".lenght" koristiti  broj
 * kao sto se vidi u donjem primjeru
 * 2.redove predstavlja prva [] uglasta zagrada, a kolone druga int [red][kolona] !!!
 * 3.vanjska petlja kontrolise redove, a unutarnja petlja kolone!!!
 */

public class Matrica {
    public static void main(String[] args) {
        int[][] matrica = new int[5][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < matrica.length; j++)
                System.out.print(matrica[i][j] + " ");
            System.out.println();
        }
    }
}
