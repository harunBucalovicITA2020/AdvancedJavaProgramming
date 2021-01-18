package practice;

/**
 * BITNO JE ISTACI DA SE VRIJEDNOSTI UNESENE U MATRICU NE MIJENJAJU I NE POMJERUJU SA SVOJIH INDEXA
 * AKO SKRATIM MATRICU ZA ODREDJENI BROJ KOLONA PRILIKOM ISPISA U KONZOLU DOBICU VRIJEDNOSTI NA TIM INDEXIMA
 * BEZ DA SU VRIJEDNOSTI NPR PRVOG REDA PRESLE I POPUNILE DRUGI RED, NA NACIN DA ISTISNU UNESENE VRIJEDNOSTI NA INDEXIMA
 * NAREDNOG REDA!
 */

public class Matrica2 {
    public static void main(String[] args) {
        int[][] matric2 = new int[5][5];
        int k = 0;
        //KREIRANJE MATRICE i popunjavanje
        for (int i = 0; i < matric2.length; i++) {
            for (int j = 0; j < matric2.length; j ++) {
                matric2[i][j] = k;
                k++;
            }
        }
        //PRINTANJE MATRICE na nacin da biramo koliko redova hocemo i koje duzine(duzina redova su ustvari broj kolona)
        for (int i = 0; i < 3; i++) { //max broj redova matrice je 5, ja sam printao samo 3
            for (int j = 0; j < 3; j ++) // max broj kolona je 5, ja sam printao 3 i tako dao zadao duzinu redova
                System.out.print(matric2[i][j] + " ");
            System.out.println();

        }

    }
}
