//************ Q1 ***************/

package Ass6Thread;

class Myrunnable implements Runnable
{
    public void run()
    {
        System.out.println("Fro the mythread class");
    }
}

public class Q1_2_6  {
    public static void main(String args[])
    {
        Myrunnable r1=new Myrunnable();
        Thread t1=new Thread(r1);
        t1.start();
        System.out.println("From main class");
    }
}
