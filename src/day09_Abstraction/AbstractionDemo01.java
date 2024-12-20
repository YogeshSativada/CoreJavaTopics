package day09_Abstraction;

                                                                 //Abstract class
abstract class Animal {
                                                                 // Abstract method (does not have a body)
abstract void sound();

                                                                   // Regular method
void sleep() {
   System.out.println("This animal is sleeping.");
}
}

                                                                    //Subclass (inheriting from Animal)
class Dog extends Animal {
                                                                   // Providing implementation for abstract method
void sound() {
   System.out.println("Bark");
}
}

class AbstractionDemo01 {
public static void main(String[] args) {
   Animal myDog = new Dog();                       // Create a Dog object
   myDog.sound();                                          // Call the sound method
   myDog.sleep();                                           // Call the sleep method
}
}
