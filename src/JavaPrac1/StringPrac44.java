package JavaPrac1;

public class StringPrac44 {

	public static void main(String[] args) {
		
	String str="I love java";
	
	
	String words[]=str.trim().split(" ");
	
	for(int i=0 ; i<=words.length-1; i++) {
		
		
	StringBuilder sb= new StringBuilder(words[i]);
	
	if(i%2==1)
	{
		
	words[i]=sb.reverse().toString();
	}
		
		
	}
		
		String result=String.join(" ", words);
		
		System.out.println(result);
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

		/*String str = "    I love java";
		
		String words[]= str.trim().split(" ");
		String reverseString="";

		for(int i=0; i<words.length-1; i++)
		{
			
			String word=words[i];
			String reverseWord="";
			
			for(int j=word.length()-1; j>=0; j--)
			{
				
				reverseWord=reverseWord+word.charAt(j);
			}
			
			if(i%2==1)
			{
				
			
			reverseString=reverseString+reverseWord+" ";
			}
			
			else {
				
				reverseString = reverseString + word + " ";
			}
		}
		
		if (words.length % 2 == 1) {
            reverseString = reverseString + words[words.length - 1];
        }
		
		System.out.println(reverseString);
		
	}	
		
}*/
/*
 * for (int i = 0; i < str1.length; i++) { String word = str1[i];
 * 
 * String reverseWord = "";
 * 
 * // Check if the index is even if (i % 2 == 1) { for (int j = word.length() -
 * 1; j >= 0; j--) { reverseWord = reverseWord + word.charAt(j); } } else {
 * reverseWord = word; // If the index is odd, keep the word as it is }
 * 
 * reverseString = reverseString + reverseWord + " "; }
 * 
 * System.out.println("Reverse string with alternate words reversed:\n" +
 * reverseString.trim()); } }
 */