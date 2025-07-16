package Collection1.EmployeeManagement;

public class Employee {
   private int empid;
   private String empName;
   private String email;
   private String gender;
    private float salary;
    
    /**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Employee(int empid, String empName, String email, String gender, float salary) {
        this.empid = empid;
        this.empName = empName;
        this.gender = gender;
        this.email = email;
        this.salary = salary;
    }

    public int getEmpId() {
        return empid;
    }
    
    void display() {
    	System.out.println("------Employee Details------");
    	System.out.println("Employee Id :"+empid);
    	System.out.println("Employee Name :"+empName);
    	System.out.println("Employee email :"+email);
    	System.out.println("Employee salary :"+salary);
    }
    
}
