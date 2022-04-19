package com.github.hanyaeger.tutorial.ui.healthbar;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.tutorial.entities.knight.KnightHitbox;
import com.github.hanyaeger.tutorial.entities.knight.KnightSprite;

public class Healthbar extends DynamicCompositeEntity {
    public Healthbar(Coordinate2D initialLocation){
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {
        var backgroundOne = new HealthbarBackgroundOne(
                new Coordinate2D(10,10));
        addEntity(backgroundOne);

//        var hitbox = new KnightHitbox(new Coordinate2D(75, 70), this);
//        addEntity(hitbox);
    }

//    public void setHealthImage(int health){
//        setText("Health: " + health);
//    }
}
