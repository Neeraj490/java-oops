package String_class;

public class basic {
    public static void main(String args[])
    {
         String str = "12345";
         System.out.println(str.matches("\\d+")); // true
            
        
        String str1 = "hello";
        System.out.println(str1.matches("[a-z]+")); // true
            
        String str2 = "Hello";
        System.out.println(str2.matches("[a-zA-Z]+")); // true
        
        String str3 = "Hello123";
        System.out.println(str3.matches("[a-zA-Z0-9]+")); // true

        
    }
}
