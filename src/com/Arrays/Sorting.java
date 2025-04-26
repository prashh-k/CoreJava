package com.Arrays;

/*
 * Sorting in Arrays:
 * - Java provides built-in methods for sorting arrays using the `Arrays.sort()` function.
 * - You can also implement custom sorting algorithms for specific scenarios.
 * - This program demonstrates sorting an array using both known functions and a custom method (Bubble Sort).
 */

import java.util.Arrays;

public class Sorting {

    // Function to sort an array using the built-in Arrays.sort() method
    public static void sortUsingBuiltInMethod() {
        System.out.println("Sorting Using Built-in Function:");

        int[] numbers = {50, 30, 20, 40, 10}; // Original unsorted array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Sorting the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(numbers));

    }

    // Function to sort an array using a custom sorting algorithm (Bubble Sort)
    public static void sortUsingCustomMethod() {
        System.out.println("Sorting Using Custom Bubble Sort:");

        int[] numbers = {60, 20, 80, 40, 10}; // Original unsorted array
        System.out.println("Original Array: " + Arrays.toString(numbers));

        // Bubble Sort implementation
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Swap elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(numbers));

    }

    public static void main(String[] args) {
        // Demonstrating sorting using built-in method
        sortUsingBuiltInMethod();

        // Demonstrating sorting using custom method
        sortUsingCustomMethod();
    }
}
