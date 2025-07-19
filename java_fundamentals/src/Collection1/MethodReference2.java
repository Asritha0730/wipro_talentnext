package Collection1;

interface count{
	int Count(int n);
}

class DigitCount{
	public static int digitCount(int n) {
		
		if(n==0) return 0;
		
		int count =0;
		n = Math.abs(n);
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
}

public class MethodReference2 {
  public static void main(String[]args) {
	 
	  
	  count c = DigitCount::digitCount;
	  int res = c.Count(9876788);
	  System.out.println("No of digits :"+res);
	  
	  
	  
  }
}
