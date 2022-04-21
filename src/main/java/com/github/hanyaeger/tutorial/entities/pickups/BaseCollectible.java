package com.github.hanyaeger.tutorial.entities.pickups;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

abstract class BaseCollectible extends SpriteEntity implements Collided
{
    public BaseCollectible(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
    }

    /**
     * 
     * @param collider
     */
    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof SpriteEntity spriteEntity)
        {
            spriteEntity.remove();
        }
    }
}
