package day17_ExceptionHandling;

public class ExcepHand3 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ"); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}


