package java_fundamentals;
import java.util.Scanner;

public class Question6 {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if(str == "") {
			System.out.println("No values");
		}
		else {
			String[] word = str.split("\\s+");
			for(int i = 0;i<word.length;i++) {
			System.out.print(word[i]);
			if(i < word.length - 1) {
				System.out.print(",");
			}
		}
		
	}

}
}
