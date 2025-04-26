package com.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {
        // Call the function that demonstrates try-with-resources
        readFile();
    }

    /**
     * Function to demonstrate try-with-resources
     */
    public static void readFile() {
        System.out.println("Demonstrating Try-With-Resources:");

        // Try-with-resources block
        // Automatically closes the BufferedReader resource after execution
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            // Reading the first line from the file
            String line = reader.readLine();
            System.out.println("First line of the file: " + line);

        } catch (IOException e) {
            // Catch block to handle exceptions
            System.out.println("An exception occurred while reading the file.");
            System.out.println("Exception message: " + e.getMessage());
        }

        // The BufferedReader resource is automatically closed, so no need for a finally block
        System.out.println("End of demonstration.");
    }
}