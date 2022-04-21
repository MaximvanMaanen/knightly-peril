package com.github.hanyaeger.tutorial.entities.pickups;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.tutorial.entities.knight.KnightHitbox;

public class HealthPotion extends BaseCollectible {

    public HealthPotion(final Coordinate2D location, final Size size, final String resource) {
        super(location, size, resource);
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof KnightHitbox knightHitbox)
        {
            if (knightHitbox.knight.health.totalHealth < 3) {
                knightHitbox.knight.health.totalHealth++;
                super.onCollision(collider);
            }
        }

    }
}

