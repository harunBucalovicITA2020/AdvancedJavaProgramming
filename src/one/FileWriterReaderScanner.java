package one;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileWriterReaderScanner {

    private ArrayList<Integer> numbersList = new ArrayList<>();
    private int numbers;

    public FileWriterReaderScanner() {
        for (int i = 0; i <=10; i++) {
            numbersList.add(i);
        }
    }

    public void listaTxt() {
        PrintWriter printWriter = null;
        try {
            FileWriter fileWriter = new FileWriter("lista.txt");
            printWriter = new PrintWriter(fileWriter);
            for (int i = 0; i <numbersList.size(); i++) {
                printWriter.println("vrijednost od : "+ i + " je " + numbersList.get(i));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage());
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }

        }
    }

    public  void readFile() {
        try(Scanner scanner= new Scanner(new FileInputStream("lista.txt"))) {
         while (scanner.hasNext()){
             System.out.println(scanner.nextLine());
         }
        }catch (FileNotFoundException e1){
         JOptionPane.showMessageDialog(null,e1.getMessage());
        }

        }



}
