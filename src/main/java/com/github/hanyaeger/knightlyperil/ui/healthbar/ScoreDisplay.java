package com.github.hanyaeger.knightlyperil.ui.healthbar;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.impl.CustomFont;
import com.github.hanyaeger.api.entities.impl.DynamicTextEntity;
import com.github.hanyaeger.knightlyperil.entities.characters.knight.Knight;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class ScoreDisplay extends DynamicTextEntity implements UpdateExposer {
    private Knight knight;

    public ScoreDisplay(Coordinate2D initialLocation, Knight knight) {
        super(initialLocation);
        this.setFont(Font.font("Verdana", 20));
        this.setFill(Color.PURPLE);
        this.knight = knight;
    }

    @Override
    public void explicitUpdate(long timestamp) {
        this.setText("Score: " + this.knight.score.totalScore);
    }
}
