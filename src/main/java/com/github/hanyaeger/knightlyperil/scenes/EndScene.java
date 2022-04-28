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

public class EndScene extends DynamicScene implements TileMapContainer {
    private Main main;
    private Score score;
    private Health health;

    public EndScene(Main main)
    {
        this.main = main;
        this.score = new Score();
        this.health = new Health();
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background-level2.png");
    }

    @Override
    public void setupEntities() {
        var knight = setupKnightEntity();
        setupUiEntities(knight);
        setupKingEntity();
        setupEndText();
        setupButton();
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new EndSceneMap());
    }

    private Knight setupKnightEntity() {
        var knight = new Knight(new Coordinate2D(-40, 385), main);
        addEntity(knight);
        return knight;
    }

    private void setupUiEntities(Knight knight) {
        var healthbar = new Healthbar(new Coordinate2D(10, 10), knight);
        addEntity(healthbar);
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
                "Score: " + score.totalScore + "\r\n" + "Lives: " + health.totalHealth );
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
