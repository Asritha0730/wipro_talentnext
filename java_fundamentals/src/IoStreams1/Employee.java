package IoStreams1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Employee implements Serializable{
   private String name;
   private Date dateOfBirth;
   private String department;
   private String designation;
   private double salary;
   
   Employee(){
	   
   }
   public  Employee(String name,Date dateOfBirth, String department, String designation, double salary) {
	   this.name = name;
	   this.dateOfBirth =dateOfBirth;
	   this.department= department;
	   this.designation= designation;
	   this.salary= salary;
	   
   }
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the dateOfBirth
 */
public Date getDateOfBirth() {
	return dateOfBirth;
}
/**
 * @param dateOfBirth the dateOfBirth to set
 */
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
/**
 * @return the department
 */
public String getDepartment() {
	return department;
}
/**
 * @param department the department to set
 */
public void setDepartment(String department) {
	this.department = department;
}
/**
 * @return the designation
 */
public String getDesignation() {
	return designation;
}
/**
 * @param designation the designation to set
 */
public void setDesignation(String designation) {
	this.designation = designation;
}
/**
 * @return the salary
 */
public double getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}
   
   
   
   
}



class EmployeeObj{
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee e = new Employee();
		e.setDateOfBirth(new Date());
		e.setDepartment("CSE");
		e.setDesignation("Developer");
		e.setSalary(20000.5);
		e.setName("Aastha");
		FileOutputStream fos = new FileOutputStream("data");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		
		
		FileInputStream fis = new FileInputStream("data");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee employee = (Employee)ois.readObject();
		
		System.out.println("Name: " + employee.getName());
        System.out.println("DOB: " + employee.getDateOfBirth());
        System.out.println("Department: " + employee.getDepartment());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Salary: " + employee.getSalary());
	}
}
