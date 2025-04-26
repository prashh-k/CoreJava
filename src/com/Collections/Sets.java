package com.Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        // Call the HashSet example function
        hashSetExample();

        // Call the TreeSet example function
        treeSetExample();
    }

    /**
     * Function to demonstrate HashSet operations
     */
    public static void hashSetExample() {
        System.out.println("HashSet Example:");

        // Create a HashSet to store unique elements
        HashSet<String> hashSet = new HashSet<>();
        
        // Adding elements to the HashSet
        // HashSet does not allow duplicate elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate element, will not be added

        // Display the HashSet contents
        // HashSet does not maintain any specific order
        System.out.println("HashSet contents: " + hashSet);

        // Removing an element from the HashSet
        hashSet.remove("Banana"); // Remove 'Banana' from the set
        System.out.println("After Removing 'Banana': " + hashSet);

        // Check if a specific element exists in the HashSet
        boolean containsCherry = hashSet.contains("Cherry"); // Check for 'Cherry'
        System.out.println("Does HashSet contain 'Cherry'? " + containsCherry);

        System.out.println(); // Blank line for separation
    }

    /**
     * Function to demonstrate TreeSet operations
     */
    public static void treeSetExample() {
        System.out.println("TreeSet Example:");

        // Create a TreeSet to store unique elements in sorted order
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        // TreeSet automatically sorts the elements in natural order
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Apple"); // Duplicate element, will not be added

        // Display the TreeSet contents
        System.out.println("TreeSet contents (sorted): " + treeSet);

        // Retrieve the first and last elements in the TreeSet
        // TreeSet allows efficient retrieval of these elements
        String firstElement = treeSet.first(); // Get the first element
        String lastElement = treeSet.last();   // Get the last element
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Removing an element from the TreeSet
        treeSet.remove("Banana"); // Remove 'Banana' from the set
        System.out.println("After Removing 'Banana': " + treeSet);

        System.out.println(); // Blank line for separation
    }
}