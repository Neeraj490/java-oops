//************** Q6 *******************/
import java.util.Scanner;
public class Q6_5 {
    static String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
                            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    
    static String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    static String convertToWords(int num) {
        if (num == 0) return "Zero";
        return convert(num);
    }

    static String convert(int num) {
        if (num < 20) 
        return ones[num];
        else if (num < 100) 
        return tens[num / 10] + " " + ones[num % 10];
        else if (num < 1000) 
        return ones[num / 100] + " Hundred " + convert(num % 100);
        else if (num < 1000000) 
        return convert(num / 1000) + " Thousand " + convert(num % 1000);
        else 
        return convert(num / 1000000) + " Million " + convert(num % 1000000);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(convertToWords(num));
        sc.close();
    }
}

