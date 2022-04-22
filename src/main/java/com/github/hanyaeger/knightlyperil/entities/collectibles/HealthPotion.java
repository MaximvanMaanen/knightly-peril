package com.github.hanyaeger.knightlyperil.entities.collectibles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.knightlyperil.entities.collectibles.BaseCollectible;
import com.github.hanyaeger.knightlyperil.entities.knight.KnightHitbox;
import static com.github.hanyaeger.knightlyperil.entities.health.Health.maxTotalHealth;
import java.util.List;

public class HealthPotion extends BaseCollectible implements Collided {
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

