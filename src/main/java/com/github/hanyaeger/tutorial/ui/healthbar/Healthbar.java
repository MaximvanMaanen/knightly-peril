package com.github.hanyaeger.tutorial.ui.healthbar;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.tutorial.entities.knight.Knight;

public class Healthbar extends DynamicCompositeEntity implements UpdateExposer {
    private HealthbarBackgroundOne backgroundOne;
    private HealthbarRectangle healthbarRectangle;
    private HealthbarBackgroundTwo backgroundTwo;
    private Knight knight;

    private final int maxHealthbarWidth = 100;
    private final int maxHealthbarHeight = 7;

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

    public void setHealthBarWidth(int health) {
        if (health == 3) {
            healthbarRectangle.setWidth(100);
        } else if (health == 2) {
            healthbarRectangle.setWidth(66);
        } else {
            healthbarRectangle.setWidth(33);
        }
    }

    private HealthbarBackgroundOne createHealthbarBackgroundOne ()
    {
        this.backgroundOne = new HealthbarBackgroundOne(
                new Coordinate2D(19,13));

        return this.backgroundOne;
    }

    private HealthbarRectangle createHealthBar ()
    {
        this.healthbarRectangle = new HealthbarRectangle(
            new Coordinate2D(18,13),
            new Size(maxHealthbarWidth, maxHealthbarHeight)
            );

        return this.healthbarRectangle;
    }

    private HealthbarBackgroundTwo createHealthbarBackgroundTwo ()
    {
        this.backgroundTwo = new HealthbarBackgroundTwo(
                new Coordinate2D(10,10));

        return this.backgroundTwo;
    }

    @Override
    public void explicitUpdate(long l) {
        setHealthBarWidth(knight.health.totalHealth);
    }
}
