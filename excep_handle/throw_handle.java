 package excep_handle;

// public class throw_handle{
//     // Java program to illustrate throws
//     public static void main(String[] args)
//         throws InterruptedException
//     {
//         Thread.sleep(10000);
//         System.out.println("Hello Geeks");
//     }
// }

// Demonstrating how to throw an exception

public class throw_handle {

    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (IllegalAccessException e) {
            System.out.println("Caught in main.");
        }
    }
}



