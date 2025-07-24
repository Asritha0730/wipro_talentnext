package Collection1;

import java.util.*;

public class mini_project6{

    public static List<String> performOperations(String s1, String s2) {
        List<String> result = new ArrayList<>();

       
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                op1.append(s2);
            else
                op1.append(s1.charAt(i));
        }
        result.add(op1.toString());

        
        int lastIndex = s1.lastIndexOf(s2);
        if (lastIndex != -1 && s1.indexOf(s2) != lastIndex) {
            StringBuilder sb = new StringBuilder(s1);
            sb.replace(lastIndex, lastIndex + s2.length(), new StringBuilder(s2).reverse().toString());
            result.add(sb.toString());
        } else {
            result.add(s1 + s2);
        }

        int firstIndex = s1.indexOf(s2);
        if (firstIndex != -1 && s1.indexOf(s2) != s1.lastIndexOf(s2)) {
            StringBuilder sb = new StringBuilder(s1);
            sb.delete(firstIndex, firstIndex + s2.length());
            result.add(sb.toString());
        } else {
            result.add(s1);
        }

        
        int len = s2.length();
        int half = len / 2;
        String firstHalf = s2.substring(0, half + (len % 2));
        String secondHalf = s2.substring(half + (len % 2));
        result.add(firstHalf + s1 + secondHalf);

        Set<Character> s2Chars = new HashSet<>();
        for (char c : s2.toCharArray()) {
            s2Chars.add(c);
        }
        StringBuilder op5 = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (s2Chars.contains(c)) {
                op5.append('*');
            } else {
                op5.append(c);
            }
        }
        result.add(op5.toString());

        return result;
    }

    public static void main(String[] args) {
        String s1 = "JAVAJAVA";
        String s2 = "VA";
        List<String> output = performOperations(s1, s2);
        System.out.println("Output: " + output);
    }
}
