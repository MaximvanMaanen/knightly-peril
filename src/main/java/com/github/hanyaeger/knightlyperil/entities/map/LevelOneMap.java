package com.github.hanyaeger.knightlyperil.entities.map;

import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.knightlyperil.entities.collectibles.ConfigurationModels.MoneyBagConfigurationModel;
import com.github.hanyaeger.knightlyperil.entities.collectibles.HealthPotion;
import com.github.hanyaeger.knightlyperil.entities.collectibles.MoneyBag;

public class LevelOneMap extends TileMap {

    @Override
    public void setupEntities() {
        addEntity(1, Floor.class, "sprites/floor/floor_tile_2.png");
        addEntity(2, Platform.class, "sprites/decorations/platform_1.png");
        addEntity(3, Floor.class, "sprites/decorations/spikes.png");
        addEntity(4, Floor.class, "sprites/floor/floor_tile_1.png");
        addEntity(5, Floor.class, "sprites/floor/floor_tile_4.png");
        addEntity(7, Platform.class, "sprites/decorations/platform_4.png");
        addEntity(8, HealthPotion.class, "sprites/decorations/potion.png");
        addEntity(9, Floor.class, "sprites/floor/blank.png");
        addEntity(10, Floor.class, "sprites/floor/stairs_tile_1.png");
        addEntity(11, Floor.class, "sprites/floor/stairs_tile_2.png");
        addEntity(12, Floor.class, "sprites/floor/stairs_tile_3.png");
        addEntity(13, Floor.class, "sprites/floor/stairs_tile_4.png");
        addEntity(200, MoneyBag.class, new MoneyBagConfigurationModel("sprites/decorations/valuables/bag_1.png", 10));
        addEntity(201, MoneyBag.class, new MoneyBagConfigurationModel("sprites/decorations/valuables/bag_2.png", 20));
    }

    @Override
    public int[][] defineMap() {
        return new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 200, 201, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 200, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 10, 0, 0, 0, 0, 0},
                {0, 0, 0, 2, 7, 0, 0, 0, 0, 0, 12, 13, 0, 0, 11, 10, 0, 0, 0, 0},
                {1, 1, 5, 0, 0, 4, 1, 1, 1, 1, 13, 9, 3, 3, 9, 11, 1, 1, 1, 1},
                {9, 9, 9, 3, 3, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9},
        };
    }
}
