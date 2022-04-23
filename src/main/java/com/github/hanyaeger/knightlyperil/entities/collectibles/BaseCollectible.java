package com.github.hanyaeger.knightlyperil.entities.collectibles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import java.util.List;

abstract class BaseCollectible extends SpriteEntity implements Collided
{
    public BaseCollectible(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
    }

    /**
     * Triggers the collision and removes the child from the memory.
     * @
     * @param collidingObjects
     */
    @Override
    public void onCollision(List<Collider> collidingObjects) {
        this.remove();
    }
}
