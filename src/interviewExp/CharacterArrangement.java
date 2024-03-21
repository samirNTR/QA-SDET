package interviewExp;

public class CharacterArrangement {

public static void main(String[] args) {
        
        String str="AABEDFFFGHIII";
        
         System.out.print(str.charAt(0));
         
         char previousNum=str.charAt(0);
         
         for(int i=1 ; i<str.length(); i++)
         {
             if(str.charAt(i)==previousNum)
             {
                  System.out.print(str.charAt(i));
             }
             else
             {
                   System.out.println();
                    System.out.print(str.charAt(i));
                    previousNum=str.charAt(i);
             }
         }
      
    }
}