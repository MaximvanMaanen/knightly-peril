package com.github.hanyaeger.tutorial.ui.healthbar;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.tutorial.entities.knight.Knight;

public class Healthbar extends DynamicCompositeEntity implements UpdateExposer {
    private HealthbarBackgroundOne backgroundOne;
    private HealthbarSprite healthbarSprite;
    private HealthbarBackgroundTwo backgroundTwo;
    private Knight knight;

    private final int totalHealthBarWidth = 100;
    private int healthBarWidth = 100;
    private int healthBarHeight = 7;


    public Healthbar(Coordinate2D initialLocation, Knight knight){
        super(initialLocation);
        this.knight = knight;
    }

    @Override
    protected void setupEntities() {
        addEntity(createHealthbarBackgroundOne());
        addEntity(createHealthBar());
        addEntity(createHealthbarBackgroundTwo());
    }

    private void setHealthBarWidth(int health) {
        switch(health)
        {
            case 1:
                // Set the Healthbar Sprite.
                break;
            case 2:
                // Set the Healthbar Sprite.
                break;
            case 3:
                // Set the Healthbar Sprite.
                break;
        }
    }

    private HealthbarBackgroundOne createHealthbarBackgroundOne ()
    {
        this.backgroundOne = new HealthbarBackgroundOne(
                new Coordinate2D(19,13));

        return this.backgroundOne;
    }

    private HealthbarSprite createHealthBar ()
    {
        this.healthbarSprite = new HealthbarSprite(
            new Coordinate2D(18,13),
            new Size(healthBarWidth, healthBarHeight)
            );

        return this.healthbarSprite;
    }

    private HealthbarBackgroundTwo createHealthbarBackgroundTwo ()
    {
        this.backgroundTwo = new HealthbarBackgroundTwo(
                new Coordinate2D(10,10));

        return this.backgroundTwo;
    }

    @Override
    public void explicitUpdate(long l) {
        if(knight == null) return;
        setHealthBarWidth(knight.health.totalHealth);
    }
}
