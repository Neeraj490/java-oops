//************* Q1 *********************/

public class Q1_5 {
    public static void main(String args[])
    {
        String Em=new String("neeraj633@gmail.com");
        String name="";

        if(Em.endsWith("gmail.com"))
        {
            for(int i=0;i<Em.length();i++)
            {
                if((Em.charAt(i)>='a' && Em.charAt(i)<='z') || (Em.charAt(i)>='A' && Em.charAt(i)<='Z') )
                {
                    name=name+Em.charAt(i);
                }
                else
                break;
            }
        }

        System.out.println(name);
    }

    
}
