package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        FileReader fileReader=null;
        try {
            fileReader=new FileReader("F:\\plane.txt");
            int a=fileReader.read();
            int b=fileReader.read();
            int c=fileReader.read();
            int d=fileReader.read();
            int e=fileReader.read();
            int f=fileReader.read();
            int g=fileReader.read();
            int h=fileReader.read();
            int i=fileReader.read();
            int j=fileReader.read();
            int k=fileReader.read();
            int l=fileReader.read();
            int m=fileReader.read();
            System.out.println((char) j);
            System.out.println(k);
            System.out.println(l);
            System.out.println((char) m);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
