package day18_Collection;

import java.util.ArrayList;

public class CollectionArrayList01 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        
        // Add elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // Access elements
        System.out.println("Name at index 1: " + names.get(1)); // Bob
        
        // Update element
        names.set(1, "David");
        System.out.println("Updated list: " + names); // [Alice, David, Charlie]
        
        // Remove element
        names.remove("Alice");
        System.out.println("After removal: " + names); // [David, Charlie]
        
        // Size of the list
        System.out.println("Size: " + names.size()); // 2
    }
}

