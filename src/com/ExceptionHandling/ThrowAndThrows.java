package com.ExceptionHandling;

public class ThrowAndThrows {

    public static void main(String[] args) {
        System.out.println("Demonstrating Throw and Throws:");

        try {
            // Calling the method that uses throw
            validateAge(15); // Pass an invalid age to demonstrate the throw statement
        } catch (IllegalArgumentException e) {
            // Catching the exception thrown by the validateAge method
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            // Calling the method that uses throws
            divideNumbers(10, 0); // Pass zero as denominator to demonstrate throws
        } catch (ArithmeticException e) {
            // Catching the exception thrown by the divideNumbers method
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("End of demonstration.");
    }

    /**
     * Method to demonstrate the use of throw
     * Throws an exception explicitly when age is less than 18.
     * @param age Age to validate
     */
    public static void validateAge(int age) {
        System.out.println("Validating age: " + age);

        if (age < 18) {
            // Throwing an exception explicitly using the throw statement
            throw new IllegalArgumentException("Age must be 18 or above.");
        }

        System.out.println("Age is valid.");
    }

    /**
     * Method to demonstrate the use of throws
     * Declares that it might throw an ArithmeticException.
     * @param numerator The numerator of the division
     * @param denominator The denominator of the division
     * @throws ArithmeticException If denominator is zero
     */
    public static void divideNumbers(int numerator, int denominator) throws ArithmeticException {
        System.out.println("Dividing " + numerator + " by " + denominator);

        if (denominator == 0) {
            // Throwing an exception explicitly
            throw new ArithmeticException("Denominator cannot be zero.");
        }

        int result = numerator / denominator;
        System.out.println("Result: " + result);
    }
}