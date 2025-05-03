//*********** Q2 ********************/

package Ass7_sync;

class Printer {

    // Object-level synchronized block
    public void printMessage(String message) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " - " + message);
            try {
                Thread.sleep(200); // Simulate some delay
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Class-level synchronized block
    public void printClassMessage(String message) {
        synchronized (Printer.class) {
            System.out.println(Thread.currentThread().getName() + " - CLASS: " + message);
            try {
                Thread.sleep(200); // Simulate some delay
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

// Thread for object-level sync
class ObjectThread extends Thread {
    Printer printer;

    ObjectThread(Printer printer, String name) {
        super(name);
        this.printer = printer;
    }

    public void run() {
        printer.printMessage("Hello from Object Sync");
    }
}

// Thread for class-level sync
class ClassThread extends Thread {
    Printer printer;

    ClassThread(Printer printer, String name) {
        super(name);
        this.printer = printer;
    }

    public void run() {
        printer.printClassMessage("Hello from Class Sync");
    }
}

public class block_syn {
    public static void main(String[] args) {
        Printer printer = new Printer();

        ObjectThread t1 = new ObjectThread(printer, "Thread-1");
        ObjectThread t2 = new ObjectThread(printer, "Thread-2");

        ClassThread t3 = new ClassThread(printer, "Thread-3");
        ClassThread t4 = new ClassThread(printer, "Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

