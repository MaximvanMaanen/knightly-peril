package com.github.hanyaeger.knightlyperil.entities.collectibles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import java.util.List;

/**
 * This class handles the collision between character and collectible.
 */
public abstract class BaseCollectible extends SpriteEntity implements Collided {
    /**
     * Create a new {@code SpriteEntity} with the given {@code resource} and {@code size} on the given {@code location}.
     *
     * @param location the location at which this {@link SpriteEntity} should be placed.
     * @param size the size of the resource the {@link SpriteEntity} will be using.
     * @param resource the resource which the {@link SpriteEntity} will be using.
     */
    public BaseCollectible(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        this.remove();
    }
}
