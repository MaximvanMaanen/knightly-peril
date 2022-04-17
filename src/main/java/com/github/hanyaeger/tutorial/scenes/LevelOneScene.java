package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.tutorial.Main;
import com.github.hanyaeger.tutorial.entities.knight.Knight;
import com.github.hanyaeger.tutorial.entities.map.CoralTileMap;
import com.github.hanyaeger.tutorial.entities.map.LevelOneMap;

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
        var knight = new Knight(new Coordinate2D(50, 737.5));
        addEntity(knight);
    }

    private void setupUiEntities() {
//        hier komt een healthbar
    }
}
