package day09_Abstraction;

//Interface
interface Animal2 {
 // Abstract method (does not have a body)
 void sound();

 // Default method (with implementation)
 default void sleep() {
     System.out.println("This animal is sleeping.");
 }
}

//Class implementing the interface
class Dog2 implements Animal2 {
 // Providing implementation for the abstract method
 public void sound() {
     System.out.println("Bark");
 }
}

class AbstractionDemo02 {
 public static void main(String[] args) {
     Animal2 myDog = new Dog2();  // Create a Dog object
     myDog.sound();  // Call the sound method
     myDog.sleep();  // Call the sleep method
 }
}

