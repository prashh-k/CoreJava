package com.InnerClasses;

// Program to explain Static Nested Class in Java
public class StaticNestedClass {

    // Static member of the outer class
    private static String staticMessage = "Hello from the Static Member of Outer Class!";

    // Static nested class
    // A Static Nested Class does not require an instance of the outer class to be created
    static class NestedStaticClass {

        // Method inside the static nested class
        void displayStaticMessage() {
            // Can access static members of the outer class
            System.out.println(staticMessage + " Accessed from Static Nested Class.");
        }
    }

    // Method in the outer class to demonstrate using the static nested class
    void outerMethod() {
        System.out.println("Inside outerMethod of OuterClass.");
        NestedStaticClass nestedStatic = new NestedStaticClass(); // Create an object of the static nested class
        nestedStatic.displayStaticMessage(); // Call the nested class's method
    }

    // Another method to show interaction with the static nested class
    static void staticOuterMethod() {
        System.out.println("Inside staticOuterMethod of OuterClass.");
        NestedStaticClass nestedStatic = new NestedStaticClass();
        nestedStatic.displayStaticMessage();
    }

    public static void main(String[] args) {
        // Call a static method of the outer class
        staticOuterMethod();

        // Create an object of the outer class
        StaticNestedClass outer = new StaticNestedClass();

        // Call an instance method of the outer class
        outer.outerMethod();
    }
}