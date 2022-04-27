package com.github.hanyaeger.knightlyperil.entities.characters.enemy.mushroom;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class Mushroom extends DynamicCompositeEntity {
    private DynamicSpriteEntity sprite;
    private MushroomHitbox hitbox;

    /**
     * Create a new {@code DynamicCompositeEntity} on the given {@code initialLocation}.
     *
     * @param initialLocation the initial position at which this {@link DynamicCompositeEntity} should be placed
     */
    public Mushroom(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {
        addEntity(createMushroomSprite());
        addEntity(createMushroomHitbox());
    }

    private DynamicSpriteEntity createMushroomSprite() {
        this.sprite = new MushroomSprite("sprites/mushroom/idle.png",
                new Coordinate2D(0, 0),
                new Size(200, 800),
                1, 4);

        return this.sprite;
    }

    private MushroomHitbox createMushroomHitbox() {
        this.hitbox = new MushroomHitbox(
                new Coordinate2D(85, 85),
                this);

        return this.hitbox;
    }
}
