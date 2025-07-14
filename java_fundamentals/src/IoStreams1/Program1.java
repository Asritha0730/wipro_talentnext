package IoStreams1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {
       public static void main(String[]args) throws IOException {
    	   
    	   Scanner sc = new Scanner(System.in);
    	   
    	   File f = new File("./Input.txt");
//    	   System.out.println(f.createNewFile());

    	   if(f.exists()) {
    		   f.delete();
    		   f.createNewFile();
    	   }
    	   FileWriter fw = new FileWriter(f);
    	  String content ="rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr"
    	  		+ "rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr";
    	  fw.write(content);
    	  fw.close();
    	   
    	   System.out.println("Enter the character to be counted :");
    	   
    	   char target = sc.nextLine().toLowerCase().charAt(0);
    	   
    	   int count =0;
    	   try {
    	   FileReader fr = new FileReader(f);
    	   int ch;
    	   while((ch =fr.read()) != -1) {
    		   char current = Character.toLowerCase((char)ch);
    		   if(current == target) {
    			   count++;
    		   }
    		   
    	   }
    	   fr.close();
    	   System.out.println("File '" + f + "' has " + count + 
                   " instances of letter '" + target + "'.");
    	   
    	   }catch(Exception e) {
    		   e.printStackTrace();
    	   }
       }
}
