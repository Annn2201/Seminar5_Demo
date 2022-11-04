import java.io.*;

public class FileOutputStreamDemo {
    public static void main(String[] args)
            throws IOException
    {
        int i;

        FileOutputStream fout = new FileOutputStream("Seminar5_Demo/name3.txt",
                true);

        String st = "TATA";

//        char ch[] = st.toCharArray();
//        for (i = 0; i < st.length(); i++) {
//
//            fout.write(ch[i]);
//        }

        byte[] array = st.getBytes();

        fout.write(array);

        fout.flush();

        fout.close();

    }
}
