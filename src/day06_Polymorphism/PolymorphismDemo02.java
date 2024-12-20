package day06_Polymorphism;

//Parent class
class Animal {
 public void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Child class
class Dog extends Animal {
 @Override
 public void sound() {
     System.out.println("Dog barks");
 }
}

//Another child class
class Cat extends Animal {
 @Override
 public void sound() {
     System.out.println("Cat meows");
 }
}

public class PolymorphismDemo02 {
 public static void main(String[] args) {
     Animal myAnimal = new Animal();  // Creating an Animal object
     Animal myDog = new Dog();        // Creating a Dog object
     Animal myCat = new Cat();        // Creating a Cat object

     myAnimal.sound();  // Outputs: Animal makes a sound
     myDog.sound();     // Outputs: Dog barks
     myCat.sound();     // Outputs: Cat meows
 }
}

