package IoStreams1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Program4 implements Serializable{
            
	double d1;
	transient double d2;
	static double d3;
	void m1() {
		System.out.println("The value of d1 :"+d1);
		System.out.println("The value of d2 :"+d2);
		System.out.println("The value of d3 :"+d3);
	}
	
	
	
	
	
}
class TransientKey{
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Program4 p = new Program4();
		p.d1 = 10.4;
		p.d2=20.4;
		p.d3=34.4;
		p.m1();
		
		FileOutputStream fios = new FileOutputStream("Aa.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fios);
		oos.writeObject(p);
		oos.flush();
		// Deserialize the object from file
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Aa.txt"));
		Program4 deserialized = (Program4) ois.readObject();
		ois.close();

		deserialized.m1();
		
	}
}