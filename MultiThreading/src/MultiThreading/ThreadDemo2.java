package MultiThreading;

import java.util.Random;

public class ThreadDemo2 implements Runnable {
	String[]colors = {"White","blue","black","green","red","yellow"};
	Random r = new Random();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			int index = r.nextInt(colors.length);
			String colour = colors[index];
			 System.out.println("Colour: " + colour);
			 if(colour.equalsIgnoreCase("red")) {
				 System.out.println("Red ! is found");
				 break;
			 }
			 try {
				 Thread.sleep(50);
			 }catch (InterruptedException e) {
	                System.out.println("Thread interrupted.");
	            }
		}
		
	}
   
	public static void main(String[]args) {
		ThreadDemo2 t = new ThreadDemo2();
		 Thread thread = new Thread(t); 

		thread.start();
	}
	
	
	
}
