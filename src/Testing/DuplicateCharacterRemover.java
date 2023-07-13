package Testing;


import java.util.HashMap;
import java.util.Map;


	public class DuplicateCharacterRemover {
		public static void main(String[] args) {
			String input = "hello world";

			Map<Character, Integer> characterCount = new HashMap<>();
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
			}

			StringBuilder result = new StringBuilder();
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (characterCount.get(c) == 1) {
					result.append(c);
				}
			}

			System.out.println("Original string: " + input);
			System.out.println("After removing duplicate characters: " + result.toString());
		}
	}


/*static Scanner sc= new Scanner(System.in);

	public static void charCount1(String str)
	{

		StringBuilder sb= new StringBuilder();

		Set<Character> set= new LinkedHashSet<>();
		for(int i=0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}

		for(Character c:set)
		{
			sb.append(c);
		}


		System.out.println(sb);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the required string");
		String str=sc.nextLine();
		charCount1(str);



	}

}*/
