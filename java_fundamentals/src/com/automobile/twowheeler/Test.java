package com.automobile.twowheeler;
import java.util.Scanner;

import com.automobile.*;

public class Test {
   public static void main(String[]args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Speed :");
	   int Speed = sc.nextInt();
	   System.out.println("Radio :");
	  String radio = sc.next();
	   System.out.println("CdPlay :");
	   String CdPlay = sc.next();
	   
	
	Hero h = new Hero(Speed, radio);
	System.out.println("========Hero Bike======");
	System.out.println("MODEL name :"+h.getModelName());
	System.out.println("Registration number :"+h.getRegistrationNumber());
	System.out.println("Owner name :"+h.getOwnerName());
	System.out.println("Speed :"+h.getSpeed());
	System.out.println("RAdio  :"+h.getRadio());
	sc.nextLine();
	
	Honda honda = new Honda(Speed,CdPlay);
	System.out.println("========Honda Bike======");
	System.out.println("MODEL name :"+honda.getModelName());
	System.out.println("Registration number :"+honda.getRegistrationNumber());
	System.out.println("Owner name :"+honda.getOwnerName());
	System.out.println("Speed :"+honda.getSpeed());
	System.out.println("RAdio  :"+honda.getCdPlay());
	sc.nextLine();
	
	   
   }
}
