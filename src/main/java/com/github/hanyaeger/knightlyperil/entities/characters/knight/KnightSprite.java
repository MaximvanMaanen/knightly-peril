package com.github.hanyaeger.knightlyperil.entities.characters.knight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class KnightSprite extends DynamicSpriteEntity {
    /**
     * Create a new {@code DynamicSpriteEntity}.
     *
     * @param location the location at which this {@link DynamicSpriteEntity} should be placed.
     * @param size the size of the resource the {@link DynamicSpriteEntity} will be using.
     * @param rows the row of the resource the {@link DynamicSpriteEntity} will be using.
     * @param columns the column of the resource the {@link DynamicSpriteEntity} will be using.
     */
    public KnightSprite(Coordinate2D location, Size size, int rows, int columns) {
        super("sprites/knight/idle.png", location, size, rows, columns);
        setAutoCycle(100, -1);
    }
}
