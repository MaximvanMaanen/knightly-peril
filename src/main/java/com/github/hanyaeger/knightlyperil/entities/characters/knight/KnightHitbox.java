package com.github.hanyaeger.knightlyperil.entities.characters.knight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.knightlyperil.entities.characters.BaseBody;
import javafx.scene.paint.Color;

import java.util.List;

public class KnightHitbox extends BaseBody implements Collided, Collider {
    public Knight knight;
    private final int knightHitboxWidth = 35;
    private final int knightHitboxHeight = 65;

    public KnightHitbox(final Coordinate2D initialPosition, Knight knight) {
        super(initialPosition, knight);
        setWidth(knightHitboxWidth);
        setHeight(knightHitboxHeight);
        setFill(Color.TRANSPARENT);

        this.knight = knight;
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        super.onCollision(collidingObjects);
    }
}
