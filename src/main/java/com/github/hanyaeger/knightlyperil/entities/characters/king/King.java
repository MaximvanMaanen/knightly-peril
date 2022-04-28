package com.github.hanyaeger.knightlyperil.entities.characters.king;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class King extends SpriteEntity {
    public King(Coordinate2D location, Size size) {
        super("sprites/king/king.png", location, size);
    }
}