package com.Enum;



// Program to explain Enum basics in Java
public class EnumBasics {

    // Enum declaration
    // Enums represent a fixed set of constants
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    // Method to demonstrate Enum constants
    void printDayMessage(Day day) {
        switch (day) {
            case MONDAY:
            System.out.println("Start your week with energy!");
            break;
            case FRIDAY:
            System.out.println("Friday! The weekend is near.");
            break ;
            case SUNDAY:
            System.out.println("Relax, it's Sunday.");
            break;
            default: 
            System.out.println("It's a regular day of the week.");
        }
    }

    // Method to iterate through all Enum values
    void listAllDays() {
        System.out.println("Listing all days in the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }

    // Method to demonstrate usage of Enum with methods
    void displayOrdinal(Day day) {
        System.out.println("The ordinal of " + day + " is " + day.ordinal());
    }

    public static void main(String[] args) {
        // Create an instance of the demo class
        EnumBasics demo = new EnumBasics();

        // Demonstrating Enum constants
        demo.printDayMessage(Day.MONDAY);
        demo.printDayMessage(Day.FRIDAY);
        demo.printDayMessage(Day.SUNDAY);

        // Listing all Enum values
        demo.listAllDays();

        // Demonstrating Enum ordinal value
        demo.displayOrdinal(Day.WEDNESDAY);
    }
}