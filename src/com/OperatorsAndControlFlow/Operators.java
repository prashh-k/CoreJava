package com.OperatorsAndControlFlow;


public class Operators {

    // Method to demonstrate Arithmetic operators
    public void arithmeticOperators() {
        int a = 10;
        int b = 5;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
    }

    // Method to demonstrate Relational operators
    public void relationalOperators() {
        int a = 10;
        int b = 5;

        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to
    }

    // Method to demonstrate Logical operators
    public void logicalOperators() {
        boolean x = true;
        boolean y = false;

        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT
    }

    // Method to demonstrate Bitwise operators
    public void bitwiseOperators() {
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
        System.out.println("Bitwise Operators:");
        System.out.println("a & b: " + (a & b)); // Bitwise AND
        System.out.println("a | b: " + (a | b)); // Bitwise OR
        System.out.println("a ^ b: " + (a ^ b)); // Bitwise XOR
        System.out.println("~a: " + (~a)); // Bitwise NOT
        System.out.println("a << 1: " + (a << 1)); // Left shift
        System.out.println("a >> 1: " + (a >> 1)); // Right shift
    }

    public static void main(String[] args) {
        Operators demo = new Operators();
        demo.arithmeticOperators();
        demo.relationalOperators();
        demo.logicalOperators();
        demo.bitwiseOperators();
    }
}

