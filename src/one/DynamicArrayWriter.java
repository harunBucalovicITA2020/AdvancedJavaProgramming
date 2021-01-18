package one;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class DynamicArrayWriter {

    private ArrayList<Integer> lista = new ArrayList<>();

    public DynamicArrayWriter() {
        for (int i = 0; i <= 10; i++) {
            lista.add(i);
        }

    }

    public void writeListInotoFile() {
        PrintWriter out = null;
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            out = new PrintWriter(fileWriter);
            for (int i = 0; i < lista.size(); i++) {
                out.println("Value of : " + i + " is : " + lista.get(i));
            }
        } catch (EOFException exception) {
            System.out.println("IO se desio " + exception.getMessage());

        } catch (Exception exception) {

        } finally {
            if (out != null) {
                out.close();
            }

        }
    }

    public void readFile() {
        try (FileReader fileReader = new FileReader("output.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String list =  null;
            while ((list = bufferedReader.readLine()) != null){
                System.out.println(list);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "pogrešno uneseno ime fajla");
        } catch (IOException e1) {
            System.err.println(e1.getMessage());
        }
    }

}


