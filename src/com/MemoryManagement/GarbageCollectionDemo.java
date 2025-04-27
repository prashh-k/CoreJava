package com.MemoryManagement;

// Program to explain Garbage Collection in Java

// Class representing an Object for Garbage Collection
class GarbageCollectionObject {
    private String name;

    // Constructor to initialize the object
    public GarbageCollectionObject(String name) {
        this.name = name;
    }

    // Finalize method to demonstrate garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected.");
    }
}

public class GarbageCollectionDemo {

    // Method to demonstrate unused objects being eligible for garbage collection
    void createGarbageObjects() {
        System.out.println("Demonstrating garbage collection for unused objects:");

        // Creating objects
        GarbageCollectionObject obj1 = new GarbageCollectionObject("Object 1");
        GarbageCollectionObject obj2 = new GarbageCollectionObject("Object 2");

        // Unreferencing the objects (they become eligible for garbage collection)
        obj1 = null;
        obj2 = null;

        // Requesting garbage collection (note: this is just a request, not guaranteed)
        System.gc();
    }

    // Method to demonstrate garbage collection when the scope ends
    void garbageCollectionByScope() {
        System.out.println("\nDemonstrating garbage collection when scope ends:");

        {
            GarbageCollectionObject obj3 = new GarbageCollectionObject("Scoped Object");
            System.out.println(obj3 + " created within scope.");
            // Once this block ends, obj3 becomes eligible for garbage collection
        }

        // Requesting garbage collection
        System.gc();
    }

    public static void main(String[] args) {
        GarbageCollectionDemo demo = new GarbageCollectionDemo();

        // Demonstrate garbage collection for unused objects
        demo.createGarbageObjects();

        // Demonstrate garbage collection when scope ends
        demo.garbageCollectionByScope();

        // Requesting garbage collection again
        System.out.println("\nFinal garbage collection request:");
        Runtime.getRuntime().gc();
    }
}