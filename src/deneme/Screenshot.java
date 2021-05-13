package deneme;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class Screenshot {
    public static void main(String[] args){

        try {

            Thread.sleep(5000);
            LocalDate myObj = LocalDate.now();
            Robot r = new Robot();
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            Rectangle rect = new Rectangle(dim);
            BufferedImage buff = r.createScreenCapture(rect);
            ImageIO.write(buff, "jpg", new File("C:\\Users\\hanna\\OneDrive\\Masaüstü\\screenshot.jpg"));
            System.out.println(myObj);
            System.out.println("deneme.Screenshot alındı");
        }


        catch (AWTException | IOException | InterruptedException ex){

            System.out.println(ex);
            System.out.println("hata");
        }
    }
}
