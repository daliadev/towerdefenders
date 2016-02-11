/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefenders.utils;

import java.awt.Dimension;
import resources.Resource;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Nicolas
 */
public class ImageLoader {
    
    
    public static boolean isLoaded = false;
    
    private static BufferedImage image;
    
    
    public static BufferedImage load(String filePath)
    {
        
        isLoaded = false;
        
        if (filePath != null)
        {
            try
            {
                image = ImageIO.read(Resource.class.getResource(filePath));
                isLoaded = true;
            }
            catch(IOException e)
            {
                System.out.println("towerdefenders.utils.ImageLoader.load() : Chargement de l'image impossible.");
                e.printStackTrace();
            }
        }
        
        return image;
    }
    
    public static boolean isLoaded() {
        
        return isLoaded;
    }
    
    public static int getWidth() {
        
        return image.getWidth();
    }
    
    public static int getHeight() {
        
        return image.getHeight();
    }
}
