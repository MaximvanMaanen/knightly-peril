package com.github.hanyaeger.knightlyperil.entities.characters.enemy.skeleton;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.knightlyperil.entities.characters.BaseBody;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.IEnemy;
import javafx.scene.paint.Color;

public class SkeletonHitbox extends BaseBody implements Collider, IEnemy {
    public Skeleton skeleton;
    private final int skeletonHitboxWidth = 35;
    private final int skeletonHitboxHeight = 55;

    public SkeletonHitbox(Coordinate2D initialPosition, Skeleton skeleton) {
        super(initialPosition, skeleton);
        setWidth(skeletonHitboxWidth);
        setHeight(skeletonHitboxHeight);
        setFill(Color.TRANSPARENT);

        this.skeleton = skeleton;
    }
}
