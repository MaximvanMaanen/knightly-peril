package com.github.hanyaeger.knightlyperil.entities.characters;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.Direction;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

import java.util.List;

public abstract class BaseBody extends RectangleEntity implements Collided {
    /**
     * The deviant is set to 3. This seems to be the lowest number the engine can reliably handle.
     */
    private final int deviant = 3;
    private DynamicCompositeEntity character;

    protected BaseBody(Coordinate2D initialPosition, DynamicCompositeEntity character) {
        super(initialPosition);
        this.character = character;
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        for (Collider collider : collidingObjects) {
            if (collider instanceof SpriteEntity traversable) {
                handleStaticEntityCollision(traversable);
            }
            else if(collider instanceof DynamicSpriteEntity traversable) {
                handleDynamicEntityCollision(traversable);
            }
        }
    }

    private void handleStaticEntityCollision(SpriteEntity traversable)
    {
        var traversableBoundingBox = traversable.getBoundingBox();
        var bodyBoundingBox = this.getBoundingBox();
        var knightBoundingBox = character.getBoundingBox();

        // Collision happens from above.
        if((bodyBoundingBox.getMaxY() - traversableBoundingBox.getMinY()) <= deviant &&
                (bodyBoundingBox.getMaxY() - traversableBoundingBox.getMinY()) > 0
        ) {
            character.nullifySpeedInDirection(Direction.DOWN);
            character.setAnchorLocation(new Coordinate2D(knightBoundingBox.getMinX(), knightBoundingBox.getMinY() - deviant));
        }
        // Collision happens from below.
        else if((traversableBoundingBox.getMaxY() - bodyBoundingBox.getMinY()) <= deviant &&
                (traversableBoundingBox.getMaxY() - bodyBoundingBox.getMinY()) > 0
        ) {
            character.nullifySpeedInDirection(Direction.UP);
            character.setAnchorLocation(new Coordinate2D(knightBoundingBox.getMinX(), knightBoundingBox.getMinY() + deviant));
        }
        // Collision happens from the left.
        else if((bodyBoundingBox.getMaxX() - traversableBoundingBox.getMinX())  <= deviant &&
                (bodyBoundingBox.getMaxX() - traversableBoundingBox.getMinX()) > 0
        ) {
            character.nullifySpeedInDirection(Direction.RIGHT);
            character.setAnchorLocation(new Coordinate2D(knightBoundingBox.getMinX() - deviant, knightBoundingBox.getMinY()));
        }
        // Collision happens from the right.
        else if((traversableBoundingBox.getMaxX() - bodyBoundingBox.getMinX()) <= deviant &&
                (traversableBoundingBox.getMaxX() - bodyBoundingBox.getMinX()) > 0
        ) {
            character.nullifySpeedInDirection(Direction.LEFT);
            character.setAnchorLocation(new Coordinate2D(knightBoundingBox.getMinX() + deviant, knightBoundingBox.getMinY()));
        }
    }

    private void handleDynamicEntityCollision(DynamicSpriteEntity traversable)
    {
        var traversableBoundingBox = traversable.getBoundingBox();
        var bodyBoundingBox = this.getBoundingBox();
        var characterBoundingBox = character.getBoundingBox();

        // Collision happens from above.
        if((bodyBoundingBox.getMaxY() - traversableBoundingBox.getMinY()) <= deviant &&
                (bodyBoundingBox.getMaxY() - traversableBoundingBox.getMinY()) > 0
        ) {
            character.nullifySpeedInDirection(Direction.DOWN);
            character.setAnchorLocation(new Coordinate2D(characterBoundingBox.getMinX(), characterBoundingBox.getMinY() - deviant));
        }
        // Collision happens from below.
        else if((traversableBoundingBox.getMaxY() - bodyBoundingBox.getMinY()) <= deviant &&
                (traversableBoundingBox.getMaxY() - bodyBoundingBox.getMinY()) > 0
        ) {
            character.nullifySpeedInDirection(Direction.UP);
            character.setAnchorLocation(new Coordinate2D(characterBoundingBox.getMinX(), characterBoundingBox.getMinY() + deviant));
        }
        // Collision happens from the left.
        else if((bodyBoundingBox.getMaxX() - traversableBoundingBox.getMinX())  <= deviant &&
                (bodyBoundingBox.getMaxX() - traversableBoundingBox.getMinX()) > 0
        ) {
            character.nullifySpeedInDirection(Direction.RIGHT);
            character.setAnchorLocation(new Coordinate2D(characterBoundingBox.getMinX() - deviant, characterBoundingBox.getMinY()));
        }
        // Collision happens from the right.
        else if((traversableBoundingBox.getMaxX() - bodyBoundingBox.getMinX()) <= deviant &&
                (traversableBoundingBox.getMaxX() - bodyBoundingBox.getMinX()) > 0
        ) {
            character.nullifySpeedInDirection(Direction.LEFT);
            character.setAnchorLocation(new Coordinate2D(characterBoundingBox.getMinX() + deviant, characterBoundingBox.getMinY()));
        }
    }
}
