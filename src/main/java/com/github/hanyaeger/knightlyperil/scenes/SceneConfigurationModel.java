package com.github.hanyaeger.knightlyperil.scenes;

import com.github.hanyaeger.knightlyperil.entities.characters.knight.Knight;
import com.github.hanyaeger.knightlyperil.ui.healthbar.Healthbar;
import com.github.hanyaeger.knightlyperil.ui.healthbar.ScoreDisplay;

/**
 * A configuration model containing the knight, healthbar and score display.
 * These three entities are vital for the game and must retain their pointers until the game is reset.
 */
public class SceneConfigurationModel {
    public Knight knight;
    public Healthbar healthbar;
    public ScoreDisplay scoreDisplay;

    public SceneConfigurationModel(Knight knight, Healthbar healthbar, ScoreDisplay scoreDisplay) {
        this.knight = knight;
        this.healthbar = healthbar;
        this.scoreDisplay = scoreDisplay;
    }
}
