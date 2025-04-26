package com.OOPs;

/*
 * Abstraction using Interfaces:
 * Interfaces are fully abstract. They define a contract that classes must implement but do not provide any implementation.
 * In this example, the 'PaymentProcessor' interface defines a blueprint for different payment systems like 'CreditCardPayment' and 'UPIPayment'.
 */

// Interface Definition
interface PaymentProcessor {
    /*
     * Abstract method: Declared without implementation.
     * All classes implementing this interface must provide an implementation for this method.
     */
    void processPayment(double amount);

    /*
     * Abstract method: Defines the display of payment details.
     */
    void displayPaymentDetails();
}

// Concrete Class Implementing the Interface: CreditCardPayment
class CreditCardPayment implements PaymentProcessor {
    private String cardNumber;
    private String cardHolderName;

    // Constructor for CreditCardPayment
    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    // Implementation of processPayment method
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount + " for card: " + cardNumber);
    }

    @Override
    // Implementation of displayPaymentDetails method
    public void displayPaymentDetails() {
        System.out.println("Credit Card Details:");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Number: " + cardNumber);
    }
}

// Concrete Class Implementing the Interface: UPIPayment
class UPIPayment implements PaymentProcessor {
    private String upiID;

    // Constructor for UPIPayment
    public UPIPayment(String upiID) {
        this.upiID = upiID;
    }

    @Override
    // Implementation of processPayment method
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount + " for UPI ID: " + upiID);
    }

    @Override
    // Implementation of displayPaymentDetails method
    public void displayPaymentDetails() {
        System.out.println("UPI Payment Details:");
        System.out.println("UPI ID: " + upiID);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        /*
         * Demonstrating Abstraction Using Interfaces:
         * Different payment systems implement the same interface but provide their unique implementation for processing payments.
         */

        // Create a CreditCardPayment object
        PaymentProcessor creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "John Doe");

        System.out.println("Credit Card Payment:");
        creditCardPayment.processPayment(5000.00); // Calls the CreditCardPayment implementation
        creditCardPayment.displayPaymentDetails(); // Displays credit card details
        System.out.println();

        // Create a UPIPayment object
        PaymentProcessor upiPayment = new UPIPayment("john.doe@upi");

        System.out.println("UPI Payment:");
        upiPayment.processPayment(1500.00); // Calls the UPIPayment implementation
        upiPayment.displayPaymentDetails(); // Displays UPI details
    }
}