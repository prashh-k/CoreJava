package com.Thread;

//Main class to demonstrate Thread operations
public class ThreadClass {

 public static void main(String[] args) {
     System.out.println("Demonstrating the Thread class:");

     // Step 1: Start a simple thread
     startSimpleThread();

     // Step 2: Start multiple threads to showcase concurrency
     startMultipleThreads();

     System.out.println("Main thread execution completed.");
 }

 /**
  * Function to demonstrate a simple thread
  * Shows how to create and start a single thread.
  */
 public static void startSimpleThread() {
     System.out.println("\nStarting a simple thread:");

     // Create an instance of the custom thread class
     MyThread simpleThread = new MyThread("Simple-Thread");

     // Start the thread
     // This invokes the run() method
     simpleThread.start();
 }

 /**
  * Function to demonstrate multiple threads
  * Creates multiple threads and starts them to showcase concurrency.
  */
 public static void startMultipleThreads() {
     System.out.println("\nStarting multiple threads:");

     // Create instances of the custom thread class
     MyThread thread1 = new MyThread("Thread-1");
     MyThread thread2 = new MyThread("Thread-2");
     MyThread thread3 = new MyThread("Thread-3");

     // Start the threads
     thread1.start();
     thread2.start();
     thread3.start();
 }
}

/**
* Custom thread class that extends the Thread class
* This demonstrates how to create a thread by overriding the run() method.
*/
class MyThread extends Thread {
 private String threadName; // Name of the thread

 // Constructor to initialize thread name
 public MyThread(String threadName) {
     this.threadName = threadName;
 }

 /**
  * The run() method contains the code that will be executed when the thread starts.
  */
 @Override
 public void run() {
     System.out.println(threadName + " started execution.");
     try {
         // Simulate some work with sleep
         for (int i = 1; i <= 5; i++) {
             System.out.println(threadName + " is running step: " + i);
             Thread.sleep(1000); // Pause thread for 1000 milliseconds
         }
     } catch (InterruptedException e) {
         // Handle interruption during thread execution
         System.out.println(threadName + " was interrupted.");
     }
     System.out.println(threadName + " finished execution.");
 }
}