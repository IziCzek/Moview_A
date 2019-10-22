package cz.uhk.fim.pro2.moview.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class ImageHandler {


    public static Image getImageFromUrl(String imageUrl){

        Image image = null;
        URL url = null;
        try {
            URL url = new URL(imageUrl);
            image = ImageIO.read(url);
        }catch(IOException e){

            e.printStackTrace();

        }
return image;
    }

}
