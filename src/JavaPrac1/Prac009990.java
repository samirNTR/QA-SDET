package JavaPrac1;

import java.util.Scanner;

class Prac009990
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the number ");
        int num = sc.nextInt();
        sc.close();
        
        boolean isPrime=true;
        
        if(num<=1)
        {
        	isPrime=false;
        	
        }
        else
        {
        	
        	for(int i=2; i<=Math.sqrt(num); i++)
        	{
        		if(num%i==0)
        		{
        			isPrime=false;
        			break;
        		}
        		
        	}
        	
        	if(isPrime)
        	{
        		System.out.println("It's a prime number");
        	}
        	
        	else
        	{
        		
        		System.out.println("Its not a prime");
        	}
        	
        	
        }
		/*
		 * boolean isPrime = true;
		 * 
		 * if (num <= 1) { isPrime = false; } else { for (int i = 2; i <=
		 * Math.sqrt(num); i++) { if (num % i == 0) { isPrime = false; break; } } }
		 * 
		 * if (isPrime) { System.out.println("It's a prime number: " + num); } else {
		 * System.out.println("It's not a prime number: " + num); }
		 */
    }}
