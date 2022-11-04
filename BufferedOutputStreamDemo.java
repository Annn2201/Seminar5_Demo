import java.io.*;

class BufferedOutputStreamDemo
{
    public static void main(String args[])throws Exception
    {
        FileOutputStream fout = new FileOutputStream("f1.txt");

        BufferedOutputStream bout = new BufferedOutputStream(fout);
        for(int i = 65; i < 75; i++)
        {
            bout.write(i);
        }

        byte b[] = { 'K', 76, 77, 78, 79, 80 };
        bout.write(b);

        bout.flush();

        bout.close();
        fout.close();
    }
}
