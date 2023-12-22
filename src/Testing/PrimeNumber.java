package Testing;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int number=2	; number<=100; number++)
		{
			int temp=0;
			
			for(int i=2; i<number; i++ )
			{
				
				if(number%i==0)
				{
					temp++;
					
				}
			}
			
				if(temp==0)
				{
					System.out.print(number+" ");
				}
			}
			
		}

	}

	/*
	 * public class PrimeNumbers {
	 * 
	 * public static boolean isPrime(int num) { 
	 * if (num <= 1) { 
	 * return false; 
	 * }
	 * 
	 * for (int i = 2; i <= Math.sqrt(num); i++) 
	 * 
	 * {
	 *  if (num % i == 0) { return false;
	 * } 
	 * }
	 * 
	 * return true; 
	 * }
	 * 
	 * public static void main(String[] args)
	 *  {
	 * System.out.println("Prime numbers between 1 and 100:");
	 * 
	 * for (int i = 2; i <= 100; i++) 
	 * {
	 *  if (isPrime(i)) { System.out.print(i + " ");
	 * } } } }
	 * 
	 * 
	 * 
	 */