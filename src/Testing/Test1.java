package Testing;

class Test1 extends Test2
{
	
	public static void main(String[] args)
	{
		String str="MMABDDDMM";
		
		
		char ch[]=str.toCharArray();
		
		for(int i=0; i<=ch.length; i++)
		{
			
			for(int j=i; i<=ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println();
				}
				
				if(ch[i+1]==ch[j+1])
				{
					System.out.println(ch[i+1]);
				}
			}
			
		}
		
		
		
		
		
	}
	
	
}