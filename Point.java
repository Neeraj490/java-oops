class point2d
{
    int x;
    int y;
    void setvalue(int a,int b)
    {
        x=a;
        y=b;
    }
    void showpoint()
    {
        System.out.println("( "+x+","+y+" )");
       // System.out.println("The value of y coordinate is : "+y);
    }
    void compare(point2d p)
    {
        if(p.x>x)
        {
            System.out.println("near to origin from x is : ( "+p.x+","+p.y+" )");
        }
        else
        {
            System.out.println("near to origin from x is : ( "+x+","+y+" )");
        }
    }
}

public class Point {
    public static void main(String[] args) {
        point2d first=new point2d();
        point2d second=new point2d();
        first.setvalue(10,20);
        second.setvalue(30,40);
        first.showpoint();
        second.showpoint();
        first.compare(second);
    }
}
