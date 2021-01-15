package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) {
        try {
            byte buff[]=new byte[1024];
            FileInputStream fis=new FileInputStream("E:\\河池学院实训\\2021-01-14\\软件系统分层.png");
            FileOutputStream fos=new FileOutputStream("F:\\软件系统分层.png");
            int a=0;
            /*
            read(buff)：一次性从输入流中读取1024个字节，并放入buff数组
             */
            while((a=fis.read(buff))!=-1){
                System.out.println(a);
                fos.write(buff,0,a);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}