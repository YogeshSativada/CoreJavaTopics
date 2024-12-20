package day10_Operators;

public class OperatorsDemo {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;

		System.out.println(a + b);  // Output: 15 (Addition)
		System.out.println(a - b);  // Output: 5 (Subtraction)
		System.out.println(a * b);  // Output: 50 (Multiplication)
		System.out.println(a / b);  // Output: 2 (Division)
		System.out.println(a % b);  // Output: 0 (Modulus)
		
		System.out.println("***********************************************************************");

		int x = 10; 
		int y = 20;

		System.out.println(x == y);  // Output: false (Equal to)
		System.out.println(x != y);  // Output: true (Not equal to)
		System.out.println(x > y);   // Output: false (Greater than)
		System.out.println(x < y);   // Output: true (Less than)
		System.out.println(x >= y);  // Output: false (Greater than or equal to)
		System.out.println(x <= y);  // Output: true (Less than or equal to)
		
		System.out.println("***********************************************************************");
		
		boolean c = true;
		boolean d = false;

		System.out.println(c && d);  // Output: false (Logical AND)
		System.out.println(c || d);  // Output: true (Logical OR)
		System.out.println(!c);      // Output: false (Logical NOT)
		
		System.out.println("***********************************************************************");
		
		int num = 10;
		num += 5;  // num = num + 5
		System.out.println(num);  // Output: 15

		num -= 3;  // num = num - 3
		System.out.println(num);  // Output: 12

		num *= 2;  // num = num * 2
		System.out.println(num);  // Output: 24

		num /= 4;  // num = num / 4
		System.out.println(num);  // Output: 6

		num %= 3;  // num = num % 3
		System.out.println(num);  // Output: 0
		
		System.out.println("***********************************************************************");

		int m = 5;
		System.out.println(+m);  // Output: 5 (Unary plus)
		System.out.println(-m);  // Output: -5 (Unary minus)

		m++;  // Increment
		System.out.println(m);  // Output: 6

		m--;  // Decrement
		System.out.println(m);  // Output: 5

		boolean n = true;
		System.out.println(!n);  // Output: false (Logical NOT)

		System.out.println("***********************************************************************");
		
		int p = 10;
		int q = 20;
		int result = (p > q) ? p : q;  // If p > q, result = p; otherwise, result = q
		System.out.println(result);  // Output: 20
	}

}
