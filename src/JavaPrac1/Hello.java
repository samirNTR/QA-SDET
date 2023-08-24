package JavaPrac1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class Hello {
    
  public static void countWord(String str)
  {
      
     String words[]= str.trim().toLowerCase().split(" ");
     
     int count= words.length;
     
Map<String,Integer> hm = new LinkedHashMap <String,Integer>();
     
     for(String word:words)
     {
         
         if(hm.containsKey(word))
         {
             
             hm.put(word, hm.get(word)+1);
         }
         
         else
         {
             hm.put(word,1);
             
         }
     }
      
     Set<Map.Entry<String,Integer>> entryset= hm.entrySet();
     
     for(Map.Entry<String,Integer>es1:entryset )
     {
         
         System.out.println(es1.getKey()+" "+es1.getValue());
         
     }
     
      System.out.println("Total words are: "+count);
      
  }
    
    public static void main(String[] args) {
       
       String str="I love java";
       
       countWord(str);
    }
}
      