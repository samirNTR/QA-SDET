package Testing;

import java.util.*;

public class SortedWords {
    public static void main(String[] args) {

        String str = "java coding is unique and java used by most programmers";
        String words[] = str.trim().split(" ");

        Map<String, Integer> hm = new LinkedHashMap<>();
        
        for (String word : words)
        {
            if (!word.isBlank()) 
            
                if (hm.containsKey(word))
                {
                    hm.put(word, hm.get(word) + 1);
                } else {
                    hm.put(word, 1);
                }
           
          }
       
          for(Map.Entry<String,Integer> es:hm.entrySet())
          {
              if(es.getValue()>1)
              System.out.println(es.getKey()+":"+es.getValue());
          }
         
         List<String> al= new ArrayList<>(hm.keySet());
          Collections.sort(al);
          // Collections.sort(al,Collections.reverseOrder()); descending order
          System.out.println(al);
          
          
          int temp=0;
          
          for(String word:al)
          {
        	  
        	  char ch[]=word.toCharArray();
        	  for(int i=0; i<ch.length; i++)
        	  {
        		  
        		  for(int j=i+1; j<ch.length; j++)
        		  {
        			  
        			  if(ch[i]>ch[j])
        			  {
        				  temp=ch[i];
        				  ch[i]=ch[j];
        				  
        				  ch[j]=(char)temp;
        			  }
        		  }
        	  }
        	System.out.println(new String(ch)+" ");
        	  //System.out.println(ch+" ");
        	 
          }
        
    }    
    
}



/*for(String word:words)
{
    char[] ch= word.toCharArray();
    
    Arrays.sort(ch);
    System.out.println(new String(ch)+" ");
}

    // Reversing the sorted characters to get descending order
    for (int i = 0; i < ch.length / 2; i++) {
        char temp = ch[i];
        ch[i] = ch[ch.length - 1 - i];
        ch[ch.length - 1 - i] = temp;
    }

    System.out.println("Sorted characters in descending order of " + word + ": " + new String(ch));
*/

    
/*
        for (String word : words) {
            if (!word.isBlank()) {
                if (hm.containsKey(word)) {
                    hm.put(word, hm.get(word) + 1);
                } else {
                    hm.put(word, 1);
                }
            }
        }

        // Sorting the map by keys
        List<String> sortedKeys = new ArrayList<>(hm.keySet());
        Collections.sort(sortedKeys);

*/
       