package day08_Inheritance;

//Superclass
class Animal2 {
 void sound() {
     System.out.println("Animal makes a sound.");
 }
}

//Subclass
class Dog2 extends Animal2 {
 @Override
 void sound() {
     System.out.println("Dog barks.");
 }
 
 void callSuperSound() {
     super.sound(); // Calls the superclass method
 }
}

public class InheritanceSuperDemo03 {
 public static void main(String[] args) {
     Dog2 dog = new Dog2();
     dog.sound();         // Calls Dog's overridden method
     dog.callSuperSound(); // Calls Animal's sound method via super
 }
}

