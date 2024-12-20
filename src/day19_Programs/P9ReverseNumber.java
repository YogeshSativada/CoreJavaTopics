package day19_Programs;

import java.util.Scanner;

public class P9ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input from the user
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		int reverse = 0;

		// Reverse logic
		while (number != 0) {
			int digit = number % 10; // Extract last digit
			reverse = reverse * 10 + digit; // Append digit to reverse
			number = number / 10; // Remove last digit
		}

		System.out.println("Reversed Number: " + reverse);
	}
}
