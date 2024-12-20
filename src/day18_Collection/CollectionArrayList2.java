package day18_Collection;

import java.util.ArrayList;

public class CollectionArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Add numbers
        for (int i = 1; i <= 5; i++) {
            numbers.add(i);
        }
        
        // Iterate using a loop
        for (int number : numbers) {
            System.out.println(number);
        }
        
        // Check if a number exists
        System.out.println("Contains 3? " + numbers.contains(3)); // true
        
        System.out.println(numbers);
        
        // Remove an element by index
        numbers.remove(2);
        System.out.println("After removal: " + numbers); // [1, 2, 4, 5]
        
    }
}


