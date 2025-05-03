//************ Q1 *********************/

package Ass7_sync;

class Line {
    // Object-level synchronized method
    synchronized public void getLine() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Object-level: " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    // Class-level synchronized method 
    public static synchronized void printStaticLine() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Class-level: " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Thread using object-level sync
class Train extends Thread {
    Line line;

    Train(Line line, String name) {
        super(name);
        this.line = line;
    }

    @Override
    public void run() {
        line.getLine();
    }
}

// Thread using class-level sync
class StaticTrain extends Thread {
    StaticTrain(String name) {
        super(name);
    }

    @Override
    public void run() {
        Line.printStaticLine();
    }
}

public class method_syn {
    public static void main(String[] args) {
        Line obj = new Line();

        // Object-level threads
        Train t1 = new Train(obj, "Train-1");
        Train t2 = new Train(obj, "Train-2");

        // Class-level threads
        StaticTrain t3 = new StaticTrain("StaticTrain-1");
        StaticTrain t4 = new StaticTrain("StaticTrain-2");

        // Start object-level threads
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Start class-level threads
        t3.start();
        t4.start();
    }
}
