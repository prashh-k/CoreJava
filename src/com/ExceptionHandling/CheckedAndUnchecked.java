package com.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedAndUnchecked {

    public static void main(String[] args) {
        System.out.println("Demonstrating Checked and Unchecked Exceptions:");

        // Example of Checked Exception
        handleCheckedException();

        // Example of Unchecked Exception
        handleUncheckedException();

        System.out.println("End of demonstration.");
    }

    /**
     * Function to demonstrate Checked Exceptions
     * Checked exceptions must be handled at compile time using try-catch or throws.
     */
    public static void handleCheckedException() {
        System.out.println("\nChecked Exception Example:");

        try {
            // Attempting to read a file that may not exist
            File file = new File("nonexistent.txt");
            Scanner scanner = new Scanner(file); // This line may throw FileNotFoundException
            System.out.println("File content: " + scanner.nextLine());
        }
        catch (FileNotFoundException e) {
            // Handling the FileNotFoundException
            System.out.println("Exception Caught: The file was not found.");
            System.out.println("Exception Message: " + e.getMessage());
        }

        // Checked exceptions must be either handled or declared using throws
        System.out.println("Checked exception handled successfully.");
    }

    /**
     * Function to demonstrate Unchecked Exceptions
     * Unchecked exceptions occur during runtime and are not checked at compile time.
     */
    public static void handleUncheckedException() {
        System.out.println("\nUnchecked Exception Example:");

        try {
            // Attempting to divide a number by zero, causing an ArithmeticException
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // This line will throw ArithmeticException
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            // Handling the ArithmeticException
            System.out.println("Exception Caught: Division by zero is not allowed.");
            System.out.println("Exception Message: " + e.getMessage());
        }

        // Unchecked exceptions do not need to be declared using throws
        System.out.println("Unchecked exception handled successfully.");
    }
}