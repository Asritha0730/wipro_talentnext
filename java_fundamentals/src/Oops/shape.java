package Oops;

public class shape {
	public void draw() {
		System.out.println("Drawing Shape");
	}
	public void erase() {
		System.out.println("Erasing Shape");
	}

}
class circle extends shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public void erase() {
		System.out.println("Erasing Circle");
	}

}
class traingle extends shape{
	public void draw() {
		System.out.println("Drawing Traingle");
	}
	public void erase() {
		System.out.println("Erasing Traingle");
	}

}
class square extends shape{
	public void draw() {
		System.out.println("Drawing Square");
	}
	public void erase() {
		System.out.println("Erasing Square");
	}

}
class polymorphism{
	public static void main(String[]args) {
	
     shape c = new circle();
     shape t = new traingle();
     shape s = new square();
     c.draw();
     c.erase();
     t.draw();
     t.erase();
     s.draw();
     s.erase();
     
	
	}
}
