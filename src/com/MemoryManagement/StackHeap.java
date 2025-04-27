package com.MemoryManagement;


// Program to explain Stack and Heap in Java

class StackHeapDemo {

    // Method to demonstrate Stack memory
    void stackExample() {
        System.out.println("Demonstrating Stack Memory:");

        // Local variables are stored in the Stack
        int localVariable = 10; // Stored in Stack
        String localString = "Hello Stack"; // Reference stored in Stack, actual string in Heap
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Local String: " + localString);

        // Stack memory is temporary and used for method execution
        stackHelperMethod(); // Method call creates a new stack frame
    }

    // Helper method to show how stack frames work
    void stackHelperMethod() {
        int helperVariable = 20; // Stored in the new stack frame
        System.out.println("Helper Variable in stackHelperMethod: " + helperVariable);
        // Once this method finishes execution, its stack frame is removed
    }

    // Method to demonstrate Heap memory
    void heapExample() {
        System.out.println("\nDemonstrating Heap Memory:");

        // Objects are stored in the Heap, references in the Stack
        Person person1 = new Person("Alice", 25); // Person object created in Heap
        Person person2 = new Person("Bob", 30); // Another Person object in Heap

        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);

        // Changing the reference to person1
        person1 = new Person("Charlie", 35); // New object created in Heap, old object is eligible for Garbage Collection
        System.out.println("Updated Person 1: " + person1);
    }

    public static void main(String[] args) {
        StackHeapDemo demo = new StackHeapDemo();

        // Demonstrating Stack memory
        demo.stackExample();

        // Demonstrating Heap memory
        demo.heapExample();
    }
}

// Class representing a Person, stored in the Heap
class Person {
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding toString for easy output
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}