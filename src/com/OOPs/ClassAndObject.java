package com.OOPs;



/*
 * A class is a blueprint for creating objects. 
 * It defines attributes (properties) and behaviors (methods) that the objects of the class will have.
 * In this example, the "Car" class serves as a blueprint for creating specific car objects.
 */
class Car {
    // Attributes (fields): Represent the properties of the object
    String brand;
    String model;
    int year;
    double price;

    // Constructor: Initializes the object with specific values
    public Car(String brand, String model, int year, double price) {
        this.brand = brand;  // Using 'this' to refer to the current object's attributes
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method: Defines a behavior of the object
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }

    // Method: Simulates a behavior
    public void applyDiscount(double discountPercentage) {
        price -= price * discountPercentage / 100; // Reduces the price based on the discount
        System.out.println("Discount applied! New price: $" + price);
    }
}



//Class to demonstrate classes and objects
public class ClassAndObject {

 public static void main(String[] args) {
     /*
      * An object is an instance of a class.
      * It represents a specific entity and is created using the 'new' keyword.
      */
     
     // Creating objects of the 'Car' class
     Car car1 = new Car("Toyota", "Camry", 2023, 35000);
     Car car2 = new Car("Honda", "Civic", 2022, 30000);

     // Accessing methods of the objects
     System.out.println("Displaying details of Car 1:");
     car1.displayDetails();
     System.out.println();

     System.out.println("Displaying details of Car 2:");
     car2.displayDetails();
     System.out.println();

     // Applying discount (behavior simulation)
     System.out.println("Applying discount to Car 1:");
     car1.applyDiscount(10); // Applying a 10% discount
     System.out.println();

     System.out.println("Applying discount to Car 2:");
     car2.applyDiscount(5); // Applying a 5% discount
 }
}