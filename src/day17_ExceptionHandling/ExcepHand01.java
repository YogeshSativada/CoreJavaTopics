package day17_ExceptionHandling;

public class ExcepHand01 {
    public static void main(String[] args) {
        try {
            int division = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }
}

