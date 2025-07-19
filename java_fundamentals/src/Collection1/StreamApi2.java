package Collection1;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi2 {
     public static void main(String[]args) {   
	List<EmployeeStream> l = new ArrayList<>();
	l.add(new EmployeeStream(101,"Jay",18,"Kochi"));
	l.add(new EmployeeStream(102,"Astha",20,"Banglore"));
	l.add(new EmployeeStream(103,"Varsha",22,"Pune"));
	l.add(new EmployeeStream(104,"Varshu",22,"Pune"));
	l.add(new EmployeeStream(105,"John",24,"Hyderabad"));
	
	List<EmployeeStream> location = 
	l.stream().filter(e -> e.getLocation().equals("Pune")
	).collect(Collectors.toList());
	
	for(EmployeeStream emp : location) {
		System.out.println(emp.getEmpNo() +" : "+emp.getName()+" : "+emp.getLocation());
	}
	
     }
}
class EmployeeStream{
	
	int empNo;
	String name;
	int age;
	String Location;
	EmployeeStream(){
		
	}
	EmployeeStream(int empNo,String name , int age,String Location){
		this.empNo=empNo;
		this.name=name;
		this.age=age;
		this.Location=Location;
	}
	/**
	 * @return the empNo
	 */
	public int getEmpNo() {
		return empNo;
	}
	/**
	 * @param empNo the empNo to set
	 */
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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
	 * @return the age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return Location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		Location = location;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	
}