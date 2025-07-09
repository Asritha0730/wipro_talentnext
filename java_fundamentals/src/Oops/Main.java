package Oops;

import java.util.Scanner;

class Author{
		  private String name;
		  private String email;
		  private char gender;
	 
	  public Author(String name, String email, char gender) {
	        this.name = name;
	        this.email = email;
	        this.gender = gender;
	    }
	  public String getName() { 
		  return name;
		  }
	    public String getEmail() { 
	    	return email;
	    	}
	    public char getGender() { 
	    	return gender; 
	    	}
	    public void setName(String name) {
	    	this.name = name;
	    	
	    }
	    public void setEmail(String email) {
	    	this.email = email;
	    }
	    public void setGender(char gender) {
	    	this.gender =gender;
	    }
	    public String toString() {
	        return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
	    }
   }
	class Book{
		private String Bname;
		private Author author;
		private double price;
		private int qtyInStock;
		
	public Book(String Bname, Author author, double price, int qtyInStock) {
		this.Bname = Bname;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
	}
	public String getBname() {
		return Bname;
		
	}
	public Author getAuthor(){
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getqtyInStock() {
		return qtyInStock;
	}
	
	}
	
public class Main{
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter author name:");
			String name = sc.nextLine();
			System.out.println("Enter author email:");
			String email = sc.nextLine();
			System.out.println("Enter author gender:");
			char gender=sc.nextLine().charAt(0);
			Author author = new Author(name, email,gender);
			
			System.out.println("Enter the name of the book :");
			String Bname = sc.nextLine();
			System.out.println("Enter the price of the book :");
			double price = sc.nextDouble();
			System.out.println("Enter the qtyinstock of the book :");
			int qtyInStock = sc.nextInt();
			Book book = new Book( Bname,author, price, qtyInStock);
			System.out.println("-----Enter book details-----");
			System.out.println("Book name :"+book.getBname());
			System.out.println("Author name :"+book.getAuthor().getName());
			System.out.println("Author email :"+book.getAuthor().getEmail());
			System.out.println("Author gender :"+book.getAuthor().getGender());
			System.out.println("Author book price :"+book.getPrice());
			System.out.println("Author book qtyinstock :"+book.getqtyInStock());
			
			
			
		}
}
