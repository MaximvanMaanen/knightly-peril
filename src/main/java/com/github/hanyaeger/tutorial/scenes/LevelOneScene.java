package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.Main;
import com.github.hanyaeger.tutorial.entities.knight.Knight;
import com.github.hanyaeger.tutorial.entities.map.LevelOneMap;
import com.github.hanyaeger.tutorial.ui.healthbar.Healthbar;

public class LevelOneScene extends DynamicScene implements TileMapContainer {
    private Main main;

    public LevelOneScene(Main main)
    {
        this.main = main;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background-level1.jpg");
    }

    @Override
    public void setupEntities() {
        setupKnightEntity();
        setupUiEntities();
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new LevelOneMap());
    }

    private void setupKnightEntity() {
        var knight = new Knight(new Coordinate2D(10, 800));
        addEntity(knight);
    }

    private void setupUiEntities() {
        var healthbar = new Healthbar(new Coordinate2D(10, 10));
        addEntity(healthbar);
    }
}
