package Oops;
import java.util.Optional;
import java.util.Scanner;

public class Question13 {
    

public static void main(String[]args) {
	  Scanner sc = new Scanner(System.in);
	  String [] names = new String[5];
	  
	  System.out.print("Enter a name: ");
      names[0] = sc.nextLine(); 

	  Question13 q = new Question13();
	  Optional<String> n = Optional.ofNullable(names[0]);
	  if(n.isPresent()) {
	 System.out.println("length : "+n.get().length());
	  }
	  else {
		  System.out.println("NUll values");
	  }
	  
  }


}
