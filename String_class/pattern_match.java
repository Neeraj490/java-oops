package String_class;

public class pattern_match {
    public static void main(String args[])
    {
        String email = "user@example.com";
        System.out.println(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")); // true
        
        String phone = "9876543210";
        System.out.println(phone.matches("\\d{10}")); // true
   
        String date = "25/12/2025";
        System.out.println(date.matches("\\d{2}/\\d{2}/\\d{4}")); // true
    }
}
