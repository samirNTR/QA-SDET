package interviewExp;

public class RemoveConsecutiveChar2 {
	
    public static void main(String[] args) {
        
        String str = "aaabbbbbbbcddaed";  //caed
        StringBuilder sb = new StringBuilder();
        
        int count = 1; // Initialize count for the first character
        
        for (int i = 0; i < str.length(); i++) {
            
            char currentChar = str.charAt(i);
            
            // Check if the current character is the last one or if it's different from the next character
            if (i == str.length() - 1 || currentChar != str.charAt(i + 1)) 
            {
                
                // Append the current character to the StringBuilder based on the count
				if (count < 2)
				{
					sb.append(currentChar);
				}

				// Reset the count for the next character
				count = 1;

	    	} 
           
            else 
            {
                // Increment the count if the current character is the same as the next character
                count++;
            }
        }
        
        System.out.println(sb.toString());
    }
}




