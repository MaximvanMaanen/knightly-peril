package com.github.hanyaeger.tutorial.ui.healthbar;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class HealthbarBackgroundOne extends DynamicSpriteEntity {
    public HealthbarBackgroundOne(Coordinate2D location) {
        super("sprites/user_interface/bar_background.png", location);
    }
}
