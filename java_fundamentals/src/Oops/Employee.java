package Oops;

class Employee extends Person {
   
    double annual_sal;
    int year ;
    String insuranceNum;
    
    public Employee() {
    	super();
    }
    public Employee(double annual_sal,int year,String insuranceNum, String name) {
    	super(name);
    	this.annual_sal = annual_sal;
    	this.year=year;
    	this.insuranceNum=insuranceNum;
    	
    	
    }
    public double getAnnual_sal() {
    	return annual_sal;
    }
    public void setAnnual_sal(double annual_sal) {
    	this.annual_sal = annual_sal;
    }
    public int getYear() {
    	return year;
    }
    public void setYear(int year) {
    	this.year=year;
    }
    public String getInsuranceNum( ) {
    	return insuranceNum;
    }
    public void setInsuranceNum(String insuranceNum) {
    	this.insuranceNum =insuranceNum;
    }
    
    }
    	
 
