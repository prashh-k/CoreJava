package com.Collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class QueueAndDeque {

    public static void main(String[] args) {
        // Call the Queue example function
        queueExample();

        // Call the Deque example function
        dequeExample();
    }

    /**
     * Function to demonstrate Queue operations
     */
    public static void queueExample() {
        System.out.println("Queue Example:");

        // Creating a Queue using LinkedList
        // Queue is an interface and LinkedList is one of its implementations
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        // Elements are added to the rear (end) of the queue
        queue.add("A");
        queue.add("B");
        queue.add("C");

        // Displaying the contents of the Queue
        // The order is based on FIFO (First In First Out)
        System.out.println("Queue contents: " + queue);

        // Removing an element from the Queue
        // The element at the front of the queue is removed
        String removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);

        // Accessing the element at the front of the Queue
        String frontElement = queue.peek(); // Returns null if the queue is empty
        System.out.println("Front Element: " + frontElement);

        // Checking the size of the Queue
        int size = queue.size();
        System.out.println("Queue Size: " + size);

        System.out.println(); // Blank line for separation
    }

    /**
     * Function to demonstrate Deque operations
     */
    public static void dequeExample() {
        System.out.println("Deque Example:");

        // Creating a Deque using LinkedList
        // Deque (Double-Ended Queue) allows elements to be added or removed from both ends
        Deque<String> deque = new LinkedList<>();

        // Adding elements at both ends of the Deque
        deque.addFirst("X"); // Add at the front
        deque.addLast("Y");  // Add at the rear (end)

        // Adding another element at the rear
        deque.addLast("Z");

        // Displaying the contents of the Deque
        System.out.println("Deque contents: " + deque);

        // Removing elements from both ends of the Deque
        String removedFront = deque.removeFirst(); // Removes from the front
        System.out.println("Removed Front Element: " + removedFront);

        String removedRear = deque.removeLast(); // Removes from the rear
        System.out.println("Removed Rear Element: " + removedRear);

        // Accessing elements at both ends of the Deque
        String firstElement = deque.peekFirst(); // Returns null if the deque is empty
        String lastElement = deque.peekLast();  // Returns null if the deque is empty
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        System.out.println(); // Blank line for separation
    }
}