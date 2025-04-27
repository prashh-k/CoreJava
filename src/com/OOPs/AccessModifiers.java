package com.OOPs;

//Main class to demonstrate access modifiers
public class AccessModifiers {

 public static void main(String[] args) {
     System.out.println("Demonstrating Access Modifiers in Java:");

     // Create an object of the Subclass to test access modifiers
     Subclass subclass = new Subclass();

     // Demonstrating 'public' access modifier
     subclass.publicMethod();

     // Demonstrating 'protected' access modifier
     subclass.callProtectedMethod();

     // Demonstrating 'default' access modifier
     subclass.callDefaultMethod();

     // Demonstrating 'private' access modifier
     subclass.callPrivateMethod();
 }
}

/**
* Parent class containing methods with different access modifiers
*/
class Parent {

 // Public method: Accessible from anywhere
 public void publicMethod() {
     System.out.println("Public method: Accessible from anywhere.");
 }

 // Private method: Accessible only within this class
 private void privateMethod() {
     System.out.println("Private method: Accessible only within the Parent class.");
 }

 // Protected method: Accessible within the same package or subclasses
 protected void protectedMethod() {
     System.out.println("Protected method: Accessible within the same package or in subclasses.");
 }

 // Default method (no modifier): Accessible within the same package
 void defaultMethod() {
     System.out.println("Default method: Accessible only within the same package.");
 }

 // Public method to call the private method (to show how private works)
 public void callPrivateMethod() {
     System.out.println("Calling the private method from within the Parent class...");
     privateMethod(); // Private method is accessed within the Parent class
 }
}

/**
* Subclass that inherits methods from Parent class
*/
class Subclass extends Parent {

 // Method to access protected method of Parent class
 public void callProtectedMethod() {
     System.out.println("Calling the protected method from Subclass...");
     protectedMethod(); // Protected method is accessible in a subclass
 }

 // Method to access default method of Parent class
 public void callDefaultMethod() {
     System.out.println("Calling the default method from Subclass...");
     defaultMethod(); // Default method is accessible in the same package
 }
}

