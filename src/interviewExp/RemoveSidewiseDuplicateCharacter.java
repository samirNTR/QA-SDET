package interviewExp;



public class RemoveSidewiseDuplicateCharacter {

	public static void main(String[] args) {
		String str = "abcabcbb"; //abdcdba

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) 
		{
			char currentChar = str.charAt(i);

			if (i == str.length() - 1 || currentChar != str.charAt(i + 1)) 
			{
				sb.append(currentChar);
			}
			
			
		}
		System.out.println("The result is " + sb);
	}

}
