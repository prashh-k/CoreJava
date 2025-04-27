package com.Thread;

//Main class to demonstrate synchronization in threads
public class Synchronization {

 public static void main(String[] args) {
     System.out.println("Demonstrating Thread Synchronization:");

     // Step 1: Create a shared resource (BankAccount)
     BankAccount account = new BankAccount(1000); // Initial balance = 1000

     // Step 2: Create threads to access the shared resource
     Thread t1 = new Thread(() -> performWithdrawal(account, "Thread-1", 700));
     Thread t2 = new Thread(() -> performWithdrawal(account, "Thread-2", 500));

     // Step 3: Start the threads
     t1.start();
     t2.start();

     try {
         // Wait for both threads to complete
         t1.join();
         t2.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
     }

     System.out.println("Final Account Balance: " + account.getBalance());
     System.out.println("End of demonstration.");
 }

 /**
  * Function to perform a withdrawal operation on the BankAccount
  * @param account The shared BankAccount object
  * @param threadName Name of the thread performing the withdrawal
  * @param amount The amount to withdraw
  */
 public static void performWithdrawal(BankAccount account, String threadName, int amount) {
     System.out.println(threadName + " attempting to withdraw " + amount + "...");
     account.withdraw(threadName, amount);
 }
}

/**
* Class representing a Bank Account
* Demonstrates synchronization to prevent race conditions when multiple threads access the same resource.
*/
class BankAccount {
 private int balance; // Account balance

 // Constructor to initialize balance
 public BankAccount(int balance) {
     this.balance = balance;
 }

 /**
  * Synchronized method to withdraw money from the account
  * Ensures only one thread can access this method at a time.
  * @param threadName Name of the thread performing the withdrawal
  * @param amount The amount to withdraw
  */
 public synchronized void withdraw(String threadName, int amount) {
     if (balance >= amount) {
         System.out.println(threadName + " is withdrawing " + amount + "...");
         try {
             // Simulate delay for withdrawal operation
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             System.out.println(threadName + " was interrupted.");
         }
         balance -= amount;
         System.out.println(threadName + " successfully withdrew " + amount + ". Remaining balance: " + balance);
     } else {
         System.out.println(threadName + " attempted to withdraw " + amount + " but insufficient balance. Current balance: " + balance);
     }
 }

 /**
  * Getter method to retrieve the current balance
  * @return The current balance in the account
  */
 public int getBalance() {
     return balance;
 }
}