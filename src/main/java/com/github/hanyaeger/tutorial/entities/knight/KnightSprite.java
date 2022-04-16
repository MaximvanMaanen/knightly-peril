package com.github.hanyaeger.tutorial.entities.knight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class KnightSprite extends DynamicSpriteEntity {
    public KnightSprite(Coordinate2D location, Size size, int rows, int columns) {
        super("sprites/knight/idle.png", location, size, rows, columns);
        setAutoCycle(100, -1);
    }
}
