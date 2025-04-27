package com.ObjectClassMethods;

// Program to explain the toString method in Java

// Class representing a Person
class Person {
    private String name;
    private int age;

    // Constructor to initialize Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the toString method
    @Override
    public String toString() {
        // Customizing the string representation of a Person object
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// Main class to demonstrate the toString method
public class ToString {

    // Method to demonstrate default toString behavior (without overriding)
    void defaultToString() {
        Object obj = new Object(); // Generic Object
        System.out.println("Default toString method: " + obj.toString());
        // This will print the object's class name followed by its hashcode, e.g., "java.lang.Object@6d06d69c".
    }

    // Method to demonstrate overridden toString behavior
    void overriddenToString() {
        Person person = new Person("Alice", 30);
        System.out.println("Overridden toString method: " + person.toString());
        // This will print a more user-friendly representation of the object, e.g., "Person{name='Alice', age=30}".
    }

    // Method to demonstrate using toString implicitly
    void implicitToStringUsage() {
        Person person = new Person("Bob", 25);
        System.out.println("Implicit toString usage: " + person);
        // No explicit call to toString; the method is called automatically when concatenating an object to a string.
    }

    public static void main(String[] args) {
        ToString demo = new ToString();

        // Demonstrate default toString method
        demo.defaultToString();

        // Demonstrate overridden toString method
        demo.overriddenToString();

        // Demonstrate implicit usage of the toString method
        demo.implicitToStringUsage();
    }
}