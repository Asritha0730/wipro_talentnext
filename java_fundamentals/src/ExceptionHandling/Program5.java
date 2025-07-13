package ExceptionHandling;

import java.io.*;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) throws Throwable {
        File file = new File("./sample.txt");

        // Create file if not exists
        if (!file.exists()) {
            file.createNewFile();
        }
         
        
        try(  FileReader fr = new FileReader(file);
        		FileInputStream fis = new FileInputStream(file);
        		InputStreamReader isr = new InputStreamReader(fis);
              BufferedReader br = new BufferedReader(fr);){
     
       
       String line = new String();
       while((line=br.readLine()) != null) {
    	   System.out.print(line + "\n");
       }
       
  
       int[]arr = {1,2};
       System.out.print(arr[1]/0);
        }catch(FileNotFoundException e1) {
        	e1.printStackTrace();
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e2) {
        	e2.printStackTrace();
        }
       
       
     
       
    }
}
