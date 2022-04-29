package com.github.hanyaeger.knightlyperil.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.knightlyperil.Main;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.mushroom.Mushroom;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.skeleton.Skeleton;
import com.github.hanyaeger.knightlyperil.entities.characters.knight.Knight;
import com.github.hanyaeger.knightlyperil.entities.map.LevelOneMap;
import com.github.hanyaeger.knightlyperil.ui.healthbar.Healthbar;

public class LevelOneScene extends DynamicScene implements TileMapContainer {
    private Main main;

    /**
     * Create a new {@code DynamicScene}.
     *
     * @param main the main class is given trough because of needing to set the active scene in the {@code Knight}.
     */
    public LevelOneScene(Main main) {
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
        setupEnemyEntity();
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new LevelOneMap());
    }

    private Knight setupKnightEntity() {
        var knight = new Knight(new Coordinate2D(0, 680), main);
        addEntity(knight);
        return knight;
    }

    private void setupUiEntities(Knight knight) {
        var healthbar = new Healthbar(new Coordinate2D(10, 10), knight);
        addEntity(healthbar);
    }

    private void setupEnemyEntity() {
        addEntity(new Skeleton(new Coordinate2D(500, 725)));
        addEntity(new Mushroom(new Coordinate2D(550, 660)));
    }
}
