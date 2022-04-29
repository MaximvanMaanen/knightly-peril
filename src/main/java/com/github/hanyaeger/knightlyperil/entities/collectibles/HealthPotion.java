package com.github.hanyaeger.knightlyperil.entities.collectibles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.knightlyperil.entities.characters.knight.KnightHitbox;

import java.util.List;

public class HealthPotion extends BaseCollectible implements Collided {
    /**
     * Create a new {@code BaseCollectible} with the given {@code resource} and {@code size} on the given {@code location}.
     *
     * @param location the location at which this {@link BaseCollectible} should be placed.
     * @param size the size of the resource the {@link BaseCollectible} will be using.
     * @param resource the resource which the {@link BaseCollectible} will be using.
     */
    public HealthPotion(final Coordinate2D location, final Size size, final String resource) {
        super(location, size, resource);
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        for (Collider collider : collidingObjects)
        {
            if(collider instanceof KnightHitbox knightHitbox)
            {
                if (knightHitbox.knight.health.totalHealth < 3) {
                    knightHitbox.knight.health.totalHealth++;
                    super.onCollision(List.of(collider));
                }
            }
        }
    }
}

