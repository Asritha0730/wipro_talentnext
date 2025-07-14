package IoStreams1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
     public static void main(String[]args) throws IOException {
    	 Scanner sc = new Scanner(System.in);
    	try { 
    	 System.out.println("enter the input file :");
    	 String Input = sc.nextLine();
    	 System.out.println("enter the output file :");
    	 String Output = sc.nextLine();
    	 
    	 
    	 FileInputStream fis = new FileInputStream(Input);
    	 FileOutputStream fos = new FileOutputStream(Output);
    	 
    	 int data;
    	 while((data = fis.read()) !=-1) {
    		fos.write(data); 
    	 }
    	 fos.close();
    	 fis.close();
    	 System.out.println("File is copied.");
    	}catch(FileNotFoundException f) {
    		System.out.println("File not Found :"+f.getMessage());
    	}
    	 
     }
}
