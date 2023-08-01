package JavaPrac1;

public class Reverse2 {



	    public static void main(String[] args)
	     {
	        String str="I love java";
	        String reverseWord="";
	        String words[]= str.trim().split(" ");
	        
	        for(int i=words.length-1; i>=0; i--)
	        {
	        	
	        	reverseWord=reverseWord+words[i]+" ";
	        }

	        System.out.println(reverseWord);
	     }
}





