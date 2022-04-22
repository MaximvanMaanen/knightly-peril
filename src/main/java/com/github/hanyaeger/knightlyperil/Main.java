package com.github.hanyaeger.knightlyperil;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.knightlyperil.constants.SceneConstants;
import com.github.hanyaeger.knightlyperil.scenes.LevelOneScene;
import com.github.hanyaeger.knightlyperil.scenes.MainMenuScene;

public class Main extends YaegerGame {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Knightly Peril");
        setSize(new Size(1800, 1000));
    }

    @Override
    public void setupScenes() {
        addScene(SceneConstants.MAIN_MENU, new MainMenuScene(this));
        addScene(SceneConstants.LEVEL_ONE, new LevelOneScene(this));
    }
}
