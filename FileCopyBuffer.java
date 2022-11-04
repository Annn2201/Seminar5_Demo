import java.io.*;
public class FileCopyBuffer {
    public static void main(String[] args)  {
        BufferedInputStream in = null;
        BufferedOutputStream out = null;
        String inFile = "Seminar5_Demo/test-in.png";
        String outFile = "test-out.png";
        long startTime, endTime;
        File fileIn = new File(inFile);
        System.out.println("File size is " + fileIn.length() + " bytes");
        try {
            in = new BufferedInputStream(new FileInputStream(inFile));
            out = new BufferedOutputStream(new FileOutputStream(outFile));
            startTime = System.nanoTime();
            while (in.read() != -1) {
                out.write(in.read());
            }
            endTime = System.nanoTime() - startTime;
            System.out.println("End time is: " +(endTime / 1000000) + " ms");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (in != null){
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}