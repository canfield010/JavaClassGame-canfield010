package com.canfield010.mygame.item.tool;

import com.canfield010.mygame.item.Item;
import com.canfield010.mygame.mapsquares.MapSquare;

public class Axe extends Item {

    public Axe() {
        super("Axe", 1);
    }

    @Override
    public void use(MapSquare square) {

    }

    @Override
    public boolean isUseful(MapSquare square) {
        return false;
    }
}