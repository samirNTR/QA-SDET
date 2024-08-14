package interviewExp;


public class LongestSubstring {
	
    public static void main(String[] args) {
        // Input string
        String str = "aaabbbbbceeeeeeeeeeeee";
      
        if (str == null || str.length() == 0) 
        {
        	System.out.println("Input string is null or empty.");
            return ;// If it is, return an empty string
        }

        // Variables to store the length and starting index of the longest substring found
        int maxLength = 1;
        int start = 0;
        int currentLength = 1;

        // Loop through the string, starting from the second character
        for (int i = 1; i < str.length(); i++) {
            // Check if the current character is the same as the previous character
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentLength++; // If it is, increment the length of the current consecutive substring
            } else {
                // If the current character is different from the previous one
                // Check if the length of the current consecutive substring is greater than the maxLength found so far
                if (currentLength > maxLength) {
                    // If it is, update the maxLength and start index
                    maxLength = currentLength;
                    start = i - maxLength; // Update the start index to the beginning of the longest substring
                }
                // Reset the length of the current consecutive substring
                currentLength = 1;
            }
        }

        // Check if the length of the last consecutive substring is greater than the maxLength found so far
        if (currentLength > maxLength) {
            // If it is, update the maxLength and start index for the last substring
            maxLength = currentLength;
            start = str.length() - maxLength; // Update the start index to the beginning of the last substring
        }

        // Return the longest substring of consecutive characters
       System.out.println(str.substring(start, start + maxLength));
    }
}
