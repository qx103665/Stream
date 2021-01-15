package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_and_Write {
    public static void main(String[] args) {
        /*
        先读再写
         */
        FileReader fr=null;
        FileWriter fw=null;
        try {
            fr=new FileReader("E:\\plane.txt");
            fw=new FileWriter("F:\\ttt.txt");
            int a=0;
            while((a=fr.read())!=-1){
                System.out.println((char) a);
                fw.write(a);
            }
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}