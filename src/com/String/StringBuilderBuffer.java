package com.String;

/*
 * StringBuilder and StringBuffer in Java:
 * - Both classes are used to create mutable strings, meaning their content can be modified.
 * - The primary difference is that StringBuffer is synchronized (thread-safe), whereas StringBuilder is not.
 * - StringBuilder is faster and recommended for single-threaded environments.
 *
 * This program demonstrates unique examples, including thread-safe modifications, reversing text, dynamic concatenation, and performance analysis.
 */

public class StringBuilderBuffer {
    public static void main(String[] args) {
        // -------------------- Using StringBuilder --------------------
        /*
         * StringBuilder:
         * - Ideal for single-threaded environments.
         * - Methods like append(), insert(), replace(), and reverse() are commonly used.
         */
        System.out.println("StringBuilder Example:");
        StringBuilder sb = new StringBuilder("StringBuilder Demo");

        // Append: Adds text to the end of the string
        sb.append(" - Efficient");
        System.out.println("After Append: " + sb.toString());

        // Insert: Adds text at a specific index
        sb.insert(16, " is ");
        System.out.println("After Insert: " + sb.toString());

        // Replace: Replaces a portion of the string
        sb.replace(17, 19, "very");
        System.out.println("After Replace: " + sb.toString());

        // Reverse: Reverses the entire string
        sb.reverse();
        System.out.println("After Reverse: " + sb.toString());
        System.out.println();

        // -------------------- Using StringBuffer --------------------
        /*
         * StringBuffer:
         * - Thread-safe due to synchronization.
         * - Similar methods to StringBuilder but with slower performance in single-threaded environments.
         */
        System.out.println("StringBuffer Example:");
        StringBuffer sbf = new StringBuffer("StringBuffer Demo");

        // Append: Adds text to the end of the string
        sbf.append(" - Safe");
        System.out.println("After Append: " + sbf.toString());

        // Insert: Adds text at a specific index
        sbf.insert(16, " is ");
        System.out.println("After Insert: " + sbf.toString());

        // Replace: Replaces a portion of the string
        sbf.replace(17, 19, "very");
        System.out.println("After Replace: " + sbf.toString());

        // Reverse: Reverses the entire string
        sbf.reverse();
        System.out.println("After Reverse: " + sbf.toString());
        System.out.println();

        
    }
}