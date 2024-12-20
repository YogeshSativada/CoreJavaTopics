package day19_Programs;
import java.util.Scanner;

public class P1CheckingOddNoOrNot {

	public static void main(String[] args) {
//		int x = 11;
		 System.out.print("Enter an integer: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		if(x%2==1) {
			System.out.println("This is Odd Number");
		}
		else {
			System.out.println("This is Not Odd Number");
		}
	}

}
