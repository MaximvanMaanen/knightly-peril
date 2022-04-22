package com.github.hanyaeger.tutorial.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.tutorial.entities.knight.KnightHitbox;

public class Platform extends DynamicSpriteEntity implements Collided, SceneBorderCrossingWatcher {

    public Platform(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
        setMotion(1, Direction.UP);
    }

    @Override
    public void notifyBoundaryCrossing(SceneBorder border){
        setDirection(Direction.DOWN);
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof KnightHitbox knightHitbox)
        {
            knightHitbox.knight.nullifySpeedInDirection(Direction.DOWN);
        }
    }

    public void update() {
        getAnchorLocation();
    }
}
