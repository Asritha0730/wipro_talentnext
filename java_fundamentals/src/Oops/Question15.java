package Oops;

import java.util.Optional;

class InvalidEmployeeException extends RuntimeException{
	public InvalidEmployeeException(String message) {
		super(message);
	}
}
 class Employe{
	 String name;
	 Employe(String name){
		 this.name = name;
	 }
	
}

public class Question15 {
      
     String name ="Smith";	
	public static void main(String[]args) {
		
		Employe emp = null;
		
		Optional<Employe> op = Optional.ofNullable(emp);
		
		 Employe valid = op.orElseThrow(() ->
         new InvalidEmployeeException("Employee object is null!")
     );
		 System.out.println("Employee Name: " + valid.name);
		
	}
	
}
