package JavaPrac1;

public class Const1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="AAABCCCDEEEFGGGH";
		
		char currentChar=str.charAt(0);
		
		System.out.print(currentChar);
		
		for(int i=1; i<str.length(); i++)
		{
			char nextChar=str.charAt(i);
			
			if(currentChar==nextChar)
			{
				System.out.print(nextChar);
			}
			else
			{
				System.out.println();
				System.out.print(nextChar);
			}
			
			currentChar=nextChar;
		}

	}

}
