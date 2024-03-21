package interviewExp;

public class RemoveConsecutiveDuplicateCharacters {
    public static void main(String[] args) {
	 String str1 = "abbcdba";   //acdba
     String str2 = "aabbcda";   //cda

     System.out.println("Input: " + str1);
     System.out.println("Output: " + removeConsecutive(str1));
     
     System.out.println("Input: " + str2);
     System.out.println("Output: " + removeConsecutive(str2));
 }

 public static String removeConsecutive(String str) {
     StringBuilder result = new StringBuilder();

     for (int i = 0; i < str.length(); i++) {
         char currentChar = str.charAt(i);

         // Append current character to result if it's different from the next character
         if (i == str.length() - 1 || currentChar != str.charAt(i + 1)) {
             result.append(currentChar);
         } else {
             // Skip the next character if it's the same as the current one
             i++;
         }
     }

     return result.toString();
 }
}
