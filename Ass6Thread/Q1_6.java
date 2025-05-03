//************** Q1 ********************/

package Ass6Thread;
    
public class Q1_6 extends Thread {
        void fun1() {
            System.out.println("from thread");
        }
    
        @Override
        public void run() {
            fun1();
        }
    
        public static void main(String[] args) {
            Q1_6 ob = new Q1_6();
            ob.start();
            
            System.out.println("From main");
        }
}

