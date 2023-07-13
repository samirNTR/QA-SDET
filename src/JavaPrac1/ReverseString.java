package JavaPrac1;

import java.util.Scanner;

public class ReverseString {


	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int size,temp;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the required string: ");

		String str=sc.nextLine();

		char[] ch= str.toCharArray();

		size= ch.length;
		for(int i=0; i<size; i++)
		{

			for(int j= i+1; j<size; j++)
			{

				if(ch[i]<ch[j]) {

					temp=ch[i];
					ch[i]= ch[j];
					ch[j]= (char)temp;
				}
			}
		}
System.out.println("Sorted array is: "+ new String( ch));


	}


	/*public static void charCount(String str) {

		if (str.equals(" ")) {
			System.out.println("Empty string");
		} else if (str.isBlank()) {
			System.out.println("Blank string");
		}


		char ch[] = str.toCharArray();

		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : ch) {
			if (!String.valueOf(c).isBlank())

				if (hm.containsKey(c)) {
					hm.put(c, hm.get(c) + 1);

				}

				else {
					hm.put(c, 1);
				}
		}

		Set<Map.Entry<Character, Integer>> entryset = hm.entrySet();


			for (Map.Entry<Character, Integer> e1 : entryset)
			{
				 //if(e1.getValue() >1)

				System.out.println(e1.getKey() + "-->" + e1.getValue());
			}

		}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the required string: ");

		String str = sc.nextLine();
		charCount(str);*/
	}
