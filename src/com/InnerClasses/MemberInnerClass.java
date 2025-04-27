package com.InnerClasses;

// Program to explain Member Inner Class in Java
public class MemberInnerClass {

    // Instance variable of the outer class
    private String message = "Hello from the Outer Class!";

    // Member inner class
    // A Member Inner Class is defined within the body of the outer class
    class InnerClass {

        // Method inside the inner class
        void displayMessage() {
            // Inner class can access private members of the outer class
            System.out.println(message + " Accessed from Inner Class.");
        }
    }

    // Method in the outer class to demonstrate interaction with the inner class
    void outerMethod() {
        System.out.println("Inside outerMethod of OuterClass.");
        InnerClass inner = new InnerClass(); // Create an object of the inner class
        inner.displayMessage(); // Call the inner class's method
    }

    // Another method to demonstrate reuse of the inner class
    void anotherOuterMethod() {
        System.out.println("Inside anotherOuterMethod of OuterClass.");
        InnerClass inner = new InnerClass();
        inner.displayMessage();
    }

    public static void main(String[] args) {
        // Create an object of the outer class
        MemberInnerClass outer = new MemberInnerClass();

        // Call methods in the outer class that interact with the inner class
        outer.outerMethod();
        outer.anotherOuterMethod();
    }
}