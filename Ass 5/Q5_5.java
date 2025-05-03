//**************** Q5 *************/
public class Q5_5 {
    public static void main(String[] args) {
        String phoneNumber = "9876543210"; 
        String ipAddress = "192.168.1.1"; 

        System.out.println("Phone Number Valid: " + isValidPhone_Num(phoneNumber));
        System.out.println("IP Address Valid: " + isValidIP(ipAddress));
    }

    static boolean isValidPhone_Num(String num) {
        if (num.length() != 10) return false;
        for (int i = 0; i < 10; i++) {
            if (num.charAt(i) < '0' || num.charAt(i) > '9') return false;
        }
        return true;
    }

    
    static boolean isValidIP(String ip) {
        String[] parts = ip.split("\\.");
        if (parts.length != 4) return false;

        for (String part : parts) {
            int num = 0;
            for (char ch : part.toCharArray()) {
                if (ch < '0' || ch > '9') return false;
                num = num * 10 + (ch - '0');
            }
            if (num > 255) return false;
        }
        return true;
    }
}
