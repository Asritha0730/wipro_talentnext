package Interfaces;

public interface Test {
  abstract int myFunction(int v1,int v2,int v3);
}
class Testreference {
	public static void main(String[]args) {
		
		Test t1 = (v1,v2,v3)-> v1+v2+v3;
		Test t2 = (v1,v2,v3)-> v1*v2*v3;
		
		System.out.println("Sum :"+t1.myFunction(10, 20, 30));
		System.out.println("Product :"+t2.myFunction(10, 20, 30));
	
	}

	
}

	