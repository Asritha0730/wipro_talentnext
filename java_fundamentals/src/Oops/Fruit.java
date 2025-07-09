package Oops;

public class Fruit {
	String name;
	String taste;
	int size;
	public Fruit() {
		
	}
	public Fruit(String name,String taste,int size){
		this.name=name;
		this.taste = taste;
		this.size=size;
		
	}
	
	public void eat() {
		System.out.println("Jackfruit taste is delicious");
	}
	

}

class Apple extends Fruit{
	public void eat() {
		System.out.println("Apple taste is delicious");
	}
	
	
}
class Orange extends Fruit{
	public void eat() {
		System.out.println("Orange taste is delicious");
	}
	
	
}
class inherit{
	public static void main(String[]args) {
		Fruit f1 = new Fruit();
		f1.eat();
		Apple a = new Apple();
		a.eat();
		Orange o = new Orange();
		o.eat();
	}
}

