package day01_Varibles;

public class VariblesDemo01 {
    // Class-level variables (static and non-static)
    static int staticVar = 100; // Static variable (shared across all instances)
    int instanceVar = 200;      // Instance variable (specific to each instance)

    public static void main(String[] args) {
        // Local variables (inside a method or block)
        int localVar = 10;

        // Printing the values of variables
        System.out.println("Static Variable: " + staticVar); // Accessing static variable
        System.out.println("Local Variable: " + localVar);

        // Accessing instance variable using an object
        VariblesDemo01 example = new VariblesDemo01();
        System.out.println("Instance Variable: " + example.instanceVar);
    }
}
