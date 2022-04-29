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

public class StartButton extends TextEntity implements
        MouseButtonPressedListener,
        MouseEnterListener,
        MouseExitListener {
    private Main main;

    public StartButton(Coordinate2D initialLocation, Main main){
        super(initialLocation,"Adventure Awaits!");
        setFill(Color.WHITE);
        setFont(Font.font("Roboto", FontWeight.BOLD, 30));
        this.main = main;
    }

    @Override
    public void onMouseButtonPressed(MouseButton mouseButton, Coordinate2D coordinate2D) {
        main.setActiveScene(SceneConstants.LEVEL_ONE);
    }

    @Override
    public void onMouseEntered() {
        setFill(Color.LIGHTGRAY);
        setCursor(Cursor.HAND);
    }

    @Override
    public void onMouseExited() {
        setFill(Color.WHITE);
        setCursor(Cursor.DEFAULT);
    }
}
