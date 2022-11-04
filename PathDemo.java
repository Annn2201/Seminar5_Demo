import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Seminar5_Demo/test.txt");
        FileSystem fs =  path.getFileSystem();
        System.out.println(fs.toString());
        System.out.println(path.isAbsolute());
        System.out.println(path.getFileName());
        System.out.println(path.toAbsolutePath().toString());
//        System.out.println(path.getRoot());
//        System.out.println(path.getParent());
//        System.out.println(path.getNameCount());
        System.out.println(path.getName(1));
//        System.out.println(path.subpath(0, 2));
//        System.out.println(path.toString());
//        System.out.println(path.getNameCount());
//        Path realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
//        System.out.println(realPath.toString());
    }
}
