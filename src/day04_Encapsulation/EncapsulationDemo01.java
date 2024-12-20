package day04_Encapsulation;

public class EncapsulationDemo01 {

	public static void main(String[] args) {
		user obj = new user();
//		System.out.println(obj.balance);
		obj.getBal(321);
		obj.setBal(500);
		obj.getBal(321);
	}
}

class user {
	private static int balance = 10000;

	public void getBal(int pin) {
		if (pin == 321) {
			System.out.println(balance);
		} else {
			System.out.println("Incorrect pin");
		}
	}

	public void setBal(int deposite) {
		balance = balance + deposite;

	}
}
