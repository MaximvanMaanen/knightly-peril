package com.github.hanyaeger.knightlyperil.entities.characters.enemy.skeleton;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.knightlyperil.entities.characters.BaseBody;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.IEnemy;
import javafx.scene.paint.Color;

/**
 * This is the hitbox of the skeleton enemy. The hitbox is used for collision.
 */
public class SkeletonHitbox extends BaseBody implements Collider, IEnemy {
    public Skeleton skeleton;

    /**
     * Create a new {@code BaseBody} on the given {@code initialPosition}.
     *
     * @param initialPosition the initial position at which this {@link BaseBody} should be placed.
     * @param skeleton the class who needs the {@link BaseBody}.
     */
    public SkeletonHitbox(Coordinate2D initialPosition, Skeleton skeleton) {
        super(initialPosition, skeleton);
        setWidth(35);
        setHeight(55);
        setFill(Color.TRANSPARENT);

        this.skeleton = skeleton;
    }
}
