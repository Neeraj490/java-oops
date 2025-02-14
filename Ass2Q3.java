package inheritance;

class comp
{
    int real;
    int imag;

    comp()
    {
        real=0;
        imag=0;
    }
    comp(int x,int y)
    {
        real=x;
        imag=y;
    }

    void display()
    {
        System.out.println("Complex number is : "+real+"+i"+imag);
    }

    static void add(int r1,int i1,int r2,int i2)
    {
        int a=r1+r2;
        int b=i1+i2;
    System.out.println("Sum of complex number by 4 parameter is : "+a+"+i"+b);
    }

    static void add(comp c1,comp c2)
    {
        int a=c1.real+c2.real;
        int b=c1.imag+c2.imag;
    System.out.println("Sum of complex number c1 and c2 is : "+a+"+i"+b);

    }
    void add(comp c)
    {
        int a=c.real+real;
        int b=c.imag+imag;
    System.out.println("Sum of complex numbers and is : "+a+"+i"+b);
    }

    public static void main(String arg[])
    {
       comp c1=new comp();
       comp c2=new comp(3,4);
       c1.display();
       c2.display();
       
       comp.add(c1,c2);
       comp.add(1,2,3,4);

       comp c=new comp(5,6);
       comp c3=new comp(6,7);
       c.add(c3);
    }

}


