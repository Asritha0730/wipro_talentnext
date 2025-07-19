package Collection1;

public class Lambda4 implements WordCount {

	public static void main(String[]args) {
		WordCount wc = (String str) -> {
			if(str==null || str.trim().isEmpty()) return 0;
			return str.trim().split("\\s+").length;
		};
		
		String  input = "Hello, this is a lambda example";
        int wordCount = wc.count(input);
        
        System.out.println("Number of words :"+wordCount);
	}

	@Override
	public int count(String str) {
		// TODO Auto-generated method stub
		return 0;
	}

}
