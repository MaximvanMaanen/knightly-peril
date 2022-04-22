package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.entities.health.Health;
import com.github.hanyaeger.tutorial.entities.knight.KnightHitbox;
import static com.github.hanyaeger.tutorial.entities.health.Health.maxTotalHealth;
import java.util.List;

public class HealthPotion extends SpriteEntity implements Collided {

    public HealthPotion(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
    }

    @Override
    public void onCollision(List<Collider> collider) {
        if(collider instanceof KnightHitbox knightHitbox)
        {
            if (knightHitbox.knight.health.totalHealth < maxTotalHealth) {
                knightHitbox.knight.health.totalHealth++;
            }
            this.remove();
        }
    }
}

