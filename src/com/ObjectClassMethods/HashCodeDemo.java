package com.ObjectClassMethods;

// Program to explain hashCode method in Java

// Class representing a Person
class Person {
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the hashCode method
    @Override
    public int hashCode() {
        // Custom hash code based on object fields
        // Using the hash of the name and age combined
        int result = name.hashCode();
        result = 31 * result + age; // Adding a multiplier (31) for better hash distribution
        return result;
    }

    // Overriding equals method for consistency
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return name.equals(other.name) && age == other.age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// Main class to demonstrate the hashCode method
public class HashCodeDemo {

    // Method to demonstrate default hashCode behavior (without overriding)
    void defaultHashCode() {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println("Default hashCode:");
        System.out.println("obj1.hashCode(): " + obj1.hashCode());
        System.out.println("obj2.hashCode(): " + obj2.hashCode());
        // This will print different hash codes because they are different objects.
    }

    // Method to demonstrate overridden hashCode behavior
    void overriddenHashCode() {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 30);

        System.out.println("\nOverridden hashCode:");
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("person3.hashCode(): " + person3.hashCode());
        // person1 and person2 will have the same hash code because their data is identical.
    }

    // Method to demonstrate hashCode consistency with equals
    void hashCodeConsistencyWithEquals() {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Alice", 25);

        System.out.println("\nHashCode Consistency with Equals:");
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.hashCode() == person2.hashCode(): " + (person1.hashCode() == person2.hashCode()));
        // hashCode and equals are consistent: if two objects are equal, their hash codes are equal.
    }

    public static void main(String[] args) {
        HashCodeDemo demo = new HashCodeDemo();

        // Demonstrating default hashCode method
        demo.defaultHashCode();

        // Demonstrating overridden hashCode method
        demo.overriddenHashCode();

        // Demonstrating hashCode consistency with equals
        demo.hashCodeConsistencyWithEquals();
    }
}