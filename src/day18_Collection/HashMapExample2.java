package day18_Collection;

import java.util.HashMap;

public class HashMapExample2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        // Access value by key
        System.out.println("Value for key A: " + map.get("A"));

        // Check if a key exists
        System.out.println("Contains key B: " + map.containsKey("B"));

        // Check if a value exists
        System.out.println("Contains value 20: " + map.containsValue(20));

        // Remove a key-value pair
        map.remove("B");
        System.out.println("After removing key B: " + map);

        // Iterate through the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }
    }
}

