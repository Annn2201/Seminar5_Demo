import java.io.*;

class BufferedInputStreamDemo
{
    public static void main(String args[]) throws IOException
    {

        FileInputStream fin = new FileInputStream("file.txt");

        BufferedInputStream bin = new BufferedInputStream(fin);
        System.out.println("Number of remaining bytes:" +
                bin.available());

        boolean b=bin.markSupported();
        if (b) {
            bin.mark(bin.available());
        }
        bin.skip(4);
        System.out.println("FileContents :");

        int ch;
        while ((ch=bin.read()) != -1)
            System.out.print((char)ch);

        bin.reset();
        while ((ch=bin.read()) != -1)
            System.out.print((char)ch);

        fin.close();
    }
}
