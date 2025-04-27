package com.InnerClasses;


// Program to explain Local Inner Class in Java
public class LocalInnerClass {

    // Instance variable of the outer class
    private String message = "Hello from OuterClass!";

    // Method in the outer class with a local inner class
    void outerMethod() {
        System.out.println("Inside outerMethod of OuterClass.");

        // Local inner class defined within a method
        class LocalInnerClass2 {
            // Method inside the local inner class
            void displayMessage() {
                // Accessing outer class's instance variable
                System.out.println(message + " Accessed from LocalInnerClass.");
            }
        }

        // Creating an object of the local inner class
        LocalInnerClass2 localInner = new LocalInnerClass2();
        localInner.displayMessage(); // Calling the method of the local inner class
    }

    // Another method to demonstrate the use of a local inner class
    void anotherOuterMethod() {
        System.out.println("Inside anotherOuterMethod of OuterClass.");

        // Local inner class defined again within this method
        class LocalInnerClass2 {
            void greet() {
                System.out.println("Greetings from another LocalInnerClass!");
            }
        }

        LocalInnerClass2 anotherLocalInner = new LocalInnerClass2();
        anotherLocalInner.greet(); // Calling the method of this local inner class
    }

    public static void main(String[] args) {
        // Create an object of the outer class
        LocalInnerClass outer = new LocalInnerClass();

        // Call methods in the outer class that use local inner classes
        outer.outerMethod();
        outer.anotherOuterMethod();
    }
}