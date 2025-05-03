//************* Q4 ********************/

package Ass6Thread;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running - " + getName());
        System.out.println("Priority of " + getName() + ": " + getPriority());
    }
}

public class Q4_6 {
    public static void main(String[] args) {
        // Creating threads
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        // Setting names
        t1.setName("Thread-One");
        t2.setName("Thread-Two");
        t3.setName("Thread-Three");

        // Setting priorities
        t1.setPriority(1);   // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY);  // Priority 5
        t3.setPriority(Thread.MAX_PRIORITY);   // Priority 10

        // Display names and priorities
        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Priority of t1: " + t1.getPriority());

        System.out.println("Name of t2: " + t2.getName());
        System.out.println("Priority of t2: " + t2.getPriority());

        System.out.println("Name of t3: " + t3.getName());
        System.out.println("Priority of t3: " + t3.getPriority());

        // Starting threads
        t1.start();
        t2.start();
        t3.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("All threads have finished execution.");
    
    }
}