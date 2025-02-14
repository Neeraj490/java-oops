// Question 2

package inheritance;



class calculator 
{
    static void addint(int a,int b)
    {
        System.out.println("Addition of integer number is : ");
        System.err.println(a+b);
    }
    static void addreal(double a,double b)
    {
        
        System.out.println("Addition of real number is : ");
        System.err.println(a+b);
    }

    public static void main(String arg[])
    {
       //calculator C=new calculator();
       addint(5,6);

       addreal(4.66,5.4);
    }
}

// public class Q2 {
//     public static void main(String arg[])
//     {
//        calculator C=new calculator();
//        C.addint(5,6);
       
//        complex c1=new complex();
//        complex c2=new complex();
//        c1.set_comp(3,4);
//        c2.set_comp(8,0);

//        C.addcomp(c1,c2);
//     }
// }
