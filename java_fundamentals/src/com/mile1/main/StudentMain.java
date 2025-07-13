package com.mile1.main;

import com.mile1.Exception.NullMarksArrayException;
import com.mile1.Exception.NullNameException;
import com.mile1.Exception.NullStudentObjectException;
import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	
            static Student data[] = new Student[4];
            
            StudentMain() {
            	for(int i =0;i<data.length;i++) {
            		data[i]= new Student();
            	}
            	
            	data[0] = new Student("Smith",new int[] {85,77,64});
            	data[1] = new Student(null,new int[] {11,34,56});
            	data[2]=null;
            	data[3] = new Student("Manoj",null);
            }
            
            
            
          public static void main(String[]args) {
        	 
        	  StudentMain sm = new StudentMain();
        	  StudentReport sr = new StudentReport();
        	  StudentService ss = new StudentService();
        	  
        	  for(int i =0;i<data.length;i++) {
        		    
        		  try {
        			  String v = sr.validate(data[i]);
        			  
        			  if(v.equals("Valid")) {
        				  String grade = sr.findGrades(data[i]);
        				  System.out.println("Grade = "+grade);
        			  }
        			  
        		  }catch (NullNameException | NullMarksArrayException | NullStudentObjectException e) {
                      System.out.println(e); 
                  } 
        		  catch (Exception e) {
                      System.out.println(e); // This will print: name is null, mark array is null, or object is null
                  } 
        	  }
        	   System.out.println("Number of Objects with Marks array as null = " + ss.findNumberOfNullMarksArray(data));
        	    System.out.println("Number of Objects with Name as null = " + ss.findNumberOfNullName(data));
        	    System.out.println("Number of Objects that are entirely null = " + ss.findNumberOfNullObjects(data));

          }
          
}

