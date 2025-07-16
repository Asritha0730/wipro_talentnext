package Collection1.EmployeeManagement;

import java.util.ArrayList;

public class EmployeeDB {
      
    
    	ArrayList<Employee> al = new ArrayList<>();
   
    public boolean addEmployee(Employee e){
		return al.add(e);
	}
	public boolean deleteEmployee(int empid) {
		for(Employee emp:al) {
			if(emp.getEmpId() == empid) {
				al.remove(emp);
				return true;
			}
		}
		return false;
		
	}
	public String showPaySlip(int empid) {
		for(Employee emp:al) {
			if (emp.getEmpId() == empid) {
                return "PaySlip for " + empid + " : Rs. " + emp.getSalary();
            }
		}
		return "Not found.";
	}
	
	public void displayAllEmployee() {
		for(Employee emp:al) {
			emp.display();
		}
	}
	
	
}
