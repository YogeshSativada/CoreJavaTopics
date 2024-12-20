package day16_Strings;

public class StringsDemo2 {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";
        String str2 = "Java";

        // 1. length()
        System.out.println("Length of str: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. substring()
        System.out.println("Substring from index 2 to 5: " + str.substring(2, 5));

        // 4. contains()
        System.out.println("Contains 'World': " + str.contains("World"));

        // 5. equals()
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));

        // 6. equalsIgnoreCase()
        System.out.println("EqualsIgnoreCase 'hello, world!': " + str.trim().equalsIgnoreCase("hello, world!"));

        // 7. startsWith()
        System.out.println("Starts with '  He': " + str.startsWith("  He"));

        // 8. endsWith()
        System.out.println("Ends with '!  ': " + str.endsWith("!  "));

        // 9. indexOf()
        System.out.println("Index of 'o': " + str.indexOf('o'));

        // 10. lastIndexOf()
        System.out.println("Last index of 'o': " + str.lastIndexOf('o'));

        // 11. isEmpty()
        System.out.println("Is str empty: " + str.isEmpty());

        // 12. trim()
        System.out.println("Trimmed str: '" + str.trim() + "'");

        // 13. toLowerCase()
        System.out.println("Lowercase str: " + str.toLowerCase());

        // 14. toUpperCase()
        System.out.println("Uppercase str: " + str.toUpperCase());

        // 15. replace()
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // 16. replaceAll()
        System.out.println("Replace all 'l' with 'L': " + str.replaceAll("l", "L"));

        // 17. split()
        String[] parts = str.split(",");
        System.out.println("Split str by ',' into:");
        for (String part : parts) {
            System.out.println("  " + part);
        }

        // 18. join()
        System.out.println("Join strings with '-': " + String.join("-", "Hello", "World"));

        // 19. concat()
        System.out.println("Concatenation with str2: " + str.trim().concat(" ").concat(str2));

        // 20. compareTo()
        System.out.println("Comparison with 'Java': " + str.compareTo(str2));

        // 21. compareToIgnoreCase()
        System.out.println("Comparison (ignore case) with 'java': " + str.trim().compareToIgnoreCase("java"));

        // 22. matches()
        System.out.println("Matches regex '.*World.*': " + str.matches(".*World.*"));

        // 23. valueOf()
        int num = 123;
        System.out.println("Value of num as String: " + String.valueOf(num));

        // 24. intern()
        String interned = str.intern();
        System.out.println("Interned string: " + interned);

        // 25. toCharArray()
        char[] charArray = str.toCharArray();
        System.out.print("Character array: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // 26. format()
        System.out.println("Formatted string: " + String.format("Hello, %s!", "Java"));

        // 27. getBytes()
        byte[] byteArray = str.getBytes();
        System.out.print("Byte array: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();

        // 28. regionMatches()
        System.out.println("Region matches 'Hello': " + str.trim().regionMatches(0, "Hello", 0, 5));
    }
}


