package day17_ExceptionHandling;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(15);  // Passing an invalid age
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // Method to check if age is valid
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }
        System.out.println("Age is valid.");
    }
}

