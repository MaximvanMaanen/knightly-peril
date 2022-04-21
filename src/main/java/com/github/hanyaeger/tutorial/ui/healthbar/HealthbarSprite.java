package com.github.hanyaeger.tutorial.ui.healthbar;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.DynamicSpriteEntity;

public class HealthbarSprite extends DynamicSpriteEntity {
    public HealthbarSprite(Coordinate2D location, Size size) {
        super("sprites/user_interface/health_bar.png", location, size);
    }
}
