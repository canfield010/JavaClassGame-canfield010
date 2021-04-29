package com.canfield010.mygame.mapsquare;

import com.canfield010.mygame.actors.Actor;
import com.canfield010.mygame.actors.Player;
import com.canfield010.mygame.gui.Button;
import com.canfield010.mygame.mapsquare.FinalPoint;
import com.canfield010.mygame.mapsquare.lowermapsquare.*;
import com.canfield010.mygame.mapsquare.uppermapsquare.UpperMapSquare;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class MapSquare extends JButton {

    public FinalPoint coordinates;
    public LowerMapSquare lowerMapSquare;
    public UpperMapSquare upperMapSquare;
    public Actor occupant;
    //public Button[] gui;
    //private String imageLocation;
    //public Icon icon;

    public MapSquare(LowerMapSquare lowerMapSquare, UpperMapSquare upperMapSquare, Actor actor, FinalPoint coordinates) {
        this.lowerMapSquare = lowerMapSquare;
        this.upperMapSquare = upperMapSquare;
        this.occupant = actor;
        this.coordinates = coordinates;
    }
    public MapSquare(LowerMapSquare lowerMapSquare, UpperMapSquare upperMapSquare, Actor actor) {
        this.lowerMapSquare = lowerMapSquare;
        this.upperMapSquare = upperMapSquare;
        this.occupant = actor;
    }

    public boolean isEmpty() {
        // The compiler did it this way and I think it is EPIC!
        return upperMapSquare == null && occupant == null;
    }
    public static void initalizeImages() {
        Dirt.setImage();
        Farmland.setImage();
        Grass.setImage();
        Lava.setImage();
        Water.setImage();
        WoodenPlanks.setImage();
        Player.setImage();
    }

    public static BufferedImage getABufferedImage(String imageLocation, int x, int y) {
        BufferedImage bufferedImage = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bufferedImage.createGraphics();

        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        try {
            g2.drawImage(ImageIO.read(new File(imageLocation)), 0, 0, x, y, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        g2.dispose();
        return bufferedImage;
    }

    public ImageIcon getImage(int x, int y) {
        BufferedImage bufferedImage = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = bufferedImage.createGraphics();

        //g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        //if (lowerMapSquare == null) {
            //System.out.println("It truly is null!");
        //}
        g2.drawImage(lowerMapSquare.getImage(), 0, 0, x, y, null);
        if (occupant!=null) {
            g2.drawImage(occupant.getImage(), 0, 0, x, y, null);
            //g2.drawImage(new Grass().image, 0, 0, x, y, null);
        }
        g2.dispose();
        return new ImageIcon(bufferedImage);
    }

    public boolean canMoveTo() {
        return true;
    }
}
