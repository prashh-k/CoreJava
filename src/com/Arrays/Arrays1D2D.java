package com.Arrays;

/*
 * Arrays in Java:
 * - Arrays are used to store multiple elements of the same data type.
 * - 1D (One-Dimensional) arrays: Linear collections of elements.
 * - 2D (Two-Dimensional) arrays: Matrix-like structures with rows and columns.
 * 
 * This program demonstrates all possible initialization techniques for 1D and 2D arrays,
 * including examples of accessing, modifying, and displaying the arrays.
 */

public class Arrays1D2D {

    // Function to demonstrate all possible initialization methods for 1D arrays
    public static void demonstrate1DArrayInitialization() {
        System.out.println("1D Array Initialization:");

        // 1. Declare and Initialize with values directly
        int[] array1 = {10, 20, 30, 40, 50};
        System.out.println("Direct Initialization: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Element at index " + i + ": " + array1[i]);
        }

        // 2. Declare and Initialize using the 'new' keyword (specifying size)
        int[] array2 = new int[5]; // All elements initialized to default (0 for int)
        array2[0] = 5;
        array2[1] = 15;
        array2[2] = 25;
        array2[3] = 35;
        array2[4] = 45;
        System.out.println("\nInitialization with 'new' keyword and explicit assignment:");
        for (int number : array2) {
            System.out.println(number);
        }

        // 3. Partial Initialization with 'new' keyword and direct values
        int[] array3 = new int[]{50, 60, 70}; // Size inferred from number of elements
        System.out.println("\nPartial Initialization:");
        for (int num : array3) {
            System.out.println(num);
        }

        System.out.println();
    }

    // Function to demonstrate all possible initialization methods for 2D arrays
    public static void demonstrate2DArrayInitialization() {
        System.out.println("2D Array Initialization:");

        // 1. Declare and Initialize with values directly
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Direct Initialization: ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        // 2. Declare and Initialize using the 'new' keyword (specifying size)
        int[][] matrix2 = new int[3][3]; // All elements initialized to default values (0)
        matrix2[0][0] = 10;
        matrix2[0][1] = 20;
        matrix2[0][2] = 30;
        matrix2[1][0] = 40;
        matrix2[1][1] = 50;
        matrix2[1][2] = 60;
        matrix2[2][0] = 70;
        matrix2[2][1] = 80;
        matrix2[2][2] = 90;
        System.out.println("\nInitialization with 'new' keyword and explicit assignment:");
        for (int[] row : matrix2) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // 3. Declare a jagged array using 'new' keyword and explicit row initialization
        int[][] matrix3 = new int[3][];
        matrix3[0] = new int[]{100, 200};
        matrix3[1] = new int[]{300, 400, 500};
        matrix3[2] = new int[]{600};
        System.out.println("\nJagged Array Initialization:");
        for (int[] row : matrix3) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // Demonstrating 1D Array Initialization
        demonstrate1DArrayInitialization();

        // Demonstrating 2D Array Initialization
        demonstrate2DArrayInitialization();
    }
}
