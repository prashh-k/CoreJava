package com.ExceptionHandling;

//Custom Checked Exception class
//Must be handled or declared using throws
class CheckedCustomException extends Exception {
 // Constructor to initialize exception message
 public CheckedCustomException(String message) {
     super(message); // Pass the message to parent Exception class
 }
}

//Custom Unchecked Exception class
//Does not require handling at compile time
class UncheckedCustomException extends RuntimeException {
 // Constructor to initialize exception message
 public UncheckedCustomException(String message) {
     super(message); // Pass the message to parent RuntimeException class
 }
}

public class CustomException {

 public static void main(String[] args) {
     System.out.println("Custom Exceptions Example:");

     // Demonstrating Checked Custom Exception
     try {
         validateCheckedCondition(false); // Invalid condition for demonstration
     } catch (CheckedCustomException e) {
         // Handling CheckedCustomException
         System.out.println("Checked Exception Caught: " + e.getMessage());
     }

     // Demonstrating Unchecked Custom Exception
     try {
         validateUncheckedCondition(false); // Invalid condition for demonstration
     } catch (UncheckedCustomException e) {
         // Handling UncheckedCustomException (optional)
         System.out.println("Unchecked Exception Caught: " + e.getMessage());
     }

     System.out.println("Program continues execution despite exceptions.");
 }

 /**
  * Function to demonstrate throwing a Custom Checked Exception
  * @param condition A condition to check
  * @throws CheckedCustomException If the condition is false
  */
 public static void validateCheckedCondition(boolean condition) throws CheckedCustomException {
     System.out.println("Validating checked condition...");

     if (!condition) {
         // Throwing CheckedCustomException explicitly
         throw new CheckedCustomException("Checked Condition Failed.");
     }

     System.out.println("Checked Condition Passed.");
 }

 /**
  * Function to demonstrate throwing a Custom Unchecked Exception
  * @param condition A condition to check
  */
 public static void validateUncheckedCondition(boolean condition) {
     System.out.println("Validating unchecked condition...");

     if (!condition) {
         // Throwing UncheckedCustomException explicitly
         throw new UncheckedCustomException("Unchecked Condition Failed.");
     }

     System.out.println("Unchecked Condition Passed.");
 }
}
