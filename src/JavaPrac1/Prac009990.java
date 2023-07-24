package JavaPrac1;

public class Prac009990 {

	public static void main(String[] args) {
		
		String str= "zxyuia";
		
		int temp=0;
		char ch[]= str.toCharArray();
		
		for(int i=0 ; i<ch.length; i++)
		{
			
			for(int j=i+1; j<ch.length; j++)
			{
				
				if(ch[i]>ch[j])
				{
					
					temp= ch[i];
					
					ch[i]= ch[j];
					
					ch[j]= (char)temp;
				}
				
			}
		}
		
		
		System.out.println(new String(ch));

	}

}
