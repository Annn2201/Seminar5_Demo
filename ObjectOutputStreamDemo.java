import java.io.*;
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("testout.txt"));
            // create student
            Student_1 student = new Student_1(1, "Tran Hao Phong", "Ha Noi", 17);
            // write student
            oos.writeObject(student);
            System.out.println("Success...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
    }
}
