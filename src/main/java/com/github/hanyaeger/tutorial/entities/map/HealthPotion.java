package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.entities.health.Health;
import com.github.hanyaeger.tutorial.entities.knight.KnightHitbox;

public class HealthPotion extends SpriteEntity implements Collided {
    public Health health;

    public HealthPotion(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
        this.health = new Health();
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof KnightHitbox knightHitbox)
        {
            if (this.health.health < 3) {
                this.health.health++;
            }
            this.remove();
        }
    }
}
