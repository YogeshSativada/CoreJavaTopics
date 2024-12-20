package day08_Inheritance;

//Superclass
class Animal0 {
 void sound() {
     System.out.println("Animal makes a sound.");
 }
}

//Subclass
class Dog01 extends Animal0 {
 @Override
 void sound() {
     System.out.println("Dog barks.");
 }
}

public class InheritanceDemo2 {
 public static void main(String[] args) {
     Animal0 myAnimal = new Animal0();
     Animal0 myDog = new Dog01();
     
     myAnimal.sound();  // Calls Animal's sound
     myDog.sound();     // Calls Dog's sound (overridden method)
 }
}



