package com.canfield010.mygame.item;

import com.canfield010.mygame.mapsquares.MapSquare;

public class IronOre extends Item {
    public IronOre() {
        super("Iron Ore", 32);
    }

    @Override
    public void use(MapSquare square) {

    }

    @Override
    public boolean isUseful(MapSquare square) {
        return false;
    }
}