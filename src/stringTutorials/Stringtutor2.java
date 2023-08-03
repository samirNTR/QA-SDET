package stringTutorials;

public class Stringtutor2 {

	public static void main(String[] args) {

		String str1 = "Hello", str2 = "hello";
		String str3 = new String("Hello"), str4 = new String("hello");
		
		System.out.println("Equals operator str1=Hello/ str3=Hello "+(str1==str3));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equals(str4));
		System.out.println("Equals operator str1=Hello/ str3=Hello"+str2==str4);
		System.out.println("s1 and s2"+(str1==str2));

	}

}
