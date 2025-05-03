package String_class;

public class Quantifiers {
    public static void main(String args[])
    {
        String str = "Hello";
        System.out.println(str.matches("[a-zA-Z]{5}")); // true
    
        String str1 = "Hello"; //Between 3 and 7 characters.
        System.out.println(str1.matches("[a-zA-Z]{3,7}")); // true
        
        String str2= "A123B";
        System.out.println(str2.matches("^[a-zA-Z].*[a-zA-Z]$")); // true
        // ^ → Start of string.
        // [a-zA-Z] → First character must be a letter.
        // .* → Any characters in between.
        // [a-zA-Z]$ → Last character must be a letter.
        // "A1234" would return false because it doesn't end with a letter.
    
        
    }
}
