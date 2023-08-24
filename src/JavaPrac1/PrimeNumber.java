package JavaPrac1;

public class PrimeNumber {
	

public static int isPrime(int num)
{
	
	
	for(int i=2; i <= Math.sqrt(num); i++)
	
	{
		if(num%i==0)
		{
			return 0;
		}
		
	}
	
	return num;
}

public static void main(String [] args)
{
	
	System.out.println("Prime numbers are :-");
	
	for(int i=2; i<=100; i++)
	{
		int result =isPrime(i);
		if(result!=0)
		System.out.println(result +" ");	
		
	}
	
}
}







/*
 * 
 * public static boolean isPrime(int num) { if (num <= 1) { return false; }
 * 
 * for (int i = 2; i <= Math.sqrt(num); i++) { if (num % i == 0) { return false;
 * } }
 * 
 * return true; }
 * 
 * public static void main(String[] args) {
 * System.out.println("Prime numbers between 1 and 100:");
 * 
 * for (int i = 2; i <= 100; i++) { if (isPrime(i)) { System.out.println(i +
 * " "); } } } }
 * 
 * 
 * 
 */