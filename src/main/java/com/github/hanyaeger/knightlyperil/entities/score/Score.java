package com.github.hanyaeger.knightlyperil.entities.score;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Score implements UpdateExposer {
    public int totalScore;

    public Score()
    {
        totalScore = 0;
    }

    public void setupScoreText() {
        var scoreText = new TextEntity(
                new Coordinate2D(1500, 10),
                "Score: " + totalScore);
        scoreText.setFont(Font.font(18));
        scoreText.setFill(Color.WHITE);
    }

    @Override
    public void explicitUpdate(long l) {
        setupScoreText();
    }
}
