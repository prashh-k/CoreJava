package com.Thread;

//Main class to demonstrate the Runnable interface
public class RunnableInterface {

 public static void main(String[] args) {
     System.out.println("Demonstrating the Runnable interface:");

     // Step 1: Start a single thread using Runnable
     startSingleRunnableThread();

     // Step 2: Start multiple threads using Runnable
     startMultipleRunnableThreads();

     System.out.println("Main thread execution completed.");
 }

 /**
  * Function to demonstrate a single thread using Runnable interface
  * Shows how to create and start a thread using Runnable.
  */
 public static void startSingleRunnableThread() {
     System.out.println("\nStarting a single thread using Runnable:");

     // Create a runnable object
     Runnable task = new MyRunnable("Single-Thread");

     // Create a thread using the runnable object
     Thread singleThread = new Thread(task);

     // Start the thread
     singleThread.start();
 }

 /**
  * Function to demonstrate multiple threads using Runnable interface
  * Creates multiple threads and starts them to showcase concurrency using Runnable.
  */
 public static void startMultipleRunnableThreads() {
     System.out.println("\nStarting multiple threads using Runnable:");

     // Create runnable objects
     Runnable task1 = new MyRunnable("Runnable-Thread-1");
     Runnable task2 = new MyRunnable("Runnable-Thread-2");
     Runnable task3 = new MyRunnable("Runnable-Thread-3");

     // Create thread objects using the runnable objects
     Thread thread1 = new Thread(task1);
     Thread thread2 = new Thread(task2);
     Thread thread3 = new Thread(task3);

     // Start the threads
     thread1.start();
     thread2.start();
     thread3.start();
 }
}

/**
* Custom class implementing the Runnable interface
* Demonstrates how to define a thread's behavior using the Runnable interface.
*/
class MyRunnable implements Runnable {
 private String threadName; // Name of the thread

 // Constructor to initialize thread name
 public MyRunnable(String threadName) {
     this.threadName = threadName;
 }

 /**
  * The run() method contains the code that will be executed when the thread starts.
  */
 @Override
 public void run() {
     System.out.println(threadName + " started execution.");
     try {
         // Simulate some work by looping and pausing the thread
         for (int i = 1; i <= 5; i++) {
             System.out.println(threadName + " is running step: " + i);
             Thread.sleep(500); // Pause thread for 500 milliseconds
         }
     } catch (InterruptedException e) {
         // Handle interruption during thread execution
         System.out.println(threadName + " was interrupted.");
     }
     System.out.println(threadName + " finished execution.");
 }
}