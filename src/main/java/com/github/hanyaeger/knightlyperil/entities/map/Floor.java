package com.github.hanyaeger.knightlyperil.entities.map;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class Floor extends SpriteEntity implements Collider {
    public Floor(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
    }
}

