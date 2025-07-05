package java_fundamentals;

public class Question16 {
	public static void main(String[]args) {
		for(int num =10;num<=99;num++) {
			boolean isprime=true;
		
				for(int i=2;i<=num/2;i++) {
					if(num % i == 0) {
						isprime = false;
						break;
					}
				}
			if(isprime) {
				System.out.println(num +" is a prime number");
			}
		}
	}

}
