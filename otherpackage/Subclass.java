package otherpackage;

import mypackage.myclass; 

public class Subclass extends myclass {
    public void display() {
        System.out.println("Hello from SubClass in otherpackage!");
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.showMessage(); 
        obj.display();
    }
}

