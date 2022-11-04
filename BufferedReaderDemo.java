import java.io.*;


// Class
public class BufferedReaderDemo {

    // Main driver method
    public static void main(String[] args)
            throws IOException
    {
        FileReader fr = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(fr);

        char c[] = new char[20];
        if (br.markSupported()) {
            System.out.println(
                    "mark() method is supported");
            br.mark(100);
        }
        br.skip(8);
        if (br.ready()) {
            System.out.println(br.readLine());
            br.read(c);
            for (int i = 0; i < 20; i++) {
                System.out.print(c[i]);
            }
            System.out.println();
            br.reset();
            for (int i = 0; i < 8; i++) {
                System.out.print((char)br.read());
            }
        }
    }
}