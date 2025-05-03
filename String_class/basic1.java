package String_class;

public class basic1 {
    public static void main(String args[])
    {
        String str = "Java is fun";
        System.out.println(str.matches(".*Java.*")); // true
    
        String str1 = "file.txt";
        System.out.println(str1.matches(".*\\.txt")); // true
        // \\. → Escape dot (.) to match a literal period.
        // Check if a string contains a dot (.)
    
        
    }
}
