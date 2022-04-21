package com.github.hanyaeger.tutorial.entities.knight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.tutorial.entities.health.Health;
import com.github.hanyaeger.tutorial.entities.score.Score;
import javafx.scene.input.KeyCode;

import java.util.Set;

public class Knight extends DynamicCompositeEntity implements KeyListener {
    public Health health;
    public Score score;
    private KnightSprite sprite;
    private KnightHitbox hitbox;

    public Knight(Coordinate2D initialLocation) {
        super(initialLocation);
        this.health = new Health();
        this.score = new Score();
    }

    @Override
    protected void setupEntities() {
        addEntity(createKnightSprite());
        addEntity(createKnightHitbox());
    }

    private KnightSprite createKnightSprite()
    {
        this.sprite = new KnightSprite(
                new Coordinate2D(0,0),
                new Size(200, 800),
                1, 10);

        return this.sprite;
    }

    private KnightHitbox createKnightHitbox()
    {
        this.hitbox = new KnightHitbox(
                new Coordinate2D(75, 70),
                this);

        return this.hitbox;
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
}
