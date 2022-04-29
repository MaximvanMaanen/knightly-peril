package com.github.hanyaeger.knightlyperil.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.knightlyperil.Main;
import com.github.hanyaeger.knightlyperil.entities.buttons.BackToMenuButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class GameOverScene extends StaticScene {
    private Main main;
    private final SceneConfigurationModel model;

    public GameOverScene(Main main, SceneConfigurationModel model)
    {
        this.main = main;
        this.model = model;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background1.jpg");
    }

    @Override
    public void setupEntities() {
        var gameOvertext = new TextEntity(new Coordinate2D(getWidth() * 0.5, getHeight() * 0.5), "GAME OVER!");
        gameOvertext.setAnchorPoint(AnchorPoint.BOTTOM_CENTER);
        gameOvertext.setFill(Color.WHITE);
        gameOvertext.setFont(Font.font("Roboto", FontWeight.BOLD, 100));
        addEntity(gameOvertext);

        var finalScoreText = new TextEntity(new Coordinate2D(getWidth() * 0.5, getHeight() * 0.2),
                "Final score: " + model.knight.score.totalScore);
        finalScoreText.setAnchorPoint(AnchorPoint.BOTTOM_CENTER);
        finalScoreText.setFill(Color.WHITE);
        finalScoreText.setFont(Font.font("Roboto", FontWeight.BOLD, 32));
        addEntity(finalScoreText);

        var backToMenuButton = new BackToMenuButton(
                new Coordinate2D(getWidth() * 0.5 - 100, getHeight() * 0.5), main);
        addEntity(backToMenuButton);
    }
}
