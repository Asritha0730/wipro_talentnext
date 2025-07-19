package Collection1;

interface Factorial{
	int compute(int n);
}
class Fact {
	public int factorial(int n) {
		
		int fact = 1;
		for(int i =1;i<=n;i++) {
			fact *= i;
		}
		return fact;
		
	}
}

public class MethodReference1 {
     public static void main(String[]args) {
    	  Fact f = new Fact();
    	  
    	  Factorial factref = f::factorial;
    	  
    	  int res = factref.compute(5);
    	  System.out.println("Factorial of 5 :"+res);
     }
}
