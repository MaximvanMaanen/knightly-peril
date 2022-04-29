package com.github.hanyaeger.knightlyperil.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.knightlyperil.Main;
import com.github.hanyaeger.knightlyperil.entities.buttons.BackToMenuButton;
import com.github.hanyaeger.knightlyperil.entities.characters.king.King;
import com.github.hanyaeger.knightlyperil.entities.characters.knight.Knight;
import com.github.hanyaeger.knightlyperil.entities.health.Health;
import com.github.hanyaeger.knightlyperil.entities.map.EndSceneMap;
import com.github.hanyaeger.knightlyperil.entities.score.Score;
import com.github.hanyaeger.knightlyperil.ui.healthbar.Healthbar;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * This class creates the end scene.
 */
public class EndScene extends DynamicScene implements TileMapContainer {
    private final Main main;
    private final SceneConfigurationModel model;

    public EndScene(Main main, SceneConfigurationModel model)
    {
        this.main = main;
        this.model = model;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background-level2.png");
    }

    @Override
    public void setupEntities() {
        addEntity(this.model.knight);
        addEntity(this.model.healthbar);
        addEntity(this.model.scoreDisplay);

        setupKingEntity();
        setupEndText();
        setupButton();
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new EndSceneMap());
    }

    private void setupKingEntity() {
        var king = new King(
                new Coordinate2D(getWidth() / 20 * 18 - 40, getHeight() / 17 * 12 - 120),
                new Size(40, 120)
        );
        addEntity(king);
    }

    private void setupEndText() {
        var kingText = new TextEntity(
                new Coordinate2D(getWidth() / 20 * 16, getHeight() / 17 * 9),
                "Dankjewel voor het verslaan van de \r\nvijanden!!");
        kingText.setFont(Font.font(18));
        kingText.setFill(Color.WHITE);
        addEntity(kingText);

        var scoreAndLivesText = new TextEntity(
                new Coordinate2D(getWidth() / 20 * 16, getHeight() / 17 * 8),
                "Score: " + this.model.knight.score.totalScore + "\r\n" + "Lives: " + this.model.knight.health.totalHealth );
        scoreAndLivesText.setFont(Font.font(18));
        scoreAndLivesText.setFill(Color.WHITE);
        addEntity(scoreAndLivesText);
    }

    private void setupButton() {
        var backToMenuButton = new BackToMenuButton(
                new Coordinate2D(getWidth() / 20 * 17, getHeight() / 17 * 4),
                main);
        addEntity(backToMenuButton);
    }
}
