package com.String;

/*
 * Strings in Java:
 * - Strings represent sequences of characters and are widely used for text manipulation.
 * - Strings are immutable, meaning their content cannot be changed after creation.
 * - Java provides extensive features for string manipulation, including methods for comparison, searching, concatenation, and formatting.
 */

public class StringExample {
    public static void main(String[] args) {
        /*
         * Creating Strings:
         * Strings can be created using two methods:
         * 1. String literal
         * 2. String object using the 'new' keyword
         */
        System.out.println("Creating Strings:");
        String literalString = "Hello, World!"; // String literal
        String objectString = new String("Java Programming"); // String object

        System.out.println("Literal String: " + literalString);
        System.out.println("Object String: " + objectString);
        System.out.println();

        /*
         * Comparing Strings:
         * - 'equals()': Compares string content (case-sensitive)
         * - 'equalsIgnoreCase()': Compares string content (ignores case)
         * - '==' operator: Compares references (memory locations)
         */
        System.out.println("Comparing Strings:");
        String str1 = "Java";
        String str2 = "java";
        String str3 = new String("Java");

        System.out.println("Using equals(): " + str1.equals(str2)); // False (case-sensitive)
        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2)); // True
        System.out.println("Using '==': " + (str1 == str3)); // False (different references)
        System.out.println();

    }
}