package day08_Inheritance;

//Superclass
class Animal {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Subclass
class Dog extends Animal {
 void bark() {
     System.out.println("The dog barks.");
 }
}

public class InheritanceDemo01 {
 public static void main(String[] args) {
     Dog dog = new Dog();
     dog.eat();  // Inherited from Animal class
     dog.bark(); // Defined in Dog class
 }
}

