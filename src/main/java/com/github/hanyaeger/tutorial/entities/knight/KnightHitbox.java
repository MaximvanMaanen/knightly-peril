package com.github.hanyaeger.tutorial.entities.knight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public class KnightHitbox extends RectangleEntity implements Collider {
    public KnightHitbox(final Coordinate2D initialPosition) {
        super(initialPosition);
        setWidth(35);
        setHeight(65);
        setFill(Color.TRANSPARENT);
    }
}
