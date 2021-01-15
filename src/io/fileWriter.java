package io;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("F:\\test.txt");
            for (int i = 0; i < 8192; i++) {
                fileWriter.write(97);
            }
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
