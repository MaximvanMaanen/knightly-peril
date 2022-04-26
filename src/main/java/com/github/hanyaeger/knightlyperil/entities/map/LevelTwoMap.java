package com.github.hanyaeger.knightlyperil.entities.map;

import com.github.hanyaeger.api.scenes.TileMap;
import com.github.hanyaeger.knightlyperil.entities.collectibles.ConfigurationModels.MoneyBagConfigurationModel;
import com.github.hanyaeger.knightlyperil.entities.collectibles.HealthPotion;
import com.github.hanyaeger.knightlyperil.entities.collectibles.MoneyBag;
import com.github.hanyaeger.knightlyperil.entities.map.structures.Decorations;
import com.github.hanyaeger.knightlyperil.entities.map.structures.Floor;
import com.github.hanyaeger.knightlyperil.entities.map.structures.Platform;
import com.github.hanyaeger.knightlyperil.entities.map.structures.Stairs;

public class LevelTwoMap extends TileMap {

    @Override
    public void setupEntities() {
        addEntity(1, Floor.class, "sprites/floor/blank.png");
        addEntity(2, Floor.class, "sprites/floor/floor_tile_carpet_2.png");
        addEntity(3, Floor.class, "sprites/ceiling/ceiling_2.png");

        addEntity(6, Stairs.class, "sprites/floor/stairs_tile_carpet_1.png");
        addEntity(7, Stairs.class, "sprites/floor/stairs_tile_carpet_2.png");
        addEntity(8, Stairs.class, "sprites/floor/stairs_tile_carpet_3.png");
        addEntity(9, Stairs.class, "sprites/floor/stairs_tile_carpet_4.png");

        addEntity(10, Decorations.class, "sprites/decorations/window_glass_tall_1.png");
        addEntity(11, Decorations.class, "sprites/decorations/window_glass_tall_2.png");
        addEntity(12, Decorations.class, "sprites/decorations/window_glass_tall_3.png");

        addEntity(15, Decorations.class, "sprites/decorations/bookshelf_part_1.png");
        addEntity(16, Decorations.class, "sprites/decorations/bookshelf_part_2.png");
        addEntity(17, Decorations.class, "sprites/decorations/bookshelf_part_3.png");
        addEntity(18, Decorations.class, "sprites/decorations/bookshelf_part_4.png");

        addEntity(20, Decorations.class, "sprites/decorations/door_part_1.png");
        addEntity(21, Decorations.class, "sprites/decorations/door_part_2.png");

        addEntity(100, HealthPotion.class, "sprites/decorations/potion.png");
        addEntity(200, MoneyBag.class, new MoneyBagConfigurationModel("sprites/decorations/valuables/bag_1.png", 10));
        addEntity(201, MoneyBag.class, new MoneyBagConfigurationModel("sprites/decorations/valuables/bag_2.png", 20));
    }

    @Override
    public int[][] defineMap() {
        return new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {3, 3, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 21},
                {0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 201, 0, 20},
                {0, 0, 0, 0, 0, 12, 0, 0, 0, 0, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 15, 16, 0, 0, 0, 0, 8, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 17, 18, 0, 200, 0, 8, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2, 2, 2, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };
    }
}

