package com.github.hanyaeger.tutorial.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.scenes.StaticScene;
import com.github.hanyaeger.tutorial.Main;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MainMenuScene extends StaticScene {
    private Main main;

    public MainMenuScene(Main main)
    {
        this.main = main;
    }

    @Override
    public void setupScene() {
        setBackgroundAudio("audio/theme.mp4");
        setBackgroundAudioVolume(0.3);
        setBackgroundImage("backgrounds/background1.jpg");
    }

    @Override
    public void setupEntities() {
        var mainMenuText = new TextEntity(new Coordinate2D(getWidth() * 0.5, getHeight() - (getHeight() * 0.8)), "Knightly Peril");
        mainMenuText.setAnchorPoint(AnchorPoint.BOTTOM_CENTER);
        mainMenuText.setFill(Color.RED);
        mainMenuText.setFont(Font.font("Roboto", FontWeight.SEMI_BOLD, 80));
        addEntity(mainMenuText);
    }
}
