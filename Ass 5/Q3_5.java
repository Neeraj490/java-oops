
//************** Q3 ****************/

 public class Q3_5
 {
    public static boolean Bin_St(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != '0' && ch != '1') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    String input = "1010101";
        
        if (Bin_St(input)) {
            System.out.println("The string is a binary sequence.");
        } else {
            System.out.println("The string is NOT a binary sequence.");
        }

    }
 }
