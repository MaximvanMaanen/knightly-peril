package com.github.hanyaeger.knightlyperil.entities.characters.enemy.mushroom;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

/**
 * This is the image for the mushroom enemy.
 */
public class MushroomSprite extends DynamicSpriteEntity {
    /**
     * Create a new {@code DynamicSpriteEntity}.
     *
     * @param resource the resource which the {@link DynamicSpriteEntity} will be using.
     * @param initialLocation the initial position at which this {@link DynamicSpriteEntity} should be placed.
     * @param size the size of the resource the {@link DynamicSpriteEntity} will be using.
     * @param rows the row of the resource the {@link DynamicSpriteEntity} will be using.
     * @param columns the column of the resource the {@link DynamicSpriteEntity} will be using.
     */
    protected MushroomSprite(String resource, Coordinate2D initialLocation, Size size, int rows, int columns) {
        super(resource, initialLocation, size, rows, columns);
        setAutoCycle(100, -1);
    }
}
