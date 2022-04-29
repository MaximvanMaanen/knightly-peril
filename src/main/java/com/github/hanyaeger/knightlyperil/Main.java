package com.github.hanyaeger.knightlyperil;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import com.github.hanyaeger.knightlyperil.constants.SceneConstants;
import com.github.hanyaeger.knightlyperil.entities.characters.knight.Knight;
import com.github.hanyaeger.knightlyperil.scenes.*;
import com.github.hanyaeger.knightlyperil.ui.healthbar.Healthbar;
import com.github.hanyaeger.knightlyperil.ui.scoredisplay.ScoreDisplay;

public class Main extends YaegerGame {
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
        var sceneConfigurationModel = setupSceneConfiguration();

        addScene(SceneConstants.MAIN_MENU, new MainMenuScene(this));
        addScene(SceneConstants.LEVEL_ONE, new LevelOneScene(sceneConfigurationModel));
        addScene(SceneConstants.LEVEL_TWO, new LevelTwoScene(sceneConfigurationModel));
        addScene(SceneConstants.END_SCREEN, new EndScene(this, sceneConfigurationModel));
        addScene(SceneConstants.GAME_OVER, new GameOverScene(this, sceneConfigurationModel));
    }

    private SceneConfigurationModel setupSceneConfiguration() {
        var knight = new Knight(new Coordinate2D(0, 900 / 17 * 15 - 130), this);

        return new SceneConfigurationModel(
                knight,
                new Healthbar(new Coordinate2D(10, 10), knight),
                new ScoreDisplay(new Coordinate2D((1500), 10), knight)
        );
    }
}
