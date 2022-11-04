import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("Seminar5_Demo/test.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            char [] chars = {'h', 'i', 'a', 'n'};
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }

            outputStream.write(chars);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}