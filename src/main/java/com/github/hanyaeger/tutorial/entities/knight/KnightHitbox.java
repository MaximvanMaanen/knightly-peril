package com.github.hanyaeger.tutorial.entities.knight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public class KnightHitbox extends RectangleEntity implements Collider {
    public Knight knight;

    public KnightHitbox(final Coordinate2D initialPosition, Knight knight) {
        super(initialPosition);
        setWidth(35);
        setHeight(65);
        setFill(Color.TRANSPARENT);

        this.knight = knight;
    }
}
