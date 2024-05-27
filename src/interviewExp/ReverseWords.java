package interviewExp;

public class ReverseWords {
	
	  public static void main(String[] args) {

	String str = "I love java. I am programmer";

    // Split the string by period
    String[] parts = str.split("\\.");

    // Initialize an empty string to store the result
    String result = "";

    // Process each part
    for (int i = 0; i < parts.length; i++) {
        // Trim the part to remove leading/trailing spaces
        String part = parts[i].trim();
        
        // Split the part into words by space
        String[] words = part.split(" ");
        
        // Reverse the order of words and append to result
        for (int j = words.length - 1; j >= 0; j--) {
            result += words[j];
            if (j != 0) {
                result += " ";
            }
        }
        
        // Add a period and space if it's not the last part
        if (i != parts.length - 1) {
            result += ". ";
        }
    }

    // Print the result
    System.out.println(result); // Output: "java love I. programmer am I"
}
}