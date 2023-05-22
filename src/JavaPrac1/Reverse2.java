package JavaPrac1;

public class Reverse2 {
	
	
	
	    public static void main(String[] args)
	     {
	        String originalString="I LOVE JAVA";
	        String reversedString="";
	        
	        String[] words= originalString.split(" ");
	        
	        for(int i=words.length-1; i>=0; i--)
	        {
	        	
	        	reversedString= reversedString+words[i]+" ";
	        	
	        		
	        }
	        System.out.println(reversedString.trim());
	     }
	        
	     }
	    
	    
	    
	    


