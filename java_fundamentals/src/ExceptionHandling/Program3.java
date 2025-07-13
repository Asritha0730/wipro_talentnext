package ExceptionHandling;

import java.io.*;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) throws IOException {
        File file = new File("./sample.txt");

        // Create file if not exists
        if (!file.exists()) {
            file.createNewFile();
        }

       FileReader fr = new FileReader(file);
       
       int ascii;
       String text = new String();
       while((ascii = fr.read()) != -1) {
    	   text += String.valueOf((char)ascii);
    	   System.out.print((char)ascii);
       }
        fr.close();
        System.out.println(text);
    }
}
