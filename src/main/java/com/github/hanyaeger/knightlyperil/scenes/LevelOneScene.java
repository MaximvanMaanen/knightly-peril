package com.github.hanyaeger.knightlyperil.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.mushroom.Mushroom;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.skeleton.Skeleton;
import com.github.hanyaeger.knightlyperil.entities.map.LevelOneMap;

public class LevelOneScene extends DynamicScene implements TileMapContainer {
    private final SceneConfigurationModel model;

    public LevelOneScene(SceneConfigurationModel model)
    {
        this.model = model;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background-level1.jpg");
    }

    @Override
    public void setupEntities() {
        addEntity(this.model.knight);
        addEntity(this.model.healthbar);
        addEntity(this.model.scoreDisplay);
        setupEnemyEntity();
    }

    @Override
    public void setupTileMaps() {
        addTileMap(new LevelOneMap());
    }

    private void setupEnemyEntity() {
        addEntity(new Skeleton(new Coordinate2D(500, 725)));
        addEntity(new Mushroom(new Coordinate2D(550, 660)));
    }
}
