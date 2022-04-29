package com.github.hanyaeger.knightlyperil.entities.characters.enemy.skeleton;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Skeleton extends DynamicCompositeEntity {
    private DynamicSpriteEntity sprite;
    private SkeletonHitbox hitbox;

    /**
     * Create a new {@code DynamicCompositeEntity} on the given {@code initialLocation}.
     *
     * @param initialLocation the initial position at which this {@link DynamicCompositeEntity} should be placed.
     */
    public Skeleton(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {
        addEntity(createSkeletonSprite());
        addEntity(createSkeletonHitbox());
    }

    private DynamicSpriteEntity createSkeletonSprite() {
        this.sprite = new SkeletonSprite("sprites/skeleton/idle.png",
                new Coordinate2D(0, 0),
                new Size(50, 200),
                1, 11);

        return this.sprite;
    }

    private SkeletonHitbox createSkeletonHitbox() {
        this.hitbox = new SkeletonHitbox(
                new Coordinate2D(0, 15),
                this);

        return this.hitbox;
    }
}
