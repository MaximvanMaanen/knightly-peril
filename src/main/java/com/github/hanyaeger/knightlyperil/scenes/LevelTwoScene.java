package com.github.hanyaeger.knightlyperil.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.knightlyperil.Main;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.mushroom.Mushroom;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.skeleton.Skeleton;
import com.github.hanyaeger.knightlyperil.entities.characters.knight.Knight;
import com.github.hanyaeger.knightlyperil.entities.map.LevelTwoMap;
import com.github.hanyaeger.knightlyperil.ui.healthbar.Healthbar;

public class LevelTwoScene extends DynamicScene implements TileMapContainer {
    private Main main;

    public LevelTwoScene(Main main)
    {
        this.main = main;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background-level2.png");
    }

    @Override
    public void setupEntities() {
        var knight = setupKnightEntity();
        setupUiEntities(knight);
        setupEnemyEntities();
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new LevelTwoMap());
    }

    private Knight setupKnightEntity() {
        var knight = new Knight(new Coordinate2D(0, getHeight() / 17 * 15 - 130), main);
        addEntity(knight);
        return knight;
    }

    private void setupUiEntities(Knight knight) {
        var healthbar = new Healthbar(new Coordinate2D(10, 10), knight);
        addEntity(healthbar);
    }

    private void setupEnemyEntities() {
        addEntity(new Skeleton(new Coordinate2D(500, 725)));
        addEntity(new Mushroom(new Coordinate2D(1000, 450)));
    }
}
