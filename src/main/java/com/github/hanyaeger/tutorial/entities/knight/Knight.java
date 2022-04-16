package com.github.hanyaeger.tutorial.entities.knight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.Newtonian;
import com.github.hanyaeger.api.userinput.KeyListener;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class Knight extends DynamicCompositeEntity implements KeyListener, Newtonian {
    public Knight(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {
        var sprite = new KnightSprite(
                new Coordinate2D(0,0),
                new Size(200, 800),
                1, 10);
        addEntity(sprite);

        var hitbox = new KnightHitbox(new Coordinate2D(75, 70), this);
        addEntity(hitbox);
        setKnightNewtonian();
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) {
        int speed = 3;
        if(pressedKeys.contains(KeyCode.LEFT)){
            setMotion(speed,270d);
        } else if(pressedKeys.contains(KeyCode.RIGHT)){
            setMotion(speed,90d);
        } else if(pressedKeys.contains(KeyCode.SPACE)){
            setMotion(speed,180d);
        } else if(pressedKeys.contains(KeyCode.DOWN)){
            setMotion(speed,0d);
        } else if(pressedKeys.isEmpty()){
            setSpeed(0);
        }
    }

    private void setKnightNewtonian()
    {
        setGravityConstant(0.001);
        setFrictionConstant(0);
    }
}
