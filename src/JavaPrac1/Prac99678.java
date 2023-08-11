package JavaPrac1;

public class Prac99678 {

	
	public static boolean palindromeCount(String str)
	{
		
		int left=0, right=str.length()-1;
		
		while(left<right)
		{
			
			if(str.charAt(left)!=str.charAt(right))
			{
				return false;
		}
		left++;
		right--;
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		String str1="Mom dad child";
		String words[]=str1.toLowerCase().trim().split(" ");
		int palindromeCount=0;
		for(String word:words )
		{
			
			if(palindromeCount(word))
			{
				palindromeCount++;
				System.out.println(word);
			
			}
		}
		
		System.out.println(" Number of palindrome words " +palindromeCount);
	}

}
