package java_input_output.Byte_Stream;
import java.io.*;

class data_input_stream
{
    public static void main(String arg[])
    {
        FileOutputStream fos = new FileOutputStream("data.bin");
        DataOutputStream dos = new DataOutputStream(fos) ;
        try 
        {
            dos.writeInt(100);
            dos.writeDouble(3.14159);
            dos.writeBoolean(true);
            dos.writeUTF("Hello Java");
        } 
        catch (IOException e)
        {
            
        }

        // Reading data
        try (DataInputStream dis = new DataInputStream(new FileInputStream("data.bin"))) 
        {
            int number = dis.readInt();
            double pi = dis.readDouble();
            boolean flag = dis.readBoolean();
            String text = dis.readUTF();

            System.out.println("Read values:");
            System.out.println("Integer: " + number);
            System.out.println("Double: " + pi);
            System.out.println("Boolean: " + flag);
            System.out.println("String: " + text);
        } catch (IOException e) 
        {
           
        }
    }
}
