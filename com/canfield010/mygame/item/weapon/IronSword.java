package com.canfield010.mygame.item.weapon;

import com.canfield010.mygame.mapsquare.MapSquare;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.util.Random;

public class IronSword extends Weapon {

    public static Image image;

    //private final int maxDamage = 12;
    //private final int minDamage = 9;

    public IronSword() {
        super("Iron Sword", 12, 9);
    }

    @Override
    public void use(MapSquare square) {
        square.occupant.damage(new Random().nextInt(maxDamage - minDamage) + minDamage);
    }

    @Override
    public boolean isUseful(MapSquare square) {
        return !(square.occupant==null);
    }

    public static void setImage() {
        try {
            image = ImageIO.read(new File("img/ironSword.png"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public Image getImage() {
        return image;
    };
}
