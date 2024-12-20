package day18_Collection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate element, will not be added

        // Display the set
        System.out.println("HashSet: " + set);

        // Check if an element exists
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Remove an element
        set.remove("Banana");
        System.out.println("After removing 'Banana': " + set);

        // Iterate through elements
        System.out.println("Iterating:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Check the size
        System.out.println("Size of HashSet: " + set.size());
    }
}

