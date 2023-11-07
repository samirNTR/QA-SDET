package Testing;

class InitialsExtractor {      //Print initials of each word
	
    public static void main(String[] args) {
    	
        String input = "I Love Java";
        String words[]=input.split(" ");
        
    StringBuilder sb= new StringBuilder();
    
    for(String word:words)
    {
        
        if(!word.isEmpty())
        
        sb.append(word.charAt(0)).  append(" ");
        
    }
        
        System.out.println(sb.toString().trim());
        
    }
}