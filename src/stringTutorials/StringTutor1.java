package stringTutorials;

public class StringTutor1 {

	public static void main(String[] args) {
		// charAt(int index)
		String str = "Hello, World!";
		char firstChar = str.charAt(0);
		System.out.println("charAt(0): " + firstChar);

		// length()
		int length = str.length();
		System.out.println("length: " + length);

		// concat(String str)
		String concatStr = str.concat(" Welcome");
		System.out.println("concat: " + concatStr);

		// isEmpty()
		boolean isEmpty = str.isEmpty();
		System.out.println("isEmpty: " + isEmpty);

		// substring(int beginIndex)
		String subStr1 = str.substring(7);
		System.out.println("substring(7): " + subStr1);

		// substring(int beginIndex, int endIndex)
		String subStr2 = str.substring(0, 5);
		System.out.println("substring(0, 5): " + subStr2);

		// indexOf(String str)
		int index1 = str.indexOf("W");
		System.out.println("indexOf('W'): " + index1);

		// lastIndexOf(String str)
		int index2 = str.lastIndexOf("l");
		System.out.println("lastIndexOf('l'): " + index2);

		// startsWith(String prefix)
		boolean startsWith = str.startsWith("Hello");
		System.out.println("startsWith('Hello'): " + startsWith);

		// endsWith(String suffix)
		boolean endsWith = str.endsWith("World!");
		System.out.println("endsWith('World!'): " + endsWith);

		// toLowerCase()
		String lowerCaseStr = str.toLowerCase();
		System.out.println("toLowerCase: " + lowerCaseStr);

		// toUpperCase()
		String upperCaseStr = str.toUpperCase();
		System.out.println("toUpperCase: " + upperCaseStr);

		// trim()
		String stringWithSpaces = "   Trim Example   ";
		String trimmedStr = stringWithSpaces.trim();
		System.out.println("trim: '" + trimmedStr + "'");

		// replace(char oldChar, char newChar)
		String replacedStr = str.replace('o', 'O');
		System.out.println("replace('o', 'O'): " + replacedStr);

		// split(String regex)
		String[] words = str.split("\\s+");
		System.out.println("split:");
		for (String word : words) {
			System.out.println(word);
		}

		// equals(Object obj)
		String str1 = "Hello";
		String str2 = "hello";
		boolean isEqual = str1.equals(str2);
		System.out.println("equals: " + isEqual);
	
		System.out.println("== OPERATOR" +str1==str2);

		// equalsIgnoreCase(String anotherString)
		boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
		System.out.println("equalsIgnoreCase: " + isEqualIgnoreCase);

		// compareTo(String anotherString)
		int compareResult = str1.compareTo(str2);
		System.out.println("compareTo: " + compareResult);

		// valueOf(int value)
		int intValue = 123;
		String intStr = String.valueOf(intValue);
		System.out.println("valueOf(int): " + intStr);

		// valueOf(boolean value)
		boolean boolValue = true;
		String boolStr = String.valueOf(boolValue);
		System.out.println("valueOf(boolean): " + boolStr);
	}
}
