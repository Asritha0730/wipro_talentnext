package ExceptionHandling;

import java.io.*;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) throws IOException {
        File file = new File("./sample.txt");

        // Create file if not exists
        if (!file.exists()) {
            file.createNewFile();
        }

       FileReader fr = new FileReader(file);
       
       BufferedReader br = new BufferedReader(fr);
       
       String line = new String();
       while((line=br.readLine()) != null) {
    	   System.out.print(line + "\n");
       }
       
       
        fr.close();
       
    }
}
