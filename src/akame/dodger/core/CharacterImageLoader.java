package akame.dodger.core;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CharacterImageLoader {

    private static String folderPath = File.separatorChar + "src" +
            File.separatorChar + "akame" +
            File.separatorChar + "dodger" +
            File.separatorChar + "rsc" +
            File.separatorChar + "pictures";

    public static BufferedImage getCharacterImage(String character, int alt) {
        Image result = null;

        try {
            String path = new File(".").getCanonicalPath() +
                    folderPath +
                    File.separatorChar + character + " (" + alt + ").png";

            result = ImageIO.read(new File(path));
        } catch (IOException e) {
            // TODO : Write report if image not found
            e.printStackTrace();
        }

        return (BufferedImage) result;
    }
}
