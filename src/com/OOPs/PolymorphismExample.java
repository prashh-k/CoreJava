package com.OOPs;

/*
 * Polymorphism allows methods to behave differently based on the object or parameters involved.
 * This program demonstrates polymorphism with Shapes: Circle, Rectangle, and Triangle.
 *
 * Types of Polymorphism:
 * 1. Compile-time Polymorphism (Method Overloading)
 * 2. Runtime Polymorphism (Method Overriding)
 */

// --------------------- Base Class (Superclass) ---------------------
class Shape {
    /*
     * Runtime Polymorphism (Method Overriding):
     * The area() method is defined in the parent class and will be overridden in child classes
     * to calculate the area of specific shapes.
     */
    public void area() {
        System.out.println("The area of the shape is not defined.");
    }
}

// --------------------- Derived Class: Circle ---------------------
class Circle extends Shape {
    double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    /*
     * Overriding the area() method to calculate the area of a circle.
     * Formula: Area = π * radius^2
     */
    @Override
    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the Circle is: " + area);
    }
}

// --------------------- Derived Class: Rectangle ---------------------
class Rectangle extends Shape {
    double length, width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /*
     * Overriding the area() method to calculate the area of a rectangle.
     * Formula: Area = length * width
     */
    @Override
    public void area() {
        double area = length * width;
        System.out.println("The area of the Rectangle is: " + area);
    }
}

// --------------------- Derived Class: Triangle ---------------------
class Triangle extends Shape {
    double base, height;

    // Constructor for Triangle
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /*
     * Overriding the area() method to calculate the area of a triangle.
     * Formula: Area = 0.5 * base * height
     */
    @Override
    public void area() {
        double area = 0.5 * base * height;
        System.out.println("The area of the Triangle is: " + area);
    }
}

// --------------------- Compile-time Polymorphism ---------------------
class Calculator {
    /*
     * Method Overloading: Multiple methods with the same name but different parameters.
     * This demonstrates compile-time polymorphism.
     */
    public double calculate(double a, double b) {
        return a + b; // Adds two numbers
    }

    public double calculate(double a, double b, double c) {
        return a + b + c; // Adds three numbers
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // ------------------- Runtime Polymorphism -------------------
        System.out.println("Runtime Polymorphism (Method Overriding):");

        // Shape reference, assigned to different child objects
        Shape shape;

        // Circle object
        shape = new Circle(5.0); // Radius = 5.0
        shape.area(); // Calls the overridden area() method in Circle

        // Rectangle object
        shape = new Rectangle(4.0, 6.0); // Length = 4.0, Width = 6.0
        shape.area(); // Calls the overridden area() method in Rectangle

        // Triangle object
        shape = new Triangle(4.0, 3.0); // Base = 4.0, Height = 3.0
        shape.area(); // Calls the overridden area() method in Triangle

        System.out.println();

        // ------------------- Compile-time Polymorphism -------------------
        System.out.println("Compile-time Polymorphism (Method Overloading):");
        Calculator calc = new Calculator();

        // Using the calculate() method with different parameter lists
        System.out.println("Sum of two numbers (3.5 + 4.5): " + calc.calculate(3.5, 4.5));
        System.out.println("Sum of three numbers (1.0 + 2.0 + 3.0): " + calc.calculate(1.0, 2.0, 3.0));
    }
}