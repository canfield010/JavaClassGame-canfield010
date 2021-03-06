package com.canfield010.mygame.mapsquare.lowermapsquare;

import com.canfield010.mygame.mapsquare.MapSquare;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Water extends LowerMapSquare {
    //public static final String imageLocation = "img/grass.png";
    public static Image image;
    public Water() {
        super("Water", false);
    }

    public static void setImage() {
        try {
            image = ImageIO.read(new File("img/water.png"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public Image getImage() {
        return image;
    };
}
