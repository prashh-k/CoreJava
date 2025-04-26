package com.BasicsOfJava;

public class DataTypes {

    // Function to demonstrate primitive data types
    public void primitiveDataTypes() {
        System.out.println("Primitive Data Types:");
        
        byte byteVar = 120;
        System.out.println("byte: Used to store integers ranging from -128 to 127. Example: " + byteVar);

        short shortVar = 32000;
        System.out.println("short: Used for integers ranging from -32,768 to 32,767. Example: " + shortVar);

        int intVar = 123456789;
        System.out.println("int: Used for integers. Example: " + intVar);

        long longVar = 123456789123456789L;
        System.out.println("long: Used for larger integers. Example: " + longVar);

        float floatVar = 3.14f;
        System.out.println("float: Used for decimal values, single precision. Example: " + floatVar);

        double doubleVar = 3.14159265359;
        System.out.println("double: Used for decimal values, double precision. Example: " + doubleVar);

        char charVar = 'A';
        System.out.println("char: Used for single characters. Example: " + charVar);

        boolean booleanVar = true;
        System.out.println("boolean: Used for true/false values. Example: " + booleanVar);
    }

    // Function to demonstrate non-primitive data types
    public void nonPrimitiveDataTypes() {
        System.out.println("\nNon-Primitive Data Types:");

        String stringVar = "Hello, World!";
        System.out.println("String: Used to store text. Example: " + stringVar);

        int[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Array: Used to store multiple values of the same type. Example: ");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Example of a custom object
        DataTypes dataTypeObj = new DataTypes();
        System.out.println("Object: Instances of classes. Example: An object of DataType class is created.");
    }

    public static void main(String[] args) {
        DataTypes dt = new DataTypes();

        // Display primitive data types
        dt.primitiveDataTypes();

        // Display non-primitive data types
        dt.nonPrimitiveDataTypes();
    }
}