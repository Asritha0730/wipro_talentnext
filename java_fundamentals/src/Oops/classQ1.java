package Oops;

import java.util.Scanner;

public class classQ1 {
	double width;
	double height;
	double depth;
	
	public  classQ1(double width,double height,double depth) {
		this.width = width;
		this.height=height;
		this.depth = depth;
	
	}
	public  double getVolume() {
		return (width*height*depth);
		
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		double depth = sc.nextDouble();
		
		classQ1 c = new classQ1(width,height,depth);
		
		System.out.println("The volume of the box :"+c.getVolume());
		
		
		
	}

}
