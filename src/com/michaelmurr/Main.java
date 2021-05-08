package com.michaelmurr;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File folder = new File("PseudoFiles");
        folder.mkdir();

        int i = 0;
        int amountOfFiles = 10000;
        while (i <= amountOfFiles) {
            String counter = Integer.toString(i);
            File file = new File("PseudoFiles\\testfile" + counter + ".txt");
            try {
                file.createNewFile();
                FileWriter writer = new FileWriter("PseudoFiles\\testfile" + counter + ".txt");
                writer.write("Lorem Ipsum " + counter);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
