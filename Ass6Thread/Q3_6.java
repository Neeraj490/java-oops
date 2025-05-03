//*************** Q3 ***************/

package Ass6Thread;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Count: " + i);

            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }

            if (i == 3) {
                System.out.println(getName() + " yielding at count " + i);
                Thread.yield();
            }
        }
    }
}

public class Q3_6 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        // Start both threads
        t1.start();
        t2.start();
        
        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Both threads have finished execution.");
    }
}


