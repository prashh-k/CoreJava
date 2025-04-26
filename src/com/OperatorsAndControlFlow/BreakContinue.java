package com.OperatorsAndControlFlow;

public class BreakContinue {
    // Method to explain and demonstrate the use of "break"
    public void breakExample() {
        /*
         * The "break" keyword is used to terminate the loop prematurely.
         * It stops the execution of the current loop and exits the loop completely.
         */
        System.out.println("Break Example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop as i equals " + i);
                break; // Exits the loop when i equals 5
            }
            System.out.println("Current value of i: " + i);
        }
        System.out.println();
    }

    // Method to explain and demonstrate the use of "continue"
    public void continueExample() {
        /*
         * The "continue" keyword is used to skip the current iteration of the loop.
         * It does not exit the loop but instead moves to the next iteration.
         */
        System.out.println("Continue Example:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Skipping the even number: " + i);
                continue; // Skips the current iteration for even numbers
            }
            System.out.println("Odd number: " + i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Instantiate the BreakContinue class
        BreakContinue bc = new BreakContinue();

        // Call the methods to demonstrate "break" and "continue"
        bc.breakExample();
        bc.continueExample();
    }
}