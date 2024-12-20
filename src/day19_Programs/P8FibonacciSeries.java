package day19_Programs;

public class P8FibonacciSeries {

	public static void main(String[] args) {
	int number = 7;
	int a =0, b=1;
	
	System.out.print(a +" "+ b);
	
	for(int i=2; i<number;i++) {
		int sum = a+b;
		System.out.print(" " + sum);
		a=b;
		b=sum;
	}

	}

}
