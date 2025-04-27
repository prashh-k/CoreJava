package com.Thread;

//Main class to demonstrate wait and notify in threads
public class WaitAndNotify {

 public static void main(String[] args) {
     System.out.println("Demonstrating wait and notify in threads:");

     // Step 1: Create a shared resource (a Monitor object)
     Monitor monitor = new Monitor();

     // Step 2: Create threads for Producer and Consumer
     Thread producerThread = new Thread(() -> producerTask(monitor), "Producer");
     Thread consumerThread = new Thread(() -> consumerTask(monitor), "Consumer");

     // Step 3: Start the threads
     producerThread.start();
     consumerThread.start();
 }

 /**
  * Function to represent the producer thread's task
  * @param monitor The shared monitor object for synchronization
  */
 public static void producerTask(Monitor monitor) {
     synchronized (monitor) {
         System.out.println(Thread.currentThread().getName() + ": Producing data...");
         try {
             // Simulate data production
             Thread.sleep(2000); // Simulated delay
             monitor.setData("Important Data");

             // Notify the waiting thread (consumer) that data is ready
             System.out.println(Thread.currentThread().getName() + ": Data produced. Notifying consumer...");
             Thread.sleep(2000); // Simulated delay
             monitor.notify(); // Notify the waiting consumer thread
             Thread.sleep(2000); // Simulated delay

         } catch (InterruptedException e) {
             System.out.println(Thread.currentThread().getName() + ": Interrupted during production.");
         }
     }
 }

 /**
  * Function to represent the consumer thread's task
  * @param monitor The shared monitor object for synchronization
  */
 public static void consumerTask(Monitor monitor) {
     synchronized (monitor) {
         System.out.println(Thread.currentThread().getName() + ": Waiting for data...");
         try {
             // Wait for the producer thread to notify
             monitor.wait(); // Enter the waiting state
             Thread.sleep(2000); // Simulated delay

             // Consume the data after being notified
             System.out.println(Thread.currentThread().getName() + ": Data received: " + monitor.getData());
         } catch (InterruptedException e) {
             System.out.println(Thread.currentThread().getName() + ": Interrupted while waiting.");
         }
     }
 }
}

/**
* Monitor class to represent the shared resource
* Demonstrates how wait and notify work in synchronized blocks
*/
class Monitor {
 private String data; // Shared data

 // Getter for data
 public String getData() {
     return data;
 }

 // Setter for data
 public void setData(String data) {
     this.data = data;
 }
}
