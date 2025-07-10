package Oops;

import java.util.Optional;

public class Question14 {
	String address = null;
	
	public static void main(String[]args) {
		
		Question14 q = new Question14();
		Optional<String> op = Optional.ofNullable(q.address);
		
		System.out.println("Address:" +op.orElse("India"));
	}
}
