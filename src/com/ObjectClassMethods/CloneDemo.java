package com.ObjectClassMethods;

// Program to explain clone method in Java

// Class representing a Person
class Person implements Cloneable {
    private String name;
    private int age;

    // Constructor to initialize a Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Call the Object class's clone method and cast to Person
        return super.clone();
    }

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method for displaying the Person object
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class CloneDemo {

    // Method to demonstrate cloning with default behavior
    void demonstrateClone() {
        try {
            Person person1 = new Person("Alice", 25);
            Person clonedPerson = (Person) person1.clone(); // Cloning the person1 object

            System.out.println("Original Person: " + person1);
            System.out.println("Cloned Person: " + clonedPerson);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported: " + e.getMessage());
        }
    }

    // Method to demonstrate modifying cloned object
    void modifyClonedObject() {
        try {
            Person person1 = new Person("Bob", 30);
            Person clonedPerson = (Person) person1.clone();

            System.out.println("\nBefore modification:");
            System.out.println("Original Person: " + person1);
            System.out.println("Cloned Person: " + clonedPerson);

            // Modify cloned object
            clonedPerson = new Person("Charlie", 35);

            System.out.println("\nAfter modification:");
            System.out.println("Original Person: " + person1);
            System.out.println("Cloned Person: " + clonedPerson);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        CloneDemo demo = new CloneDemo();

        // Demonstrating cloning of an object
        demo.demonstrateClone();

        // Demonstrating modification of cloned object
        demo.modifyClonedObject();
    }
}