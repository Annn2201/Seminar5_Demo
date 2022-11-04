import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class MyImage {
    public static void main(String args[])

    {
        // width of the image
        int width = 963;

        // height of the image
        int height = 640;

        // For storing image in RAM
        BufferedImage image = null;

        // READ IMAGE
        try {
            File input_file = new File(
                    "Seminar5_Demo/Annn.png");

            image = new BufferedImage(
                    width, height, BufferedImage.TYPE_INT_ARGB);

            image = ImageIO.read(input_file);

            System.out.println("Reading complete.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }

        try {
            File output_file = new File(
                    "Seminar5_Demo/Annn2.png");

            ImageIO.write(image, "png", output_file);

            System.out.println("Writing complete.");
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}