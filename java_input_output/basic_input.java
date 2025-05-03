package java_input_output;

// Java Program to Demonstrate the working of
// FileInputStream Class
import java.io.*;

public class basic_input {

    public static void main(String args[])
    { try{
        FileOutputStream fout=new FileOutputStream("file.txt");
        String s="This data is from stream @#$%^  14556527 你好 😊";
        byte b[]=new byte[s.length()];
        b=s.getBytes();
        fout.write(b);
        fout.close();
        System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

