package com.github.hanyaeger.knightlyperil.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.mushroom.Mushroom;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.skeleton.Skeleton;
import com.github.hanyaeger.knightlyperil.entities.map.LevelTwoMap;

/**
 * This class creates the scene for level two.
 */
public class LevelTwoScene extends DynamicScene implements TileMapContainer {
    private final SceneConfigurationModel model;

    public LevelTwoScene(SceneConfigurationModel model)
    {
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
        setupEnemyEntities();
    }

    private void setupEnemyEntities() {
        addEntity(new Skeleton(new Coordinate2D(500, 725)));
        addEntity(new Mushroom(new Coordinate2D(1000, 450)));
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new LevelTwoMap());
    }
}
