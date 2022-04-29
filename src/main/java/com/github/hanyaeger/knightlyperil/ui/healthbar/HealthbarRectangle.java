package com.github.hanyaeger.knightlyperil.ui.healthbar;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import javafx.scene.paint.Color;

/**
 * This is the healthbar itself, which can be different widths defined by the health of the player.
 */
public class HealthbarRectangle extends RectangleEntity {
    /**
     * Create a new {@code RectangleEntity} on the given {@code location}.
     *
     * @param location the location at which this {@link RectangleEntity} should be placed.
     */
    public HealthbarRectangle(Coordinate2D location, Size size) {
        super(location, size);
        setFill(Color.DARKRED);
        setWidth(size.width());
        setHeight(size.height());
    }
}
