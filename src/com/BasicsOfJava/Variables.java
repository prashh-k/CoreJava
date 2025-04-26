package com.BasicsOfJava;

public class Variables {

	// Method to demonstrate variables
	public void demonstrateVariables() {
		System.out.println("Variables in Java:");

		// Primitive data type variables
		int age = 25; // Example of an integer variable
		double salary = 55000.75; // Example of a decimal variable
		char grade = 'A'; // Example of a character variable
		boolean isPassed = true; // Example of a boolean variable

		System.out.println("Integer variable (age): " + age);
		System.out.println("Double variable (salary): " + salary);
		System.out.println("Character variable (grade): " + grade);
		System.out.println("Boolean variable (isPassed): " + isPassed);

		// Non-primitive variable
		String name = "John Doe"; // Example of a String variable
		System.out.println("String variable (name): " + name);
	}

	public void createVariables() {
		// Valid variable names
		int myVariable = 10;
		double _myVariable = 20.5;
		char $myVariable = 'A';
		boolean variable1 = true;
		String my_variable = "Hello";
		long myVariable123 = 123456789L;

		// Printing variable values
		System.out.println("Integer (myVariable): " + myVariable);
		System.out.println("Double (_myVariable): " + _myVariable);
		System.out.println("Character ($myVariable): " + $myVariable);
		System.out.println("Boolean (variable1): " + variable1);
		System.out.println("String (my_variable): " + my_variable);
		System.out.println("Long (myVariable123): " + myVariable123);
	}

	public static void main(String[] args) {
		Variables example = new Variables();

		// Demonstrate variables
		example.demonstrateVariables();

		example.createVariables();

	}
}