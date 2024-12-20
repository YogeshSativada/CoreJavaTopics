package day19_Programs;

public class P5CountOddNumbers {

	public static void main(String[] args) {

		int count =0;
		for(int i=1;i<100;i+=2) {
			System.out.println(i);
			if(i%2==1) {
				count++;
			}
			System.out.println("Count is : "+ count);
		}

	}

}
