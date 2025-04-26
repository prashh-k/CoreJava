package com.IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class BufferedReaderDemo {

    public static void main(String[] args) {
        System.out.println("Demonstrating BufferedReader in Java:");

        // Reading data from a file using BufferedReader
        readFromFile("src/com/IOStream/BufferedReader.txt");

        // Reading user input using BufferedReader
        readFromUserInput();

        System.out.println("End of demonstration.");
    }

    /**
     * Function to demonstrate reading data from a file using BufferedReader
     * @param filePath The path of the file to be read
     */
    public static void readFromFile(String filePath) {
        System.out.println("\nReading from file using BufferedReader:");

        try (	FileWriter writer = new FileWriter(filePath);
        		BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        	
        	writer.write("This is a Buffered Reader.");
            String line;
            System.out.println("Reading data from file: " + filePath);

            // Reading the file line by line
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Display each line
            }

            System.out.println("File reading completed.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

    /**
     * Function to demonstrate reading user input using BufferedReader
     */
    public static void readFromUserInput() {
        System.out.println("\nReading user input using BufferedReader:");

        // BufferedReader connected to standard input
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your favorite programming language:");
            String input = reader.readLine(); // Read user input
            System.out.println("You love " + input + "!");
        } catch (IOException e) {
            System.out.println("An error occurred while reading user input.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}