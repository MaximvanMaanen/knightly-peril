package com.github.hanyaeger.knightlyperil.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.knightlyperil.Main;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.mushroom.Mushroom;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.skeleton.Skeleton;
import com.github.hanyaeger.knightlyperil.entities.characters.knight.Knight;
import com.github.hanyaeger.knightlyperil.entities.map.LevelOneMap;
import com.github.hanyaeger.knightlyperil.entities.score.Score;
import com.github.hanyaeger.knightlyperil.ui.healthbar.Healthbar;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class LevelOneScene extends DynamicScene implements TileMapContainer, UpdateExposer {
    private Main main;
    private Score score;

    public LevelOneScene(Main main)
    {
        this.main = main;
        this.score = new Score();
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background-level1.jpg");
    }

    @Override
    public void setupEntities() {
        var knight = setupKnightEntity();
        setupUiEntities(knight);
        setupEnemyEntity();
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new LevelOneMap());
    }

    private Knight setupKnightEntity() {
        var knight = new Knight(
                new Coordinate2D(0, getHeight() / 17 * 15 - 130),
                main);
        addEntity(knight);
        return knight;
    }

    private void setupUiEntities(Knight knight) {
        score.setupScoreText();
        var healthbar = new Healthbar(new Coordinate2D(10, 10), knight);
        addEntity(healthbar);
    }

    private void setupEnemyEntity() {
        addEntity(new Skeleton(new Coordinate2D(500, 725)));
        addEntity(new Mushroom(new Coordinate2D(550, 660)));
    }

    @Override
    public void explicitUpdate(long l) {

    }
}
