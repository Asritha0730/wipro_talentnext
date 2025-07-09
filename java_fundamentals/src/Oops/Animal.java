package Oops;

public class Animal {
 
	public void eat() {
		System.out.println("Animal likes to eat");
		
	}
	public void sleep() {
		System.out.println("Animal like to sleep");
	}
}
	class Bird extends Animal{
		public void fly() {
			System.out.println("Animal can Fly");
		}
	}

	

class inheritance{
	public static void main(String[]args) {	
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();
		Bird b = new Bird();
		b.fly();
	  }
}
