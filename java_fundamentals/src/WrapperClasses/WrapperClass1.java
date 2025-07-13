package WrapperClasses;

public class WrapperClass1 {
            public static void main(String[]args) {
            	
            	long i =100;
            	System.out.println(i);
            	Long l = Long.valueOf(i); //boxing
            	System.out.println("Boxing :"+l);
            	Long l1 = i; //Auto-boxing
            	System.out.println("Auto-boxing"+l);
            	long a = l.longValue();//unboxing
            	System.out.println("Unboxing :"+a);
            	long b = l; //auto-unboxing
            	System.out.println("Auto-unboxing :"+b);
            	
            }
}
