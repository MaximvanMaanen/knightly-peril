package com.github.hanyaeger.knightlyperil.entities.characters.enemy.mushroom;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.knightlyperil.entities.characters.BaseBody;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.IEnemy;
import javafx.scene.paint.Color;

/**
 * This is the hitbox of the mushroom enemy. The hitbox is used for collision.
 */
public class MushroomHitbox extends BaseBody implements Collider, IEnemy {
    public Mushroom mushroom;

    /**
     * Create a new {@code BaseBody} on the given {@code initialPosition}.
     *
     * @param initialPosition the initial position at which this {@link BaseBody} should be placed.
     * @param mushroom the class who needs the {@link BaseBody}.
     */
    public MushroomHitbox(Coordinate2D initialPosition, Mushroom mushroom) {
        super(initialPosition, mushroom);
        setWidth(35);
        setHeight(50);
        setFill(Color.TRANSPARENT);

        this.mushroom = mushroom;
    }
}
