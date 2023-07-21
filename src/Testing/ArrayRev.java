package Testing;

import java.util.Scanner;

public class ArrayRev {


	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of an array");

		int num= sc.nextInt();


		int a[]= new int[num];

		System.out.println("Enter the elements into array");
		for(int i=0 ; i<a.length; i++)
		{

			a[i]=sc.nextInt();

		}

		System.out.println("Reversal of elements are");

		for(int i=a.length-1; i>=0; i--)
		{

			System.out.print(a[i]+" ");
		}

	}

}
