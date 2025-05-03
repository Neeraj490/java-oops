class point3d extends point2d
{
    int z;
    void setpoints_3d(int x,int y,int z)
    {
        setvalue(x,y);
        this.z=z;
    }
    void showpoints_3d()
    {
        System.out.println("( "+x+","+y+","+z+" )");
    }
}

public class point_3d {
    public static void main(String arg[])
    {
       point3d p1=new point3d();
       p1.setpoints_3d(2,3,4);
       p1.showpoints_3d();
    }
    
}
