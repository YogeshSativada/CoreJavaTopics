package day05_ThisKeyword;

public class ThisDemo01 {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("John");
		student.setAge(20);
		student.displayInfo();
	}
}

class Student {
	private String name;
	private int age;

	public void setName(String name) {
		                                                               // Using 'this' to refer to the instance variable
		this.name = name;
	}

	public void setAge(int age) {
		                                                                 // Using 'this' to refer to the instance variable
		this.age = age;
	}

	public void displayInfo() {
	                                                                       	// Using 'this' to refer to the current object
		System.out.println("Name: " + this.name + ", Age: " + this.age);
	}
}
