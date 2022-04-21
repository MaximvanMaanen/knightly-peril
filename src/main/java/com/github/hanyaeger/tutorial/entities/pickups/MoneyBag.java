package com.github.hanyaeger.tutorial.entities.pickups;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.entities.knight.KnightHitbox;

public class MoneyBag extends SpriteEntity implements Collided {
    private int scoreWorth;

    public MoneyBag(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);

        // Find a way to instantiate this from the constructor
        this.scoreWorth = 10;
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof KnightHitbox knightHitbox)
        {
            knightHitbox.knight.score.totalScore += this.scoreWorth;
            this.remove();
        }
    }
}
