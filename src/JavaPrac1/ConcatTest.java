package JavaPrac1;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConcatTest{  
    public static void main(String[] args){  
    	
    	
    String str= "I love Java";
           
        
        Map<Character, Integer> hm = new LinkedHashMap<Character,Integer>();
        
        hm.put('a',0);
           hm.put('e',0);
              hm.put('i',0);
                 hm.put('o',0);
                    hm.put('u',0);
                    
        for(int i=0 ; i<str.length(); i++)
        {
         char ch= Character.toLowerCase(str.charAt(i));
         
         if(hm.containsKey(ch))
         {
             hm.put(ch,hm.get(ch)+1);
         }
            
        }
        
    for(Map.Entry<Character,Integer> es:hm.entrySet())
    {
        System.out.println("Vowel :-"+es.getKey()+"> "+ es.getValue()+" Times");
    }
        
}}

    	
    
        /*long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){   
            sb.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Java");  
        for (int i=0; i<10000; i++){  
            sb2.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
    }  
}*/