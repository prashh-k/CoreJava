package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
   
public class IteratorAndListIterator {

    public static void main(String[] args) {
        // Call the Iterator example function
        iteratorExample();

        // Call the ListIterator example function
        listIteratorExample();
    }

    /**
     * Function to demonstrate Iterator operations
     */
    public static void iteratorExample() {
        System.out.println("Iterator Example:");

        // Creating an ArrayList to iterate over
        // Iterator can be used for any Collection (e.g., ArrayList, LinkedList, etc.)
        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        // Creating an Iterator for the list
        Iterator<String> iterator = list.iterator();

        // Iterating through the elements using the Iterator
        System.out.println("Iterating through the list:");
        while (iterator.hasNext()) { // Check if there are more elements
            String element = iterator.next(); // Retrieve the next element
            System.out.println(element); // Print the element
        }

        // Removing an element while iterating
        iterator = list.iterator(); // Reset the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("Green")) {
                iterator.remove(); // Remove the element "Green" from the list
            }
        }
        System.out.println("List after removal: " + list);

        System.out.println(); // Blank line for separation
    }

    /**
     * Function to demonstrate ListIterator operations
     */
    public static void listIteratorExample() {
        System.out.println("ListIterator Example:");

        // Creating an ArrayList to iterate over
        // ListIterator can be used only for List implementations (e.g., ArrayList, LinkedList, etc.)
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Creating a ListIterator for the list
        ListIterator<String> listIterator = list.listIterator();

        // Iterating forward through the elements using the ListIterator
        System.out.println("Forward Iteration:");
        while (listIterator.hasNext()) { // Check if there are more elements
            String element = listIterator.next(); // Retrieve the next element
            System.out.println(element); // Print the element
        }

        // Iterating backward through the elements using the ListIterator
        System.out.println("\nBackward Iteration:");
        while (listIterator.hasPrevious()) { // Check if there are more elements in reverse
            String element = listIterator.previous(); // Retrieve the previous element
            System.out.println(element); // Print the element
        }

        // Adding an element while iterating
        listIterator = list.listIterator(); // Reset the ListIterator
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            if (element.equals("Banana")) {
                listIterator.add("Orange"); // Add "Orange" after "Banana"
            }
        }
        System.out.println("List after addition: " + list);

        System.out.println(); // Blank line for separation
    }
}