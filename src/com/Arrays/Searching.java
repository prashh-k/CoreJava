package com.Arrays;

/*
 * Searching in Arrays:
 * - Searching is the process of finding an element in an array.
 * - Two common searching techniques are:
 *   1. Linear Search: Sequentially checks each element.
 *   2. Binary Search: Efficiently finds elements in sorted arrays by dividing the search space in half.
 *
 * This program demonstrates both techniques, each implemented in a separate function.
 */

import java.util.Arrays;
 
 

public class Searching {

    // Function to perform Linear Search
    public static void linearSearch(int[] array, int key) {
        System.out.println("Linear Search:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                return;
            }
        }
        System.out.println("Element " + key + " not found.");
    }

    // Function to perform Binary Search
    public static void binarySearch(int[] array, int key) {
        System.out.println("Binary Search:");
        // Binary search requires the array to be sorted
        Arrays.sort(array); // Sort the array
        System.out.println("Sorted Array: " + Arrays.toString(array));

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid potential overflow
            if (array[mid] == key) {
                System.out.println("Element " + key + " found at index " + mid);
                return;
            }
            if (array[mid] < key) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        System.out.println("Element " + key + " not found.");
    }

    public static void main(String[] args) {
        // Example Array
        int[] numbers = {50, 20, 10, 40, 30};

        // Searching with Linear Search
        int key1 = 40; // Element to search for
        linearSearch(numbers, key1);

        // Searching with Binary Search
        int key2 = 25; // Element to search for
        binarySearch(numbers, key2);
    }
}