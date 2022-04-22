package com.github.hanyaeger.knightlyperil.ui.healthbar;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public class HealthbarRectangle extends RectangleEntity {
    public HealthbarRectangle(Coordinate2D location, Size size) {
        super(location, size);
        setFill(Color.DARKRED);
        setWidth(size.width());
        setHeight(size.height());
    }
}
