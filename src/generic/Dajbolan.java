package generic;

import javax.swing.*;

public class Dajbolan {
    public static void main(String[] args) {
        String unesibroj = JOptionPane.showInputDialog("Unesi broj : ");
        int broj = Integer.parseInt(unesibroj);
        String unesiBroj2 = JOptionPane.showInputDialog("Unesi drugi broj : ");
        int broj2 = Integer.parseInt(unesiBroj2);

        int rezultat = 0;
       if(unesibroj !=null && unesiBroj2 != null){
           rezultat = broj + broj2;
           JOptionPane.showMessageDialog(null,rezultat);
       } else {
           String message = "Pogresan unos";
           JOptionPane.showMessageDialog(null,message);
       }

    }

}



