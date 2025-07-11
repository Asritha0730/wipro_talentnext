package automobile.ship;

public class Compartment {
      private double height;
      private   double width;
       private double breadth;
       
       public Compartment(double height,double width,double breadth) {
    	   this.height = height;
    	   this.width = width;
    	   this.breadth = breadth;
       }
       public double getHeight() {
		return height;
    	   
       }
       public double getWidth() {
           return width;
       }

       public double getBreadth() {
           return breadth;
       }
       public String toString() {
           return "Compartment [Height=" + height + ", Width=" + width + ", Breadth=" + breadth + "]";
       }
}
class compart{
	public static void main(String[]args) {
		Compartment c = new Compartment(23.0,3.3,3.4);
		System.out.println("Height:"+c.getHeight());
		System.out.print(c);
	}
}
