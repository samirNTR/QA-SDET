package JavaPrac1;

import java.util.Scanner;

public class Numerology {



	    public static int calculateSingleDigit(int number) {
	        int sum = 0;

	        while (number > 0 || sum > 9) {
	            if (number == 0) {
	                number = sum;
	                sum = 0;
	            }                                                                                  
	            sum = sum+number % 10;                                       
	            number =number/ 10;                                            
	        }                                                                                      

	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter your date of birth (dd/mm/yyyy):");
	        String dob = scanner.nextLine();
	        scanner.close();

	        String[] dobParts = dob.split("/");
	        int day = Integer.parseInt(dobParts[0]);
	        int month = Integer.parseInt(dobParts[1]);
	        int year = Integer.parseInt(dobParts[2]);

	        int dobSum = calculateSingleDigit(day) + calculateSingleDigit(month) + calculateSingleDigit(year);

	        int finalDobSum = calculateSingleDigit(dobSum);

	        int daySum = calculateSingleDigit(day);

	        System.out.println("Day of Birth (single digit): " + daySum);
	        System.out.println("Date of Birth sum (single digit): " + finalDobSum);
	    }
	}

