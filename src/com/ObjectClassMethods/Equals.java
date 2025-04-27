package com.ObjectClassMethods;

// Program to explain equals method in Java

// Class representing a Person
class Person {
    private String name;
    private int age;

    // Constructor to initialize a Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the equals method
    @Override
    public boolean equals(Object obj) {
        // Check if the current object and the given object reference the same memory location
        if (this == obj) {
            return true;
        }

        // Check if the given object is null or not an instance of Person
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the given object to Person and compare data members
        Person other = (Person) obj;
        return name.equals(other.name) && age == other.age;
    }

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Main class to demonstrate the equals method
public class Equals {

    // Method to demonstrate default equals behavior (without overriding)
    void defaultEquals() {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("Default equals method:");
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2));
        // This will return false as obj1 and obj2 reference different objects
    }

    // Method to demonstrate overridden equals behavior
    void overriddenEquals() {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 30);

        System.out.println("\nOverridden equals method:");
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // false
    }

    // Method to demonstrate equality checks with null and different objects
    void checkWithNullAndDifferentType() {
        Person person1 = new Person("Alice", 25);
        String name = "Alice";

        System.out.println("\nEquals with null and different object types:");
        System.out.println("person1.equals(null): " + person1.equals(null)); // false
        System.out.println("person1.equals(name): " + person1.equals(name)); // false
    }

    public static void main(String[] args) {
        Equals demo = new Equals();

        // Demonstrating default equals method
        demo.defaultEquals();

        // Demonstrating overridden equals method
        demo.overriddenEquals();

        // Demonstrating equality checks with null and different types
        demo.checkWithNullAndDifferentType();
    }
}
