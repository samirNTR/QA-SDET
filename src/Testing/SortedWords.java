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
          System.out.println(al);
        
    }    
    
}
    
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
       