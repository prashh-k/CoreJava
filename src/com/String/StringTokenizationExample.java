package com.String;

/*
 * String Tokenization in Java:
 * - Tokenization is the process of breaking a string into smaller parts (tokens) using a delimiter.
 * - Java provides the 'StringTokenizer' class in the 'java.util' package for this purpose.
 * - Tokens can be separated by spaces, commas, or other delimiters.
 *
 * This program demonstrates how to use 'StringTokenizer' to tokenize strings
 * and highlights different features such as counting tokens and handling multiple delimiters.
 */

import java.util.StringTokenizer;

public class StringTokenizationExample {

    // Function to demonstrate basic tokenization using spaces as delimiters
    public static void demonstrateBasicTokenization() {
        System.out.println("Basic Tokenization:");
        String str = "Java is fun and powerful!";
        StringTokenizer tokenizer = new StringTokenizer(str); // Default delimiter is space

        System.out.println("Original String: " + str);
        System.out.println("Tokens:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        System.out.println();
    }

    // Function to demonstrate tokenization with custom delimiters
    public static void demonstrateCustomDelimiterTokenization() {
        System.out.println("Custom Delimiter Tokenization:");
        String str = "Java,Python,C++,JavaScript";
        StringTokenizer tokenizer = new StringTokenizer(str, ","); // Delimiter is a comma

        System.out.println("Original String: " + str);
        System.out.println("Tokens:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        System.out.println();
    }

    // Function to demonstrate counting tokens
    public static void demonstrateTokenCount() {
        System.out.println("Counting Tokens:");
        String str = "Java|Python|C++|JavaScript";
        StringTokenizer tokenizer = new StringTokenizer(str, "|"); // Delimiter is '|'

        System.out.println("Original String: " + str);
        System.out.println("Total Tokens: " + tokenizer.countTokens());
        System.out.println();
    }

    // Function to demonstrate handling multiple delimiters
    public static void demonstrateMultipleDelimiters() {
        System.out.println("Multiple Delimiters Tokenization:");
        String str = "Java;Python,C++:JavaScript";
        StringTokenizer tokenizer = new StringTokenizer(str, ";,:");

        System.out.println("Original String: " + str);
        System.out.println("Tokens:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Calling the functions to demonstrate different aspects of string tokenization
        demonstrateBasicTokenization();
        demonstrateCustomDelimiterTokenization();
        demonstrateTokenCount();
        demonstrateMultipleDelimiters();
    }
}
