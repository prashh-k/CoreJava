package com.OOPs;

/*
 * Abstraction using Abstract Classes:
 * Abstract classes define the structure (abstract methods) and shared functionality (concrete methods).
 * In this example, the abstract class 'Appliance' serves as the blueprint for different types of appliances,
 * such as Washing Machine and Refrigerator.
 */

// Abstract Class
abstract class Appliance {
    // Abstract method: Declared without implementation
    /*
     * Abstract methods define behaviors that all subclasses must implement.
     * For example, the 'start()' method will vary for different appliances.
     */
    abstract void start();

    // Concrete method: Fully implemented
    /*
     * Concrete methods provide shared functionality that all subclasses can use without modification.
     */
    public void plugIn() {
        System.out.println("The appliance is plugged into the power socket.");
    }
}

// Concrete Class (Child of Appliance): Washing Machine
class WashingMachine extends Appliance {
    private int loadCapacity; // Load capacity in kilograms

    // Constructor for Washing Machine
    public WashingMachine(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    // Implementing the abstract method
    public void start() {
        System.out.println("The washing machine is starting a wash cycle with a load capacity of " + loadCapacity + " kg.");
    }

    // Washing Machine-specific method
    public void drainWater() {
        System.out.println("Draining water from the washing machine.");
    }
}

// Concrete Class (Child of Appliance): Refrigerator
class Refrigerator extends Appliance {
    private int temperature; // Temperature in degrees Celsius

    // Constructor for Refrigerator
    public Refrigerator(int temperature) {
        this.temperature = temperature;
    }

    @Override
    // Implementing the abstract method
    public void start() {
        System.out.println("The refrigerator is cooling to a temperature of " + temperature + "°C.");
    }

    // Refrigerator-specific method
    public void defrost() {
        System.out.println("Defrosting the refrigerator.");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        /*
         * Demonstrating Abstraction:
         * - Abstract methods (like start()) force child classes to provide specific implementations.
         * - Concrete methods (like plugIn()) can be shared across all child classes.
         */

        // Creating objects of subclasses
        Appliance washingMachine = new WashingMachine(7); // Load capacity: 7 kg
        Appliance refrigerator = new Refrigerator(4);    // Temperature: 4°C

        System.out.println("Demonstrating Washing Machine:");
        washingMachine.plugIn(); // Calls the shared plugIn() method
        washingMachine.start();  // Calls the overridden start() method
        ((WashingMachine) washingMachine).drainWater(); // Washing Machine-specific method (requires casting)

        System.out.println("\nDemonstrating Refrigerator:");
        refrigerator.plugIn(); // Calls the shared plugIn() method
        refrigerator.start();  // Calls the overridden start() method
        ((Refrigerator) refrigerator).defrost(); // Refrigerator-specific method (requires casting)
    }
}