package com.BasicsOfJava;

public class TypeCasting {

    // Method to demonstrate implicit casting (widening)
    public void implicitCasting() {
        System.out.println("Implicit Casting (Widening):");

        int intValue = 100;
        double doubleValue = intValue; // Implicit casting (int to double)
        
        System.out.println("Original int value: " + intValue);
        System.out.println("After implicit casting to double: " + doubleValue);
    }

    // Method to demonstrate explicit casting (narrowing)
    public void explicitCasting() {
        System.out.println("\nExplicit Casting (Narrowing):");

        double doubleValue = 99.99;
        int intValue = (int) doubleValue; // Explicit casting (double to int)
        
        System.out.println("Original double value: " + doubleValue);
        System.out.println("After explicit casting to int: " + intValue);
    }

    // Method to demonstrate casting between primitive and wrapper types
    public void wrapperCasting() {
        System.out.println("\nWrapper Class Casting:");

        int primitiveInt = 50;
        Integer wrapperInt = primitiveInt; // Autoboxing (primitive to wrapper)
        int unboxedInt = wrapperInt; // Unboxing (wrapper to primitive)
        
        System.out.println("Autoboxing (int to Integer): " + wrapperInt);
        System.out.println("Unboxing (Integer to int): " + unboxedInt);
    }

    // Method to demonstrate String to primitive conversion (parsing)
    public void stringToPrimitive() {
        System.out.println("\nString to Primitive Casting:");

        String numberString = "123";
        int parsedInt = Integer.parseInt(numberString); // Convert String to int
        
        System.out.println("Original String: " + numberString);
        System.out.println("After parsing to int: " + parsedInt);
    }

    // Method to demonstrate object typecasting (Upcasting and Downcasting)
    public void objectCasting() {
        System.out.println("\nObject Casting (Upcasting and Downcasting):");

        // Upcasting
        Parent parentObject = new Child(); // Child object assigned to Parent reference
        System.out.println("Upcasting: Parent reference used for Child object");

        // Downcasting
        Child childObject = (Child) parentObject; // Explicit casting back to Child
        System.out.println("Downcasting: Parent reference cast back to Child object");
    }

    public static void main(String[] args) {
        TypeCasting typecasting = new TypeCasting();

        // Demonstrate implicit casting
        typecasting.implicitCasting();

        // Demonstrate explicit casting
        typecasting.explicitCasting();

        // Demonstrate wrapper class casting
        typecasting.wrapperCasting();

        // Demonstrate String to primitive conversion
        typecasting.stringToPrimitive();

        // Demonstrate object casting
        typecasting.objectCasting();
    }
}

// Supporting classes for object casting example
class Parent {
    // Parent class definition
}

class Child extends Parent {
    // Child class definition
}