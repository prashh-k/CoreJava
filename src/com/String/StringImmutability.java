package com.String;

/*
 * Immutability of Strings in Java:
 * - Strings in Java are immutable, meaning their value cannot be changed after creation.
 * - Any operation that appears to modify a String (e.g., concatenation, replacement) actually creates a new String object.
 * - Immutability makes Strings thread-safe and memory-efficient when used with the String Pool.
 */

public class StringImmutability {

    public static void demonstrateImmutability() {
        // Original string
        String original = "Hello";
        System.out.println("Original String: " + original);

        // Attempt to modify the string by concatenation
        String modified = original.concat(", World!");
        System.out.println("Modified String after concatenation: " + modified);

        // Original string remains unchanged
        System.out.println("Original String after concatenation: " + original);
    }

    public static void demonstrateNewObjectCreation() {
        // Original string
        String str1 = "Java";
        System.out.println("\nOriginal String: " + str1);

        // Assign modified value to a new reference
        String str2 = str1.toUpperCase(); // Converts to uppercase
        System.out.println("String after modification (toUpperCase): " + str2);

        // Check if original and modified strings are the same object
        System.out.println("Is original string same as modified string? " + (str1 == str2));
    }

    public static void demonstrateStringPool() {
        // Strings with the same content in the String Pool
        String str1 = "PoolExample";
        String str2 = "PoolExample";

        System.out.println("\nString 1: " + str1);
        System.out.println("String 2: " + str2);

        // Compare references
        System.out.println("Are str1 and str2 the same object? " + (str1 == str2)); // True, because they refer to the same object in the String Pool

        // Modify one string
        String str3 = str1.concat("Modified");
        System.out.println("Modified String (str3): " + str3);

        // Original string remains unchanged
        System.out.println("Original String (str1): " + str1);

        // Modified string (str3) is a new object
        System.out.println("Are str1 and str3 the same object? " + (str1 == str3)); // False, because str3 is a new object
    }

    public static void main(String[] args) {
        System.out.println("Demonstrating Immutability:");
        demonstrateImmutability();

        System.out.println("\nDemonstrating New Object Creation:");
        demonstrateNewObjectCreation();

        System.out.println("\nDemonstrating String Pool Behavior:");
        demonstrateStringPool();
    }
}
