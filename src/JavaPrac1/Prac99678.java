package JavaPrac1;

public class Prac99678 {

	public static void main(String[] args) {

String str="I    love java";

String str1[]=str.trim().split(" ");
String reverseString="";

for(int i=str1.length-1; i>=0; i--)
{
	
	reverseString=reverseString+str1[i]+" ";
}


System.out.println(reverseString);
	}

}
