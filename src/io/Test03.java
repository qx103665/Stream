package io;

import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
       try {
            FileWriter fileWriter=new FileWriter("F:\\test.txt");
            fileWriter.write('��');
            /*
            ��ͬ��ϵͳ���кͻس���һ����
            window ϵͳ   \r\n
            Macϵͳ  \r
            Unixϵͳ  \n
            <��\r\n��"13"��"10">
             */
            fileWriter.write('\r');
            fileWriter.write('\n');

            fileWriter.write('��');
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
