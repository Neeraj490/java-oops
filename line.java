// Question 2

class line2d
{
    point2d sp;
    point2d ep;
    // void setline(int x1,int y1,int x2,int y2)
    // {   sp =new point2d();
    //     ep= new point2d();
    //     sp.setvalue(x1,y1);
    //     ep.setvalue(y1,y2);
    // }
    void setline(point2d p1,point2d p2)
    {
       sp=p1;
       ep=p2;
    }
    void display()
    {   System.out.println("  starting point is : ");
        sp.showpoint();
        System.out.println("  End point is : ");
        ep.showpoint();
    }
     void slope()
     {
        double m=(ep.y-sp.y)/(ep.x-sp.x);
        System.out.println("  slope is : "+m);
     }
}

public class line {
    public static void main(String arg[])
    {
        line2d l1=new line2d();
        line2d l2=new line2d();
        // l1.setline(1,2,3,4);
        // l2.setline(0,3,1,6);
        point2d p3=new point2d();
        point2d p4=new point2d();
        p3.setvalue(1,2);
        p4.setvalue(3,4);
        l1.setline(p3,p4);
        
        point2d p5=new point2d();
        point2d p6=new point2d();
        p5.setvalue(0,3);
        p6.setvalue(1,6);
        l2.setline(p5,p6);
        System.out.println("l1 line is : ");
        l1.display();
        l1.slope();
        System.out.println("l2 line is : ");
        l2.display();
        l2.slope();


    }
}
