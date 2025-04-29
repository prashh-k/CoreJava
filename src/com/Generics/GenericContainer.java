package com.Generics;


import java.util.ArrayList;
import java.util.List;

// Generic class declaration
public class GenericContainer<T> { // <T> means this class can work with any type T
    private List<T> elements; // A list to hold elements of type T

    // Constructor to initialize the container
    public GenericContainer() {
        elements = new ArrayList<>();
    }

    // Function 1: Add an element to the container
    public void addElement(T element) {
        elements.add(element); // Add the element to the list
        System.out.println("Added element: " + element);
    }

    // Function 2: Retrieve an element by its index
    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index); // Return the element at the specified index
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    // Function 3: Print all elements in the container
    public void printElements() {
        System.out.println("Elements in the container: " + elements);
    }

    // Function 4: Find the maximum element (if elements are comparable)
    public T findMax() {
        if (elements.isEmpty()) {
            throw new IllegalStateException("Container is empty");
        }
        if (!(elements.get(0) instanceof Comparable)) {
            throw new IllegalArgumentException("Elements are not comparable");
        }
        T max = elements.get(0); // Assume the first element is the maximum
        for (T element : elements) {
            if (((Comparable<T>) element).compareTo(max) > 0) { // Cast to Comparable to use compareTo
                max = element; // Update the maximum element
            }
        }
        return max;
    }

    // Main method to test the GenericContainer
    public static void main(String[] args) {
        // Create a GenericContainer for Integers
        GenericContainer<Integer> intContainer = new GenericContainer<>();
        intContainer.addElement(10);
        intContainer.addElement(20);
        intContainer.addElement(5);
        intContainer.printElements();
        System.out.println("Maximum element: " + intContainer.findMax());

        // Create a GenericContainer for Strings
        GenericContainer<String> stringContainer = new GenericContainer<>();
        stringContainer.addElement("Apple");
        stringContainer.addElement("Banana");
        stringContainer.addElement("Cherry");
        stringContainer.printElements();
        System.out.println("Maximum element: " + stringContainer.findMax());

        // Retrieve an element by index
        System.out.println("Element at index 1 (Integer): " + intContainer.getElement(1));
        System.out.println("Element at index 0 (String): " + stringContainer.getElement(0));
    }
}