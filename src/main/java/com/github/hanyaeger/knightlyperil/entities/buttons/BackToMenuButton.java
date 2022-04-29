package com.github.hanyaeger.knightlyperil.entities.buttons;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.impl.TextEntity;
import com.github.hanyaeger.api.userinput.MouseButtonPressedListener;
import com.github.hanyaeger.api.userinput.MouseEnterListener;
import com.github.hanyaeger.api.userinput.MouseExitListener;
import com.github.hanyaeger.knightlyperil.Main;
import com.github.hanyaeger.knightlyperil.constants.SceneConstants;
import javafx.scene.Cursor;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * This is a text entity used for going back to the main menu.
 */
public class BackToMenuButton extends TextEntity implements MouseButtonPressedListener, MouseEnterListener, MouseExitListener {
    private Main main;

    /**
     * Create a new {@code TextEntity} with given location and Main class.
     *
     * @param initialLocation the initial position at which this {@link TextEntity} should be placed.
     * @param main the main class is passed through because of needing to set the active scene.
     */
    public BackToMenuButton(Coordinate2D initialLocation, Main main) {
        super(initialLocation, "Back to main menu!");
        setFill(Color.WHITE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 20));
        this.main = main;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        main.setupScenes();
        main.setActiveScene(SceneConstants.MAIN_MENU);
    }

    @Override
    public void onMouseEntered() {
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setCursor(Cursor.DEFAULT);
    }
}
