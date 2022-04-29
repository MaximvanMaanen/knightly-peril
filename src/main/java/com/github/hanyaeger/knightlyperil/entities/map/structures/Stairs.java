package com.github.hanyaeger.knightlyperil.entities.map.structures;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

/**
 * This class is used for setting the stairs images in a map.
 */
public class Stairs extends SpriteEntity implements Collider {
    /**
     * Create a new {@code SpriteEntity}.
     *
     * @param location the location at which this {@link SpriteEntity} should be placed.
     * @param size the size of the resource the {@link SpriteEntity} will be using.
     * @param resource the resource which the {@link SpriteEntity} will be using.
     */
    public Stairs(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
    }
}
