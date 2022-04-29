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

/**
 * This class creates the game over scene.
 */
public class GameOverScene extends StaticScene {
    private Main main;

    /**
     * Create a new {@code DynamicScene}.
     *
     * @param main the main class is given trough because of needing to set the active scene in the {@code backToMenuButton}.
     */
    public GameOverScene(Main main)
    {
        this.main = main;
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

        var backToMenuButton = new BackToMenuButton(
                new Coordinate2D(getWidth() * 0.5 - 100, getHeight() * 0.5), main);
        addEntity(backToMenuButton);
    }
}
