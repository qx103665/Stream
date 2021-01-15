package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class b_cut_mp3 {
    public static void main(String[] args) {
        try {
            byte buff[]=new byte[1611508];
            FileInputStream fis=new FileInputStream("E:\\河池学院实训\\2021-01-14\\b.mp3");
            FileOutputStream fos=new FileOutputStream("F:\\b-cut.mp3");

            fis.skip(1611508);

            fis.read(buff);

            fos.write(buff);

            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
