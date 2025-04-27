package com.Annotations;

// Program to explain Built-in Annotations in Java
public class BuildInAnnotations {

    // Annotation: @Override
    @Override
    public String toString() {
        // Usage: @Override ensures that this method overrides a method in the superclass.
        // It helps avoid errors, like mismatched method signatures.
        return "BuiltInAnnotationsDemo class!";
    }

    // Annotation: @Deprecated
    @Deprecated
    void oldMethod() {
        // Usage: @Deprecated indicates that this method is outdated and should no longer be used.
        // The compiler will generate a warning when this method is used.
        System.out.println("This is a deprecated method.");
    }

    // Annotation: @SuppressWarnings
    @SuppressWarnings("unchecked")
    void suppressWarningMethod() {
        // Usage: @SuppressWarnings suppresses specific compiler warnings.
        // Here, it suppresses the "unchecked" warning for using raw types in collections.
        java.util.ArrayList list = new java.util.ArrayList(); // Raw type usage
        list.add("Example item");
        System.out.println("SuppressWarnings is applied: " + list);
    }

    // Annotation: @FunctionalInterface
    @FunctionalInterface
    interface Greeting {
        // Usage: @FunctionalInterface ensures this interface has exactly one abstract method.
        void sayHello();
    }

    // Annotation: @SafeVarargs
    @SafeVarargs
    final void safeVarargsMethod(String... messages) {
        // Usage: @SafeVarargs prevents unsafe warnings for methods using varargs with generics.
        for (String message : messages) {
            System.out.println(message);
        }
    }

    // Main method demonstrating built-in annotations
    public static void main(String[] args) {
        BuildInAnnotations demo = new BuildInAnnotations();

        // Calling @Override example
        System.out.println(demo.toString());

        // Calling @Deprecated example
        demo.oldMethod();

        // Calling @SuppressWarnings example
        demo.suppressWarningMethod();

        // Using @FunctionalInterface example
        Greeting greeting = () -> System.out.println("Hello from FunctionalInterface!");
        greeting.sayHello();

        // Calling @SafeVarargs example
        demo.safeVarargsMethod("Message 1", "Message 2", "Message 3");
    }
}