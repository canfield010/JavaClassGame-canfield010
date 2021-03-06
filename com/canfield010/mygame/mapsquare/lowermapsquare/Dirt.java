package com.canfield010.mygame.mapsquare.lowermapsquare;

import com.canfield010.mygame.mapsquare.MapSquare;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Dirt extends LowerMapSquare{

    public static Image image;

    public Dirt() {
        super("Dirt", true);
    }

    public static void setImage() {
        try {
            image = ImageIO.read(new File("img/dirt.png"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public Image getImage() {
        return image;
    };

}
