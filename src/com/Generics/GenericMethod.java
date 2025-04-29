package com.Generics;

import java.util.List;

// Utility class with generic methods
public class GenericMethod {

    // Function 1: Generic method to swap two elements in an array
    public static <T> void swap(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Invalid indices");
        }
        T temp = array[index1]; // Temporarily store the first element
        array[index1] = array[index2]; // Swap the first element with the second
        array[index2] = temp; // Assign the temporary value back to the second index
        System.out.println("Swapped elements: " + array[index1] + ", " + array[index2]);
    }

    // Function 2: Generic method to find the maximum of three elements
    public static <T extends Comparable<T>> T findMaximum(T a, T b, T c) {
        T max = a; // Assume the first element is the maximum
        if (b.compareTo(max) > 0) {
            max = b; // Update max if 'b' is greater
        }
        if (c.compareTo(max) > 0) {
            max = c; // Update max if 'c' is greater
        }
        return max;
    }

    // Function 3: Generic method to print elements of a list
    public static <T> void printList(List<T> list) {
        System.out.println("List elements:");
        for (T element : list) {
            System.out.println(element);
        }
    }

    // Function 4: Generic method to check if two objects are equal
    public static <T> boolean areEqual(T obj1, T obj2) {
        return obj1.equals(obj2); // Compare the two objects using the equals method
    }

    // Main method to test generic methods
    public static void main(String[] args) {
        // Testing Function 1: Swap elements in an array
        Integer[] numbers = {1, 2, 3, 4};
        System.out.println("Original array: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();
        swap(numbers, 1, 3); // Swap elements at index 1 and 3
        System.out.println("After swapping: ");
        for (int n : numbers) System.out.print(n + " ");
        System.out.println();

        // Testing Function 2: Find the maximum of three elements
        System.out.println("Maximum of (3, 7, 5): " + findMaximum(3, 7, 5));
        System.out.println("Maximum of (Apple, Orange, Banana): " + findMaximum("Apple", "Orange", "Banana"));

        // Testing Function 3: Print elements of a list
        List<String> fruits = List.of("Apple", "Banana", "Cherry");
        printList(fruits);

        // Testing Function 4: Check if two objects are equal
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("Are 'Hello' and 'Hello' equal? " + areEqual(str1, str2));
    }
}