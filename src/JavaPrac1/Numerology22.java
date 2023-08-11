package JavaPrac1;

import java.util.Scanner;


//Valid and invalid input
public class Numerology22 {

	


	    public static int calculateSingleDigit(int number) {
	        int sum = 0;

	        while (number > 0 || sum > 9) {
	            if (number == 0) {
	                number = sum;
	                sum = 0;
	            }
	            sum += number % 10;
	            number /= 10;
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        boolean continueProcessing = true;

	        while (continueProcessing) {
	            System.out.println("Enter your date of birth (dd/mm/yyyy):");
	            String dob = scanner.nextLine();
	            
	            String[] dobParts = dob.split("/");
	            if (dobParts.length != 3) {
	                System.out.println("Invalid input. Please enter a valid date of birth.");
	                continue;
	            }

	            int day = Integer.parseInt(dobParts[0]);
	            int month = Integer.parseInt(dobParts[1]);
	            int year = Integer.parseInt(dobParts[2]);

	            int dobSum = calculateSingleDigit(day) + calculateSingleDigit(month) + calculateSingleDigit(year);

	            int finalDobSum = calculateSingleDigit(dobSum);

	            int daySum = calculateSingleDigit(day);

	            System.out.println("Day of Birth (single digit): " + daySum);
	            System.out.println("Date of Birth sum (single digit): " + finalDobSum);

	            System.out.print("Do you want to proceed further? (Y/N): ");
	            String response = scanner.nextLine().trim().toLowerCase();

	            if (response.equals("n")) {
	                continueProcessing = false;
	            } else if (!response.equals("y")) {
	                System.out.println("Invalid response. Please enter 'Y' or 'N'.");
	            }
	        }

	        scanner.close();
	    }
	}

	
	

