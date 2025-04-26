package com.ExceptionHandling;

public class TryCatchFinally {

    public static void main(String[] args) {
        // Call the function demonstrating try-catch-finally blocks
        divideNumbers();
    }

    /**
     * Function to demonstrate try-catch-finally blocks
     */
    public static void divideNumbers() {
        System.out.println("Demonstrating Try-Catch-Finally:");

        int numerator = 10; // Numerator for division
        int denominator = 0; // Denominator set to zero to cause an exception

        try {
            // Try block: Code that might throw an exception
            System.out.println("Trying to divide " + numerator + " by " + denominator);
            int result = numerator / denominator; // This will throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Catch block: Code to handle the exception
            System.out.println("Exception Caught: Division by zero is not allowed.");

            // Print the exception message
            System.out.println("Exception Message: " + e.getMessage());

        } finally {
            // Finally block: Code that executes regardless of whether an exception occurs or not
            System.out.println("Finally block executed. Cleaning up resources.");
        }

        System.out.println("End of demonstration.");
    }
}