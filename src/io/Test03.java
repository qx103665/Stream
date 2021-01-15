package io;

import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
       try {
            FileWriter fileWriter=new FileWriter("F:\\test.txt");
            fileWriter.write('河');
            /*
            不同的系统换行和回车不一样：
            window 系统   \r\n
            Mac系统  \r
            Unix系统  \n
            <用\r\n或"13"，"10">
             */
            fileWriter.write('\r');
            fileWriter.write('\n');

            fileWriter.write('池');
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
