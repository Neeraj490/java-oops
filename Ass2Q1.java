// QUESTION 1

package inheritance;

class person
{
    String name;
    int age;
    int pincode;
    String state;
    String city;
    void address(int pincode,String state,String city)
    {
       this.pincode=pincode;
       this.state=state;
       this.city=city;
    }
    void set_data(String name,int age,int pincode,String state,String city)
    {
        this.name=name;
        this.age=age;
        address(pincode,state,city);
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("address :-- pincode : "+pincode+" ,state : "+state+" ,city :"+city);
    }
}

class student extends person
{
    String branch;
    int sem;
    void set_data_stu(String name,int age,int pincode,String state,String city,String branch,int sem)
    {
        set_data(name,age,pincode,state,city);
        this.branch=branch;
        this.sem=sem;
    }
    void display_stu()
    {
        System.out.println("branch : "+branch);
        System.out.println("sem : "+sem);
        display();
    }
}

class employee extends person
{
    int salary;
    String desig;
    String org;
    void set_data_emp(String name,int age,int pincode,String state,String city,String desig,String org)
    {
        set_data(name,age,pincode,state,city);
        this.desig=desig;
        this.org=org;
    }
    void display_emp()
    {  
       display();
       System.out.println("designation : "+desig);
        System.out.println("organisation : "+org);
    }

};




public class Ass2Q1 {
    public static void main(String arg[])
    {
        person p=new person();
        student p1=new student();
        employee p2=new employee();

        p.set_data("sumit",10,32456,"rajasthan","kota");
        p1.set_data_stu("mohit",20,54674,"rajasthan","ajmer","CSE",3);
        p2.set_data_emp("sohit",32,74844,"punjab","amritsar","software engineer","infosys Ltd.");
        
        System.out.println("Person : ");
        p.display();

        System.out.println("Student : ");
        p1.display_stu();

        System.out.println("Employee : ");
        p2.display_emp();
    }
}
