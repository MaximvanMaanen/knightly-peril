package com.github.hanyaeger.knightlyperil.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.knightlyperil.Main;
import com.github.hanyaeger.knightlyperil.entities.knight.Knight;
import com.github.hanyaeger.knightlyperil.entities.map.LevelOneMap;
import com.github.hanyaeger.knightlyperil.ui.healthbar.Healthbar;

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
        var knight = setupKnightEntity();
        setupUiEntities(knight);
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new LevelOneMap());
    }

    private Knight setupKnightEntity() {
        var knight = new Knight(new Coordinate2D(0, 748));
        addEntity(knight);
        return knight;
    }

    private void setupUiEntities(Knight knight) {
        var healthbar = new Healthbar(new Coordinate2D(10, 10), knight);
        addEntity(healthbar);
    }
}
