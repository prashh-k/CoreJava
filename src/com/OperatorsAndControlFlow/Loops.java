package com.OperatorsAndControlFlow;

public class Loops {
    // Method demonstrating a "for loop"
    public void forLoopExample() {
        System.out.println("For Loop Example:");
        String[] fruits = {"apple", "banana", "cherry"};
        for (String fruit : fruits) {
            System.out.println("I like " + fruit);
        }
        System.out.println();
    }

    // Method demonstrating a "while loop"
    public void whileLoopExample() {
        System.out.println("While Loop Example:");
        int count = 0;
        while (count < 5) {
            System.out.println("Count is " + count);
            count++;
        }
        System.out.println();
    }

    // Method demonstrating a "do-while loop"
    public void doWhileLoopExample() {
        /*
         * A do-while loop is similar to a while loop,
         * but it guarantees that the code block runs at least once 
         * before the condition is checked.
         */
        System.out.println("Do-While Loop Example:");
        int number = 0;
        do {
            System.out.println("Number is " + number);
            number++;
        } while (number < 5);
        System.out.println();
    }

    // Method demonstrating a "nested loop"
    public void nestedLoopExample() {
        System.out.println("Nested Loop Example:");
        for (int i = 1; i <= 3; i++) { // Outer loop
            for (int j = 1; j <= 3; j++) { // Inner loop
                System.out.println("Outer loop " + i + ", Inner loop " + j);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Instantiate the Loops class
        Loops loops = new Loops();

        // Call the methods
        loops.forLoopExample();
        loops.whileLoopExample();
        loops.doWhileLoopExample();
        loops.nestedLoopExample();
    }
}