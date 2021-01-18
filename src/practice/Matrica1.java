package practice;

/**
 * kada zelimo da popunimo matricu kreiranu po nasoj zelji koristimo `k`
 * `k` elemet dohvaca vrijednosti i smijesta ih u matricu
 */

public class Matrica1 {
    public static void main(String[] args) {
        int[][] matrica1 = new int[4][4];

        int k = 0;
        for (int i = 0; i < matrica1.length; i++)
            for (int j = 0; j < i + 1; j++) {
                matrica1[i][j] = k;
                k++;
            }
        for (int i = 0; i < matrica1.length; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print(matrica1[i][j] + " ");
                System.out.println();

        }
    }

}


