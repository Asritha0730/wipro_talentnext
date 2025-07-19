package Collection1;

import java.util.*;
import java.util.stream.Collectors;

class StudentStream{
	private int rollNo;
	private String name;
	private int mark;
	StudentStream(){
		
	}
	StudentStream(int rollNo,String name,int mark){
		this.rollNo=rollNo;
		this.name=name;
		this.mark=mark;
	}
	@Override
	public String toString() {
	    return "\nStudent [rollNo=" + rollNo + ", name=" + name + ",marks=" + mark + "]";
	}
	/**
	 * @return the mark
	 */
	public int getMark() {
		return mark;
	}
	
	public void setMark(int mark) {
	    this.mark = mark;
	}
}
public class StreamApi3{
	public static void main(String[]args) {
		
		List<StudentStream> l = new ArrayList<>();
		l.add(new StudentStream(101,"Jay",75));
		l.add(new StudentStream(102,"Aditya",65));
		l.add(new StudentStream(103,"Ankith",45));
		l.add(new StudentStream(104,"Smith",35));
		l.add(new StudentStream(105,"JOhn",55));
		
		Long count = l.stream().filter(stu->stu.getMark()>=50).count();
		
		List<StudentStream> filtered = l.stream()
                .filter(stu -> stu.getMark() <= 50)
                .collect(Collectors.toList());

		System.out.println(count+" "+filtered);
		
	}
}