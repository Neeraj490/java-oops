package inheritance;

class A
{
    void show()
    {
        System.err.println("10");
    }
}

class B extends A
{
    void show()
    {
        System.err.println("12");
    }
}
public class metover {
    
        public static void main(String[] args)
        {
            A ob=new A();
            ob.show();
            
            ob=new B();
            ob.show();

    }
    
    
}
