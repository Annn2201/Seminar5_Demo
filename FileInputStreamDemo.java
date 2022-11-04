import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("Seminar5_Demo/test.txt");
        System.out.println(fin.getChannel());

        System.out.println(fin.getFD());

        System.out.println("Number of remaining bytes:"
                + fin.available());

        fin.skip(4);

        System.out.println("FileContents :");

        int ch;

        while ((ch = fin.read()) != -1)
            System.out.print((char)ch);

        fin.close();

    }
}
