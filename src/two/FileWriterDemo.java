package two;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileWriterDemo {

    ArrayList<String> osobe = new ArrayList<>();

    public FileWriterDemo() {
        for (int i = 0; i < 1; i++) {
            osobe.add(0, "Irfan");
            osobe.add(1, "Faruk");
            osobe.add(2, "Anesa");
            osobe.add(3, "Harun");
        }


    }

    public void writerOfFile() {
        PrintWriter printIntoFile = null;
        try {
            FileWriter writerOfFile = new FileWriter("imena.txt");
            printIntoFile = new PrintWriter(writerOfFile);
            for (int i = 0; i < osobe.size(); i++) {
                printIntoFile.println("Osoba na poziciji : " + i + ", zove se " + osobe.get(i));

            }
        } catch (IOException e) {
            System.err.println("Problem je : " + e.getMessage());
        } finally {
            if (printIntoFile != null) {
                printIntoFile.close();
            }
        }

    }

    public void readerOfFile() {
        try (Scanner skener = new Scanner(new FileInputStream("imena.txt"))) {
            while (skener.hasNext()) {
                // System.out.println(skener.nextLine());
                String line = skener.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e1) {
            System.err.println("Greska : " + e1.getMessage());
        }
    }
}
