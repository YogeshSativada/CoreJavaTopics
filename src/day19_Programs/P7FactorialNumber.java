package day19_Programs;

import java.util.Scanner;
public class P7FactorialNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial *=i; 
		}
		
		System.out.println("fatorial of entered number is :" + factorial );

	}

}
