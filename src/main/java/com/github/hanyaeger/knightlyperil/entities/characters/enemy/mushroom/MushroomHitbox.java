package com.github.hanyaeger.knightlyperil.entities.characters.enemy.mushroom;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.knightlyperil.entities.characters.BaseBody;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.IEnemy;
import javafx.scene.paint.Color;

public class MushroomHitbox extends BaseBody implements Collider, IEnemy {
    public Mushroom mushroom;

    public MushroomHitbox(Coordinate2D initialPosition, Mushroom mushroom) {
        super(initialPosition, mushroom);
        setWidth(35);
        setHeight(50);
        setFill(Color.TRANSPARENT);

        this.mushroom = mushroom;
    }
}
