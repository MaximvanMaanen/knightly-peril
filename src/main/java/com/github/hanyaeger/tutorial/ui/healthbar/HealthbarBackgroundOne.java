package com.github.hanyaeger.tutorial.ui.healthbar;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class HealthbarBackgroundOne extends SpriteEntity {
    public HealthbarBackgroundOne(Coordinate2D location) {
        super("sprites/user_interface/bar_background.png", location);
    }
}
