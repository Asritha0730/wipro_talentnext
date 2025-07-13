package WrapperClasses;

public class WrapperClass3 {
      public static void main(String[]args) {
    	  
    	  int num = Integer.parseInt(args[0]);
    	  System.out.println("Given number :"+num);
    	  System.out.println("Binary Equivalent :"+ Integer.toBinaryString(num));
    	  System.out.println("Octal Equivalent :"+ Integer.toOctalString(num));
    	  System.out.println("HexaDecimal Equivalent :"+ Integer.toHexString(num));
    	  
      }
}
