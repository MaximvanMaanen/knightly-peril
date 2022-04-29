package com.github.hanyaeger.knightlyperil;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.knightlyperil.constants.SceneConstants;
import com.github.hanyaeger.knightlyperil.scenes.*;

public class Main extends YaegerGame {
    /**
     * Create a new {@code YaegerGame}.
     *
     * @param args program variable from the build configuration.
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Knightly Peril");
        setSize(new Size(1600, 900));
    }

    @Override
    public void setupScenes() {
        addScene(SceneConstants.MAIN_MENU, new MainMenuScene(this));
        addScene(SceneConstants.LEVEL_ONE, new LevelOneScene(this));
        addScene(SceneConstants.LEVEL_TWO, new LevelTwoScene(this));
        addScene(SceneConstants.END_SCREEN, new EndScene(this));
        addScene(SceneConstants.GAME_OVER, new GameOverScene(this));
    }
}
