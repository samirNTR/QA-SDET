package JavaPrac1;

import java.util.Scanner;

public class Prac788 {

	public static void main(String[] args) {


		for (int number = 1; number <= 100; number++) {
			int temp = 0;
	

			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					temp = temp + 1;
				}

			}

			if (temp == 0) {
				System.out.println(number);
			}
		}
	}
}
