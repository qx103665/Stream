package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class mp3_a_b_cut {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("F:\\c.mp3");
            byte buff[]=new byte[1024];
            String mp3Name[]={"a-cut.mp3","b-cut.mp3"};
            for(int i=0;i<mp3Name.length;i++){
                FileInputStream fis=new FileInputStream("F:\\"+mp3Name[i]);
                int a=0;
                while((a=fis.read(buff))!=-1){
                    fos.write(buff,0,a);
                }
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
