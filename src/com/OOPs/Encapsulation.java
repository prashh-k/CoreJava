package com.OOPs;

//Main class to demonstrate encapsulation
public class Encapsulation {

 public static void main(String[] args) {
     System.out.println("Demonstrating Encapsulation in Java:");

     // Call the function to demonstrate encapsulation
     demonstrateEncapsulation();
 }

 /**
  * Function to demonstrate encapsulation
  */
 public static void demonstrateEncapsulation() {
     System.out.println("\nEncapsulation Example:");

     // Create an object of the Student class
     Student student = new Student();

     // Setting values through setter methods
     student.setName("Alice");
     student.setAge(20);
     student.setGrade("A");

     // Getting values through getter methods
     System.out.println("Student Details:");
     System.out.println("Name: " + student.getName());
     System.out.println("Age: " + student.getAge());
     System.out.println("Grade: " + student.getGrade());
 }
}

/**
* Class representing a Student
* Demonstrates encapsulation by using private fields and public getter and setter methods
*/
class Student {

 // Private fields (variables)
 private String name;  // Name of the student
 private int age;      // Age of the student
 private String grade; // Grade of the student

 // Public getter method for name
 public String getName() {
     return name;
 }

 // Public setter method for name
 public void setName(String name) {
     this.name = name; // Assign the parameter value to the private field
 }

 // Public getter method for age
 public int getAge() {
     return age;
 }

 // Public setter method for age
 public void setAge(int age) {
     // Apply validation before assigning the value
     if (age > 0) {
         this.age = age;
     } else {
         System.out.println("Invalid age. Age must be greater than 0.");
     }
 }

 // Public getter method for grade
 public String getGrade() {
     return grade;
 }

 // Public setter method for grade
 public void setGrade(String grade) {
     this.grade = grade; // Assign the parameter value to the private field
 }
}
