package day13_ScannerClass;

import java.util.Scanner;

public class ScannerClassForAllDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);

        // Input a float
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("You entered: " + floatValue);

        // Input a double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered: " + doubleValue);

        // Input a long
        System.out.print("Enter a long: ");
        long longValue = scanner.nextLong();
        System.out.println("You entered: " + longValue);

        // Input a short
        System.out.print("Enter a short: ");
        short shortValue = scanner.nextShort();
        System.out.println("You entered: " + shortValue);

        // Input a byte
        System.out.print("Enter a byte: ");
        byte byteValue = scanner.nextByte();
        System.out.println("You entered: " + byteValue);

        // Input a boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("You entered: " + booleanValue);

        // Clear the buffer
        scanner.nextLine(); // Consume the newline left after the boolean input

        // Input a String (single word)
        System.out.print("Enter a single word: ");
        String singleWord = scanner.next();
        System.out.println("You entered: " + singleWord);

        // Clear the buffer
        scanner.nextLine(); // Consume the newline left after the single word input

        // Input a full line of text
        System.out.print("Enter a full line of text: ");
        String fullLine = scanner.nextLine();
        System.out.println("You entered: " + fullLine);

        scanner.close();
    }
}

