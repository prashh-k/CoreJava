package com.Collections;

import java.util.HashMap;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {
        // Call the HashMap example function
        hashMapExample();

        // Call the TreeMap example function
        treeMapExample();
    }

    /**
     * Function to demonstrate HashMap operations
     */
    public static void hashMapExample() {
        System.out.println("HashMap Example:");

        // Creating a HashMap
        // HashMap is used to store key-value pairs and allows null keys and values
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        // Keys in HashMap are unique, but values can be duplicated
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");

        // Adding a duplicate key to demonstrate overwrite behavior
        hashMap.put(3, "Date"); // This will overwrite the previous value for key '3'

        // Displaying the contents of the HashMap
        // HashMap does not maintain any specific order
        System.out.println("HashMap contents: " + hashMap);

        // Removing a key-value pair from the HashMap
        hashMap.remove(2); // Remove the key '2' along with its value
        System.out.println("After Removing key '2': " + hashMap);

        // Checking if a key exists in the HashMap
        boolean containsKey = hashMap.containsKey(1); // Check for key '1'
        System.out.println("Does HashMap contain key '1'? " + containsKey);

        // Checking if a value exists in the HashMap
        boolean containsValue = hashMap.containsValue("Banana"); // Check for value 'Banana'
        System.out.println("Does HashMap contain value 'Banana'? " + containsValue);

        System.out.println(); // Blank line for separation
    }

    /**
     * Function to demonstrate TreeMap operations
     */
    public static void treeMapExample() {
        System.out.println("TreeMap Example:");

        // Creating a TreeMap
        // TreeMap stores key-value pairs in sorted order (based on the keys)
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put(3, "Dog");
        treeMap.put(1, "Cat");
        treeMap.put(2, "Rabbit");

        // Displaying the contents of the TreeMap
        // TreeMap automatically sorts the entries by keys
        System.out.println("TreeMap contents (sorted by keys): " + treeMap);

        // Retrieving the first and last entries from the TreeMap
        Integer firstKey = treeMap.firstKey(); // Get the smallest key
        Integer lastKey = treeMap.lastKey();   // Get the largest key
        System.out.println("First Key: " + firstKey);
        System.out.println("Last Key: " + lastKey);

        // Removing a key-value pair from the TreeMap
        treeMap.remove(2); // Remove the key '2' along with its value
        System.out.println("After Removing key '2': " + treeMap);

        // Checking if a key exists in the TreeMap
        boolean containsKey = treeMap.containsKey(3); // Check for key '3'
        System.out.println("Does TreeMap contain key '3'? " + containsKey);

        System.out.println(); // Blank line for separation
    }
}	