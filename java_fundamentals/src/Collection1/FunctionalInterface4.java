package Collection1;

import java.util.*;
import java.util.function.Predicate;

class EmployeeFunctional{
	private int id;
	private String name;
	private Double salary;
	EmployeeFunctional(){
		
	}
	public EmployeeFunctional(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the salary
	 */
	public Double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}


public class FunctionalInterface4 {
     public static void main(String[]args) {
	List<EmployeeFunctional> l = Arrays.asList(
			new EmployeeFunctional(201,"Smith",62356.5),
			new EmployeeFunctional(202,"John",34456.5),
			new EmployeeFunctional(203,"Alex",23256.5),
			new EmployeeFunctional(204,"Sai",52676.5),
			new EmployeeFunctional(205,"Sammy",4456.5),
			new EmployeeFunctional(206,"Jay",34876.5),
			new EmployeeFunctional(207,"Vijay",9456.5),
			new EmployeeFunctional(208,"Smitha",8456.5),
			new EmployeeFunctional(209,"Suraj",7456.5),
			new EmployeeFunctional(210,"Aditi",4566.5)
			);
	
	Predicate<EmployeeFunctional> p = em -> em.getSalary() <= 10000;
	 System.out.println("Employee names who has less than 10k :");
	l.stream().filter(p).forEach(em->System.out.println(em.getName()));
}
}