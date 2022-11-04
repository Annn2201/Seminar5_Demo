import java.io.*;
public class BufferedWriterDemo
{
    public static void main(String[] args)
    {
        FileWriter out;
        try
        {
            out = new FileWriter("BufferedWriter.txt");
            BufferedWriter outWrite = new BufferedWriter(out);
            System.out.println("Buffered Writer start writing :)");
            String arg = "Hello class";
//            outWrite.write(69);
//            outWrite.write(49);
            outWrite.write(arg, 6, arg.length() - 6);

            outWrite.write("HI");
            outWrite.newLine();
            outWrite.write("chao");
            outWrite.newLine();
            outWrite.write("cau");

            outWrite.flush();

            outWrite.close();
            System.out.println("Written successfully");
        }
        catch (IOException except)
        {
            except.printStackTrace();
        }

    }
}