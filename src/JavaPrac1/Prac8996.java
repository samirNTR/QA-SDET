
package JavaPrac1;

class Prac8996 {

	public static void main(String[] args) {


		int row=4, n=1;

		for(int i=1 ; i<=row; i++)
		{


			for(int j=1; j<=i; j++)
			{
				if(i==j)
				{
					System.out.print(n);

				}

				else {
					System.out.print(n+"* ");

				}
				n++;
			}
			
			System.out.println();
		}

	}

}












	

/*
 * int num=4; int n=1; for(int i=1 ; i<=num; i++) {
 * 
 * for(int j=1; j<=i; j++) { if(j==i) {
 * 
 * System.out.print(n); // i=2 j=1 2* 3 // j=2 } else {
 * System.out.print(n+"* "); } n++;
 * 
 * } //Inner loop ends
 * 
 * System.out.println();
 * 
 * } //Outer loop ends } }
 */