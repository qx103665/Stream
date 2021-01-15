package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test01 {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("F:\\plane.txt");

            BufferedReader br=new BufferedReader(fileReader);

            String line="";//读一行
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
