package com.IOStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {

    public static void main(String[] args) {
        System.out.println("Demonstrating Character Streams:");

        // File path for the example operations
        String filePath = "src/com/IOStream/characterStreamFile.txt";

        // Step 1: Create and write to a file
        createAndWriteToFile(filePath);

        // Step 2: Read from the created file
        readFromFile(filePath);

        System.out.println("End of demonstration.");
    }

    /**
     * Function to create a file and write data to it using Character Stream
     * @param filePath The path of the file to be created
     */
    public static void createAndWriteToFile(String filePath) {
        System.out.println("\nCreating a file and writing data using Character Stream:");

        // Data to be written to the file
        String data = "Hello, this file is created and written using Character Stream.";

        try (FileWriter writer = new FileWriter(filePath)) {
            // Writing data to the file character by character
            writer.write(data); // Write the string data
            System.out.println("File created and data written successfully at: " + filePath);
        } catch (IOException e) {
            // Handling IOException
            System.out.println("An error occurred while creating or writing to the file.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

    /**
     * Function to read data from a file using Character Stream
     * @param filePath The path of the file to be read
     */
    public static void readFromFile(String filePath) {
        System.out.println("\nReading Data Using Character Stream:");

        try (FileReader reader = new FileReader(filePath)) {
            int data;
            System.out.println("Reading data from file: " + filePath);
            while ((data = reader.read()) != -1) {
                // Read each character and print it to the console
                System.out.print((char) data);
            }
            System.out.println("\nReading completed.");
        } catch (IOException e) {
            // Handling IOException
            System.out.println("An error occurred while reading the file.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}