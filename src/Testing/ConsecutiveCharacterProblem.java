package Testing;

public class ConsecutiveCharacterProblem {
	

	    public static void main(String[] args) {
	        String str = "MMABDDDMM";
	        separateConsecutiveChars(str);
	    }

	    private static void separateConsecutiveChars(String input) {
	        int length = input.length();
	        if (length == 0) {
	            System.out.println("Empty string");
	            return;
	        }

	        char currentChar = input.charAt(0);
	        StringBuilder currentChunk = new StringBuilder(String.valueOf(currentChar));

	        for (int i = 1; i < length; i++) {
	            char nextChar = input.charAt(i);
	            if (nextChar == currentChar) {
	                currentChunk.append(nextChar);
	            } else {
	                System.out.println(currentChunk);
	                currentChunk = new StringBuilder(String.valueOf(nextChar));
	                currentChar = nextChar;
	            }
	        }

	        // Print the last chunk
	        System.out.println(currentChunk);
	    }
	}



