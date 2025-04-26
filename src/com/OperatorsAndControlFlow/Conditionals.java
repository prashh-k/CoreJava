package com.OperatorsAndControlFlow;

public class Conditionals {

    // Method to demonstrate if-else statements
    public void ifElseDemo(int number) {
        System.out.println("If-Else Statement:");

        // Simple if statement
        if (number > 0) {
            System.out.println(number + " is positive.");
        }

        // if-else statement
        //If their is only 1 statement in if or else you don't need to add curly braces.
        if (number > 0) 
            System.out.println(number + " is positive.");
         else 
            System.out.println(number + " is not positive.");

        // if-else-if ladder
        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is zero.");
        }
    }

    // Method to demonstrate switch statements
    public void switchDemo(int day) {
        System.out.println("Switch Statement:");

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    // Method to demonstrate switch statement with fall-through
    public void switchFallThroughDemo(char grade) {
        System.out.println("Switch Statement with Fall-Through:");

        switch (grade) {
            case 'A':
            case 'B':
                System.out.println("Excellent");
                break;
            case 'C':
            case 'D':
                System.out.println("Good");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }
    }

    public static void main(String[] args) {
    	Conditionals demo = new Conditionals();
        demo.ifElseDemo(5);
        demo.switchDemo(2);
        demo.switchFallThroughDemo('B');
    }
}
