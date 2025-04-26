package com.IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

    public static void main(String[] args) {
        System.out.println("Demonstrating Byte Streams:");

        // File path for the example operations
        String filePath = "src/com/IOStream/byteStreamFile.txt";

        // Creating a file and writing to it
        createAndWriteToFile(filePath);

        // Reading data from the created file
        readFromFile(filePath);

        System.out.println("End of demonstration.");
    }

    /**
     * Function to create a file and write data to it using Byte Stream
     * @param filePath The path of the file to be created
     */
    public static void createAndWriteToFile(String filePath) {
        System.out.println("\nCreating a file and writing data using Byte Stream:");

        // Data to be written to the file
        String data = "Hello, this file is created and written using Byte Stream. I am Prashant.";

        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            // Writing data to the file byte by byte
            outputStream.write(data.getBytes()); // Convert string data into bytes
            System.out.println("File created and data written successfully at: " + filePath);
        } catch (IOException e) {
            // Handling IOException
            System.out.println("An error occurred while creating or writing to the file.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

    /**
     * Function to read data from a file using Byte Stream
     * @param filePath The path of the file to be read
     */
    public static void readFromFile(String filePath) {
        System.out.println("\nReading Data Using Byte Stream:");

        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            int data;
            System.out.println("Reading data from file: " + filePath);
            while ((data = inputStream.read()) != -1) {
                // Read each byte and print it as a character
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