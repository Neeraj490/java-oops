
package java_input_output;

import java.io.*;

public class basic_output {
    
    public static void main(String args[]) {
        try {
            // Open the file
            FileInputStream fin = new FileInputStream("abc.txt");
            
            // Read the file content into a byte array
            byte b[] = new byte[fin.available()];
            fin.read(b);
            
            // Convert the byte array to a String
            String s = new String(b);
            System.out.println(s);
            
            // Close the FileInputStream
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: Ensure the file 'abc.txt' exists.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}

