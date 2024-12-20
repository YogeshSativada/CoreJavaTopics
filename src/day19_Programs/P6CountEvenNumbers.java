package day19_Programs;

public class P6CountEvenNumbers {

	public static void main(String[] args) {

		int count =0;
		for(int i=0;i<100;i+=2) {
			System.out.println(i);
			if(i%2==0) {
				count++;
			}
			System.out.println("Count is : "+ count);
		}

	}

}
