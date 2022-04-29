package com.github.hanyaeger.knightlyperil.entities.characters.knight;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.SceneBorderCrossingWatcher;
import com.github.hanyaeger.api.scenes.SceneBorder;
import com.github.hanyaeger.api.userinput.KeyListener;
import com.github.hanyaeger.knightlyperil.Main;
import com.github.hanyaeger.knightlyperil.constants.SceneConstants;
import com.github.hanyaeger.knightlyperil.entities.health.Health;
import com.github.hanyaeger.knightlyperil.entities.score.Score;
import javafx.scene.input.KeyCode;

import java.util.Set;

/**
 * This is a dynamic composite entity used as the main character of the game.
 * This class binds the knight hitbox and sprite with each other.
 */
public class Knight extends DynamicCompositeEntity implements KeyListener, SceneBorderCrossingWatcher {
    public Health health; // <- heap
    public Score score; // <- heap

    public KnightHitbox hitbox; // <- stack
    private DynamicSpriteEntity sprite; // <- stack

    public Main main; // <- heap

    /**
     * Create a new {@code DynamicCompositeEntity} on the given {@code initialLocation}.
     *
     * @param initialLocation the initial position at which this {@link DynamicCompositeEntity} should be placed.
     * @param main the main class is given trough because of needing to set the active scene.
     */
    public Knight(Coordinate2D initialLocation, Main main) { // <- stack
        super(initialLocation);
        this.health = new Health();
        this.score = new Score();
        this.main = main;
    }

    @Override
    protected void setupEntities() { // <- heap
        addEntity(createKnightSprite());
        addEntity(createKnightHitbox());
    }

    private DynamicSpriteEntity createKnightSprite() // <- stack
    {
        this.sprite = new KnightSprite(
                new Coordinate2D(0,0),
                new Size(200, 800),
                1, 10);

        return this.sprite;
    }

    private KnightHitbox createKnightHitbox() // <- stack
    {
        this.hitbox = new KnightHitbox(
                new Coordinate2D(75, 70),
                this);

        return this.hitbox;
    }

    @Override
    public void onPressedKeysChange(Set<KeyCode> pressedKeys) { // <- heap
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

    @Override
    public void notifyBoundaryCrossing(SceneBorder border) { // <- heap
        if (border == SceneBorder.RIGHT) {
            main.setActiveScene(SceneConstants.LEVEL_TWO);
        }
    }
}
