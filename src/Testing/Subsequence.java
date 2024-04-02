package Testing;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "samir";
        String subsequence = "sir";

        boolean isSubsequence = isSubsequence(str, subsequence);
        
        if (isSubsequence) {
            System.out.println("'" + subsequence + "' is a subsequence of '" + str + "'.");
        } else {
            System.out.println("'" + subsequence + "' is not a subsequence of '" + str + "'.");
        }
    }

    public static boolean isSubsequence(String str, String subsequence) {
        int i = 0;
        int j = 0;

        // Iterate through both strings
        while (i < str.length() && j < subsequence.length()) {
            // If characters match, move to the next character in both strings
            if (str.charAt(i) == subsequence.charAt(j)) {
                j++;
            }
            i++;
        }

        // If j reached the end of the subsequence, it means all characters were found in str
        return j == subsequence.length();

	}

}
