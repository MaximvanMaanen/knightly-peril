package com.github.hanyaeger.knightlyperil.entities.map.structures;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public abstract class BaseStaticStructure extends SpriteEntity implements Collider {
    public BaseStaticStructure(final Coordinate2D location, final Size size, final String resource) {
        super(resource, location, size);
    }
}
