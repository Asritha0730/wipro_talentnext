package com.mile1.service;

import java.util.Scanner;

import com.mile1.Exception.NullMarksArrayException;
import com.mile1.Exception.NullNameException;
import com.mile1.Exception.NullStudentObjectException;
import com.mile1.bean.Student;

public class StudentReport {
	
	public String findGrades(Student studentObject) {
		Scanner sc = new Scanner(System.in);
		
		int[] marks = studentObject.getMarks();
		
		for(int mark : marks) {
			if(mark < 35) {
				return "F";
			}
		}
		
		int sum =0;
		for(int mark :marks) {
			sum += mark;
		}
		if( sum < 150) {
			return "C";
		}
		else if(sum < 200) {
			return "B";
		}
		else if(sum <250) {
			return "A";
		}
		else {
			return "A+";
		}
		
		
		
	}
	public String validate(Student s) throws NullNameException,NullMarksArrayException,NullStudentObjectException{
		
		 if(s==null) {
				throw new NullStudentObjectException();
		    }
		if(s.getName()==null) {
			throw new NullNameException();
		}
		 if(s.getMarks()==null) {
			throw new NullMarksArrayException();
		}
	   
	
			return "Valid";
		
		
	}
	
	
}
