package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("F:\\plane.txt");
            int a;
            int b = 0;
            while ((a = fileReader.read()) != -1) {
                b++;
                System.out.println((char) a);
            }
            System.out.println(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
