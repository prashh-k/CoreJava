package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableAndComparator {

    public static void main(String[] args) {
        // Call the Comparable example function
        comparableExample();

        // Call the Comparator example function
        comparatorExample();
    }

    /**
     * Function to demonstrate Comparable interface
     * The Comparable interface is used for natural ordering of objects.
     */
    public static void comparableExample() {
        System.out.println("Comparable Example:");

        // Creating a list of Student objects
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        // Sorting the list using the Comparable implementation in Student class
        Collections.sort(students); // Sorts based on natural ordering (student ID)

        // Displaying the sorted list
        System.out.println("Students sorted by ID (Natural Order):");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println(); // Blank line for separation
    }

    /**
     * Function to demonstrate Comparator interface
     * The Comparator interface is used for custom ordering of objects.
     */
    public static void comparatorExample() {
        System.out.println("Comparator Example:");

        // Creating a list of Student objects
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        // Sorting the list using a custom Comparator to sort by name
        students.sort(new NameComparator()); // Sorts based on custom ordering (student name)

        // Displaying the sorted list
        System.out.println("Students sorted by Name (Custom Order):");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println(); // Blank line for separation
    }
}

/**
 * Class to represent a Student
 * Implements Comparable interface for natural ordering by ID.
 */
class Student implements Comparable<Student> {
    private int id;
    private String name;

    // Constructor to initialize Student object
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for ID
    public int getId() {
        return id;
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Implementation of compareTo method for natural ordering by ID
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id); // Compare student IDs
    }

    // Override toString method for easy display of Student information
    @Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + "]";
    }
}

/**
 * Class to implement Comparator for custom ordering by name
 */
class NameComparator implements Comparator<Student> {
    // Implementation of compare method for custom ordering by name
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName()); // Compare student names
    }
}