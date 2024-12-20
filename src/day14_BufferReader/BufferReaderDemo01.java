package day14_BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo01 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            // Reading a string
            System.out.print("Enter a string: ");
            String str = reader.readLine();
            System.out.println("You entered: " + str);

            // Reading an integer
            System.out.print("Enter an integer: ");
            int integer = Integer.parseInt(reader.readLine());
            System.out.println("You entered: " + integer);

            // Reading a double
            System.out.print("Enter a double: ");
            double doubleValue = Double.parseDouble(reader.readLine());
            System.out.println("You entered: " + doubleValue);

            // Reading a boolean
            System.out.print("Enter a boolean (true/false): ");
            boolean boolValue = Boolean.parseBoolean(reader.readLine());
            System.out.println("You entered: " + boolValue);

            // Reading a float
            System.out.print("Enter a float: ");
            float floatValue = Float.parseFloat(reader.readLine());
            System.out.println("You entered: " + floatValue);

            // Reading a long
            System.out.print("Enter a long: ");
            long longValue = Long.parseLong(reader.readLine());
            System.out.println("You entered: " + longValue);

            // Reading a short
            System.out.print("Enter a short: ");
            short shortValue = Short.parseShort(reader.readLine());
            System.out.println("You entered: " + shortValue);

            // Reading a character
            System.out.print("Enter a character: ");
            char charValue = reader.readLine().charAt(0);
            System.out.println("You entered: " + charValue);

        } catch (IOException e) {
            System.err.println("An error occurred while reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        }
    }
}

