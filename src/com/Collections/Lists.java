package com.Collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {

    public static void main(String[] args) {
        // Demonstrate ArrayList functionality
        arrayListExample();

        // Demonstrate LinkedList functionality
        linkedListExample();
    }

    // Function to demonstrate ArrayList operations
    public static void arrayListExample() {
        System.out.println("ArrayList Example:");

        // Creating an ArrayList and adding elements
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Red");
        arrayList.add("Green");
        arrayList.add("Blue"); // Adding elements to ArrayList

        System.out.println("Initial ArrayList: " + arrayList);

        // Removing an element
        arrayList.remove("Green");
        System.out.println("After Removing 'Green': " + arrayList);

        // Accessing an element
        String element = arrayList.get(1);
        System.out.println("Element at index 1: " + element);

        // Checking the size
        int size = arrayList.size();
        System.out.println("Size of ArrayList: " + size);

        System.out.println();
    }

    // Function to demonstrate LinkedList operations
    public static void linkedListExample() {
        System.out.println("LinkedList Example:");

        // Creating a LinkedList and adding elements
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit"); // Adding elements to LinkedList

        System.out.println("Initial LinkedList: " + linkedList);

        // Adding elements at specific positions
        linkedList.addFirst("Horse");
        linkedList.addLast("Mouse");
        System.out.println("After Adding 'Horse' and 'Mouse': " + linkedList);

        // Removing the first element
        linkedList.removeFirst();
        System.out.println("After Removing First Element: " + linkedList);

        // Checking if a specific element exists
        boolean containsRabbit = linkedList.contains("Rabbit");
        System.out.println("Does LinkedList contain 'Rabbit'? " + containsRabbit);

        System.out.println();
    }
}