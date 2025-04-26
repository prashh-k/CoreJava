package com.String;

public class CommonStringMethods {

    // Function to demonstrate the 'length()' method
    public static void demonstrateLength() {
        String str = "Hello, Java!";
        System.out.println("Original String: " + str);
        System.out.println("Length of the String: " + str.length());
    }

    // Function to demonstrate the 'charAt()' method
    public static void demonstrateCharAt() {
        String str = "Programming";
        System.out.println("\nOriginal String: " + str);
        System.out.println("Character at index 4: " + str.charAt(4)); // 'r'
    }

    // Function to demonstrate the 'substring()' method
    public static void demonstrateSubstring() {
        String str = "Learn Java Programming";
        System.out.println("\nOriginal String: " + str);
        System.out.println("Substring (0 to 5): " + str.substring(0, 5)); // "Learn"
        System.out.println("Substring (6 onwards): " + str.substring(6)); // "Java Programming"
    }

    // Function to demonstrate the 'indexOf()' and 'lastIndexOf()' methods
    public static void demonstrateIndexOf() {
        String str = "Welcome to Java Programming!";
        System.out.println("\nOriginal String: " + str);
        System.out.println("Index of 'Java': " + str.indexOf("Java")); // 11
        System.out.println("Last index of 'o': " + str.lastIndexOf("o")); // 9
    }

    // Function to demonstrate the 'equals()' and 'equalsIgnoreCase()' methods
    public static void demonstrateEquals() {
        String str1 = "JAVA";
        String str2 = "java";
        System.out.println("\nString 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Equals: " + str1.equals(str2)); // false
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2)); // true
    }

    // Function to demonstrate the 'toUpperCase()' and 'toLowerCase()' methods
    public static void demonstrateCaseConversion() {
        String str = "Java Programming";
        System.out.println("\nOriginal String: " + str);
        System.out.println("Uppercase: " + str.toUpperCase()); // "JAVA PROGRAMMING"
        System.out.println("Lowercase: " + str.toLowerCase()); // "java programming"
    }

    // Function to demonstrate the 'replace()' method
    public static void demonstrateReplace() {
        String str = "Java is fun";
        System.out.println("\nOriginal String: " + str);
        System.out.println("Replacing 'fun' with 'powerful': " + str.replace("fun", "powerful")); // "Java is powerful"
    }

    // Function to demonstrate the 'split()' method
    public static void demonstrateSplit() {
        String str = "Java,Python,C++";
        System.out.println("\nOriginal String: " + str);
        String[] languages = str.split(",");
        System.out.println("Split Result:");
        for (String language : languages) {
            System.out.println(language);
        }
    }

    // Function to demonstrate the 'trim()' method
    public static void demonstrateTrim() {
        String str = "   Java is Awesome!   ";
        System.out.println("\nOriginal String with spaces: '" + str + "'");
        System.out.println("Trimmed String: '" + str.trim() + "'"); // Removes leading and trailing spaces
    }

    public static void main(String[] args) {
        // Calling the functions to demonstrate string methods
        demonstrateLength();
        demonstrateCharAt();
        demonstrateSubstring();
        demonstrateIndexOf();
        demonstrateEquals();
        demonstrateCaseConversion();
        demonstrateReplace();
        demonstrateSplit();
        demonstrateTrim();
    }
}