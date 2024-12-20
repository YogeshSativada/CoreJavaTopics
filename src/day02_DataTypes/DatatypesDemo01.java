package day02_DataTypes;

public class DatatypesDemo01 {
    public static void main(String[] args) {
        // Integer types
        byte smallNumber = 120;          // 1 byte
        short mediumNumber = 32000;     // 2 bytes
        int integerNumber = 2147483647; // 4 bytes
        long largeNumber = 9223372036854775807L; // 8 bytes

        // Floating-point types
        float decimalNumber = 3.14f;    // 4 bytes
        double largeDecimal = 3.14159265359; // 8 bytes

        // Character type
        char singleCharacter = 'A';    // 2 bytes (Unicode)

        // Boolean type
        boolean isJavaFun = true;

        // Print examples
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + mediumNumber);
        System.out.println("Int value: " + integerNumber);
        System.out.println("Long value: " + largeNumber);
        System.out.println("Float value: " + decimalNumber);
        System.out.println("Double value: " + largeDecimal);
        System.out.println("Char value: " + singleCharacter);
        System.out.println("Boolean value: " + isJavaFun);
        
        // String
        String greeting = "Hello, Java!";

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};   // Array of integers
        String[] fruits = {"Apple", "Banana", "Cherry"}; // Array of strings

        // Printing non-primitive types
        System.out.println("String: " + greeting);
        System.out.println("First number in array: " + numbers[0]);
        System.out.println("First fruit in array: " + fruits[0]);
        
    }
}

