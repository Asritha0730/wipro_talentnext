package Collection1;


interface PrimeCheck {
    void checks(int n);
}
class check{
	 check(int n) {
		if(isPrime(n)) {
			System.out.println("Prime");
		}else
		{
			System.out.println("Not Prime");
		}
	}
	
	
	private boolean isPrime(int n) {
		if(n<=1) return false;
		for(int i = 2;i <Math.sqrt(n);i++) {
			if(n % i ==0) return false;
		}
		return true;
	}
}


public class MethodReference3 {
    public static void main(String[]args) {
    	PrimeCheck p = check ::new;
    	p.checks(7);
    	p.checks(10);
    	
    	
    }
}
