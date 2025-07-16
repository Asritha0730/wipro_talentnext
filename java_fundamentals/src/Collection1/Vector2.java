package Collection1;

import java.util.*;


class Employee{
	int id;
	String name;
	double salary;
	
	public Employee(int id ,String name,double salary) {
		this.id = id;
		this.name=name;
		this.salary = salary;
	}
	public void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
	}
}


public class Vector2 {
	public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();

       
        employees.add(new Employee(101, "Alice", 50000));
        employees.add(new Employee(102, "Bob", 60000));
        employees.add(new Employee(103, "Charlie", 55000));

        System.out.println("=== Using Iterator ===");     
        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()) {
            it.next().display();
        }
        System.out.println("\n=== Using Enumeration ===");
        Enumeration<Employee> en = employees.elements();
        while (en.hasMoreElements()) {
            en.nextElement().display();
        }
        
        
}
	
	
}
