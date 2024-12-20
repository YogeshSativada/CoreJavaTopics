package day06_Polymorphism;

class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (overloaded)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles (overloaded)
    public double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphismDemo01 {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        
        // Calling overloaded methods
        System.out.println("Sum of 2 integers: " + math.add(5, 10));
        System.out.println("Sum of 3 integers: " + math.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + math.add(5.5, 10.5));
    }
}

