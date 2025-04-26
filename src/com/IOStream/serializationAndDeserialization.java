package com.IOStream;


import java.io.*;

public class serializationAndDeserialization {

    public static void main(String[] args) {
        System.out.println("Demonstrating Serialization and Deserialization in Java:");

        // File path for storing serialized object
        String filePath = "src/com/IOStream/serializedObject.dat";

        // Creating a sample object to serialize
        Student student = new Student("Alice", 22);

        // Step 1: Serialize the object
        serializeObject(student, filePath);

        // Step 2: Deserialize the object
        Student deserializedStudent = deserializeObject(filePath);

        // Print the deserialized object details
        if (deserializedStudent != null) {
            System.out.println("Deserialized Object: " + deserializedStudent);
        }

        System.out.println("End of demonstration.");
    }

    /**
     * Function to serialize an object to a file
     * @param object The object to be serialized
     * @param filePath The file path to store the serialized object
     */
    public static void serializeObject(Object object, String filePath) {
        System.out.println("\nSerializing object to file: " + filePath);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            // Write the object to the output stream (serialization)
            outputStream.writeObject(object);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            // Handle IOException
            System.out.println("An error occurred during serialization.");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

    /**
     * Function to deserialize an object from a file
     * @param filePath The file path to read the serialized object from
     * @return The deserialized object, or null if an error occurs
     */
    public static Student deserializeObject(String filePath) {
        System.out.println("\nDeserializing object from file: " + filePath);

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            // Read the object from the input stream (deserialization)
            Student object = (Student) inputStream.readObject();
            System.out.println("Object deserialized successfully.");
            return object;
        } catch (IOException | ClassNotFoundException e) {
            // Handle exceptions during deserialization
            System.out.println("An error occurred during deserialization.");
            System.out.println("Exception Message: " + e.getMessage());
        }

        return null; // Return null if deserialization fails
    }
}

/**
 * A sample class representing a Student
 * Implements Serializable to support serialization and deserialization
 */
class Student implements Serializable {
    private static final long serialVersionUID = 1L; // Serial Version UID for compatibility
    private String name;
    private int age;

    // Constructor to initialize Student attributes
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString method for better display of Student attributes
    @Override
    public String toString() {
        return "Student [Name=" + name + ", Age=" + age + "]";
    }
}