package com.WrapperClasses;

public class AutoboxingUnboxing {

    // Method to demonstrate autoboxing
    public void demonstrateAutoboxing() {
        // Autoboxing: converting a primitive type to a wrapper class object
        int primitiveInt = 10;
        Integer wrappedInt = primitiveInt; // Autoboxing

        double primitiveDouble = 3.14;
        Double wrappedDouble = primitiveDouble; // Autoboxing

        System.out.println("Autoboxing:");
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Primitive double: " + primitiveDouble);
        System.out.println("Wrapped Double: " + wrappedDouble);
    }

    // Method to demonstrate unboxing
    public void demonstrateUnboxing() {
        // Unboxing: converting a wrapper class object to a primitive type
        Integer wrappedInt = Integer.valueOf(20);
        int primitiveInt = wrappedInt; // Unboxing

        Double wrappedDouble = Double.valueOf(6.28);
        double primitiveDouble = wrappedDouble; // Unboxing

        System.out.println("Unboxing:");
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapped Double: " + wrappedDouble);
        System.out.println("Primitive double: " + primitiveDouble);
    }

    public static void main(String[] args) {
        AutoboxingUnboxing example = new AutoboxingUnboxing();
        example.demonstrateAutoboxing();
        example.demonstrateUnboxing();
    }
}

