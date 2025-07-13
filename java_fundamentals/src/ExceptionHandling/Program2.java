package ExceptionHandling;

import java.io.*;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) throws IOException {
        File file = new File("./sample.txt");

        // Create file if not exists
        if (!file.exists()) {
            file.createNewFile();
        }

        // Write something to the file
//        FileWriter writer = new FileWriter(file);
//        writer.write("Hello, this is written from Java!\n");
//        writer.write("This is the second line.");
//        writer.close();
//
//        // Read the content of the file
//        FileInputStream fis = new FileInputStream(file);
//         int ascii;
//         String text="";
//        while((ascii = fis.read()) != -1) {
//        	text += String.valueOf((char)ascii);
//        System.out.print((char)ascii);
//        }
//        fis.close();
        
        Scanner sc = new Scanner(new FileInputStream(file));
        
        String text = "";
        while(sc.hasNextLine()) {
             text += sc.nextLine() + "\n";
        }
       System.out.println(text);
        sc.close();
        
        
        
    }
}
