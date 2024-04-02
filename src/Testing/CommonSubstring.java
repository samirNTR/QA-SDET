package Testing;

public class CommonSubstring {
	
	
	 public static void main(String[] args) {
	        String words = "carcartooncarpentercarrom";

	        String commonSubstring = findCommonSubstring(words.toLowerCase());
	        System.out.println("Common substring: " + commonSubstring);
	    }

	    public static String findCommonSubstring(String words) {
	        int n = words.length();
	        String commonSubstring = "";
	        
	        // Iterate over all possible substrings
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                String substring = words.substring(i, j);
	                if (words.indexOf(substring, j) != -1 && substring.length() > commonSubstring.length()) 
	                {
	                    commonSubstring = substring;
	                }
	            }
	        }
	        return commonSubstring;
	    }
	}



