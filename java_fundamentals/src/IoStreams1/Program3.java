package IoStreams1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Program3 {
	   public static void main(String[] args) throws IOException {
		   
		   if(args.length != 2) {
			   System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
	            return;
		   }
		   
		   String InputF = args[0];
		   String OutputF = args[1];
		   
		   Map<String, Integer> WordCount = new TreeMap<>();
		   
		   
		   BufferedReader br = new BufferedReader(new FileReader(InputF));
		   
		   String line;
		   
		   while((line = br.readLine()) != null) {
			   String[] words =line.split("\\s+");
			   for(String word :words) {
				   word = word.trim();
				   if(!word.isEmpty()) {
					   WordCount.put(word, WordCount.getOrDefault(word, 0) +1);
				   }
			   }
			   
			   
		   }
		   br.close();
		   
		   BufferedWriter bw = new BufferedWriter(new FileWriter(OutputF));
		   for(Map.Entry<String, Integer> entry : WordCount.entrySet()) {
			   bw.write(entry.getKey() + " : " + entry.getValue());
	            bw.newLine();
		   }
		   bw.close();
		   System.out.println("Word count written to " + OutputF);
	   }
}
