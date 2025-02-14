package inheritance;

class A
{
    int y;
    static int x;
}

class B extends A
{
    int z;
    B(int a,int b)
    {
       y=a;
       z=b;
    }

}

public class test {
    public static void main(String arg[])
    {
       //B ob=new B();
       B ob=new B(3,4);
       B ob1=new B(5,6);
       A ob2=new A();
       //B.x=30;
       // B.y=40; bcoz this is not static member
       //A.x=40;
       ob.x=60;
       ob1.x=70;
       ob2.y=30;
       ob.y=40;
       System.out.println(B.x);
       System.out.println(ob.y);

    }
    
}
