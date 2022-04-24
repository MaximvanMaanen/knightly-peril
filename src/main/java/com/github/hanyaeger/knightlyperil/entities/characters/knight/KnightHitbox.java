package com.github.hanyaeger.knightlyperil.entities.characters.knight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.knightlyperil.entities.characters.BaseBody;
import com.github.hanyaeger.knightlyperil.entities.characters.knight.helpers.KnightEnemyCollisionHandler;
import javafx.scene.paint.Color;

import java.util.List;

public class KnightHitbox extends BaseBody implements Collided, Collider {
    public Knight knight;
    private final int knightHitboxWidth = 35;
    private final int knightHitboxHeight = 65;
    private KnightEnemyCollisionHandler collisionHandler;

    public KnightHitbox(final Coordinate2D initialPosition, Knight knight) {
        super(initialPosition, knight);
        setWidth(knightHitboxWidth);
        setHeight(knightHitboxHeight);
        setFill(Color.TRANSPARENT);

        this.knight = knight;
        this.collisionHandler = new KnightEnemyCollisionHandler(knight);
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        super.onCollision(collidingObjects);
        collisionHandler.handleEnemyCollision(collidingObjects);
    }
}
