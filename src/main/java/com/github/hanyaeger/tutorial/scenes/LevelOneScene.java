package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.tutorial.Main;
import com.github.hanyaeger.tutorial.entities.knight.Knight;

public class LevelOneScene extends DynamicScene {
    private Main main;

    public LevelOneScene(Main main)
    {
        this.main = main;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/background2.jpg");
    }

    @Override
    public void setupEntities() {
        var knight = new Knight(new Coordinate2D(200, 200));
        addEntity(knight);
    }
}
