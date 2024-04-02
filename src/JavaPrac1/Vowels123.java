package JavaPrac1;


public class Vowels123 {

	public static void main(String[] args) {
		

int row=5;
 int num=1;
 
 for(int i=1; i<=row; i++)
 {
	 
	 for(int j=1; j<=row; j++)
	 {
		 System.out.print(" ");
	 }
	 
	 for(int j=1; j<=i; j++)
	 {
		 System.out.print(i+" ");
		 num++;
	 }
	 
	 System.out.println();
 }
	
	}

}
