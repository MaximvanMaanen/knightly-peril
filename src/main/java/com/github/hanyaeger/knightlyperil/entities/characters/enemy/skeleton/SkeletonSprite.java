package com.github.hanyaeger.knightlyperil.entities.characters.enemy.skeleton;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class SkeletonSprite extends DynamicSpriteEntity {
    protected SkeletonSprite(String resource, Coordinate2D initialLocation, Size size, int rows, int columns) {
        super(resource, initialLocation, size, rows, columns);
        setAutoCycle(150, -1);
    }
}
