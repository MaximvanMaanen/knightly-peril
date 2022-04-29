package com.github.hanyaeger.knightlyperil.ui.healthbar;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class HealthbarBackgroundOne extends SpriteEntity {
    /**
     * Create a new {@code SpriteEntity} on the given {@code location}.
     *
     * @param location the location at which this {@link SpriteEntity} should be placed.
     */
    public HealthbarBackgroundOne(Coordinate2D location) {
        super("sprites/user_interface/bar_background.png", location);
    }
}
