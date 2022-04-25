package com.github.hanyaeger.knightlyperil.entities.map;

import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.knightlyperil.entities.collectibles.ConfigurationModels.MoneyBagConfigurationModel;
import com.github.hanyaeger.knightlyperil.entities.collectibles.HealthPotion;
import com.github.hanyaeger.knightlyperil.entities.collectibles.MoneyBag;
import com.github.hanyaeger.knightlyperil.entities.map.structures.Floor;
import com.github.hanyaeger.knightlyperil.entities.map.structures.Platform;
import com.github.hanyaeger.knightlyperil.entities.map.structures.Stairs;

public class LevelOneMap extends TileMap {

    @Override
    public void setupEntities() {
        addEntity(1, Floor.class, "sprites/floor/blank.png");
        addEntity(2, Floor.class, "sprites/floor/floor_tile_2.png");
        addEntity(3, Floor.class, "sprites/floor/floor_tile_1.png");
        addEntity(4, Floor.class, "sprites/floor/floor_tile_4.png");
        addEntity(5, Floor.class, "sprites/decorations/spikes.png");

        addEntity(6, Stairs.class, "sprites/floor/stairs_tile_1.png");
        addEntity(7, Stairs.class, "sprites/floor/stairs_tile_2.png");
        addEntity(8, Stairs.class, "sprites/floor/stairs_tile_3.png");
        addEntity(9, Stairs.class, "sprites/floor/stairs_tile_4.png");

        addEntity(10, Platform.class, "sprites/decorations/platform_1.png");
        addEntity(11, Platform.class, "sprites/decorations/platform_4.png");

        addEntity(100, HealthPotion.class, "sprites/decorations/potion.png");
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
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 200, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0 , 0 , 0, 0, 0, 0, 0, 0, 8, 10, 11, 6, 0, 0, 0, 0, 0},
                {0, 0, 0, 10, 11, 0, 0, 0, 0, 201, 8, 9, 0, 0, 7, 6, 0, 0, 200, 0},
                {2, 2, 4, 0 , 0 , 3, 2, 2, 2, 2, 9, 1, 5, 5, 1, 7, 2, 2, 2, 2},
                {1, 1, 1, 5, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };
    }
}
