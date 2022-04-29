package com.github.hanyaeger.knightlyperil.entities.map.structures;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

/**
 * This class is used for setting the platform images in a map.
 */
public class Platform extends DynamicSpriteEntity implements Collider {
    /**
     * Create a new {@code DynamicSpriteEntity}.
     *
     * @param location the location at which this {@link DynamicSpriteEntity} should be placed.
     * @param size the size of the resource the {@link DynamicSpriteEntity} will be using.
     * @param resource the resource which the {@link DynamicSpriteEntity} will be using.
     */
    public Platform(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
        setMotion(1, Direction.UP);
    }
}
