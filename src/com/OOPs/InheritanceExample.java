package com.OOPs;

/*
 * Inheritance in Java is a mechanism where one class acquires the properties and behaviors of another class.
 * It allows for code reuse and establishes a parent-child relationship between classes.
 * Types of inheritance in Java:
 * 1. Single Inheritance
 * 2. Multilevel Inheritance
 * 3. Hierarchical Inheritance
 *
 * Note: Java does not support multiple inheritance directly using classes to avoid ambiguity. It supports it using interfaces.
 */

// Parent Class (Superclass)
class Animal {
    String name;

    // Constructor for Animal
    public Animal(String name) {
        this.name = name;
    }

    // Common behavior for all animals
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// -------------------- SINGLE INHERITANCE --------------------
/*
 * Single inheritance involves one child class inheriting from a single parent class.
 * Example: Dog inherits from Animal
 */
class Dog extends Animal {

    // Constructor for Dog
    public Dog(String name) {
        super(name); // Calls the constructor of the parent class (Animal)
    }

    // Behavior specific to Dog
    public void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }
}

// -------------------- MULTILEVEL INHERITANCE --------------------
/*
 * In multilevel inheritance, a class inherits from another class, which in turn inherits from a parent class.
 * Example: Puppy inherits from Dog, which inherits from Animal
 */
class Puppy extends Dog {

    // Constructor for Puppy
    public Puppy(String name) {
        super(name); // Calls the constructor of the parent class (Dog)
    }

    // Behavior specific to Puppy
    public void weep() {
        System.out.println(name + " is weeping: Whimper! Whimper!");
    }
}

// -------------------- HIERARCHICAL INHERITANCE --------------------
/*
 * In hierarchical inheritance, multiple classes inherit from a single parent class.
 * Example: Dog and Cat both inherit from Animal
 */
class Cat extends Animal {

    // Constructor for Cat
    public Cat(String name) {
        super(name);
    }

    // Behavior specific to Cat
    public void meow() {
        System.out.println(name + " is meowing: Meow! Meow!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        /*
         * Demonstrating Single Inheritance
         * Dog inherits methods like eat() and sleep() from Animal, and adds its own method bark().
         */
        System.out.println("Single Inheritance:");
        Dog dog = new Dog("Buddy");
        dog.eat();  // Inherited from Animal
        dog.sleep(); // Inherited from Animal
        dog.bark(); // Specific to Dog
        System.out.println();

        /*
         * Demonstrating Multilevel Inheritance
         * Puppy inherits methods from Dog, which in turn inherits methods from Animal.
         */
        System.out.println("Multilevel Inheritance:");
        Puppy puppy = new Puppy("Charlie");
        puppy.eat();  // Inherited from Animal
        puppy.sleep(); // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Specific to Puppy
        System.out.println();

        /*
         * Demonstrating Hierarchical Inheritance
         * Cat and Dog both inherit from Animal, but have their own unique methods.
         */
        System.out.println("Hierarchical Inheritance:");
        Cat cat = new Cat("Whiskers");
        cat.eat();  // Inherited from Animal
        cat.sleep(); // Inherited from Animal
        cat.meow(); // Specific to Cat
    }
}