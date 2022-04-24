package com.github.hanyaeger.knightlyperil.entities.map.structures;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Platform extends DynamicSpriteEntity implements Collider {
    public Platform(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
        setMotion(1, Direction.UP);
    }
}
