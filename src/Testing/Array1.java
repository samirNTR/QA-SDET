package Testing;

public class Array1 {

	public static void main(String[] args) {
	
		int a[]= new int[]{10,12,14,99,956};
		
		int temp;
		
		for(int i=0; i<a.length;i++) 
		{
			
		for(int j=i+1; j<a.length;j++)
		{
			
			if(a[i]< a[j])
			{
				
				temp= a[i];
				
				a[i]= a[j];
				
				a[j]= temp;
				
			}
			
			
		}
			
		//System.out.println(a[i]);
			
		}
		
		System.out.println(a[0]);
		
	}
}
	
