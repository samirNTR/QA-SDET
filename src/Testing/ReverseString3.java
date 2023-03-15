package Testing;

import java.util.Scanner;

//String inversion
public class ReverseString3 {   
static Scanner sc= new Scanner(System.in);
public static String reverseword(String s)
	
{
	
String result= new String();
int i=0;
int n= s.length();

while(i<n)
{   
	
	while(i<n && s.charAt(i)==' ')
	i++;
	if(i>=n)
	break;
	int j= i+1;
	
	while(j<n && s.charAt(j)!=' ')
	j++;
	String sub= s.substring(i,j);
	if(result.length()==0)
		result=sub;
	else
		
	result= sub+" "+result;
	i=j+1;
	
}
 return result;	
	
		
}
	public static void main(String[] args)
	
	{
	
		System.out.println("Enter the String");
		String str= sc.nextLine();
		System.out.println(reverseword(str));
	}

}
