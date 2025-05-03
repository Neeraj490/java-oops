package java_input_output.Byte_Stream;
import java.io.*;
// Example1 
/*class byteArray_input_stream
{
public static void main(String arg[]) throws Exception
    {
        byte[] buffer = "we are coding about the ByteArrayInputStream".getBytes();
        //getBytes()=> change a string into a byte array
        ByteArrayInputStream bais = new ByteArrayInputStream(buffer);
        // ByteArrayInputStream bais = new ByteArrayInputStream(buffer,4,10);
        int readByte;
        while((readByte = bais.read()) != -1)
        {
            System.out.print((char)readByte);
        }

        bais.close();
    }
}*/

// Example2
class byteArray_input_stream
{
    public static void main(String arg[]) throws Exception
    {
        byte[] data = "Hello World".getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        System.out.println("Available bytes at start: " + bais.available());
        //read five bytes
        for (int i = 0; i < 5; i++) 
        {
            System.out.print((char) bais.read());
        }
        System.out.println("\nAvailable after reading 5 bytes: " + bais.available());

         bais.reset();  // starts reading from the beginning again

         int byteRead;
        while ((byteRead = bais.read()) != -1) 
        {
            System.out.print((char) byteRead);
        }

        System.out.println("\nAvailable after reading all: " + bais.available());

        bais.close();

    }
}
