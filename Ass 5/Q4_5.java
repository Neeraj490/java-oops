//*********** Q4 ***************/

public class Q4_5 {
    public static void main(String[] args) {

        String[] emails = {
            "Alice@example.com", 
            "bob@gmail.com", 
            "Charlie123@yahoo.com", 
            "david@outlook.com", 
            "Eva.smith@company.com"
        };

        System.out.println("Emails starting with a capital letter:");
        for (String email : emails) {
            if (email.charAt(0) >= 'A' && email.charAt(0) <= 'Z') {
                System.out.println(email);
            }
        }
    }
}

