package day17_ExceptionHandling;

public class ExcepHand2 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds. : "+ e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred. : "+ e.getMessage());
        }
    }
}


