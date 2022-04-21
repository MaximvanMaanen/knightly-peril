package com.github.hanyaeger.tutorial.ui.healthbar;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.tutorial.entities.health.Health;

public class Healthbar extends DynamicCompositeEntity {
    public Health health;
    private HealthbarBackgroundOne backgroundOne;
    private HealthbarSprite healthbarSprite;
    private HealthbarBackgroundTwo backgroundTwo;
    int healthbarWidth = 100;
    int healthbarHeight = 7;

    public Healthbar(Coordinate2D initialLocation){
        super(initialLocation);
        this.health = new Health();
        setHealthBarWidth(this.health.health);
    }

    @Override
    protected void setupEntities() {
        addEntity(createHealthbarBackgroundOne());
        addEntity(createHealthBar());
        addEntity(createHealthbarBackgroundTwo());
    }

    public void setHealthBarWidth(int health) {
        if (health == 3) {
            healthbarWidth = 100;
        } else if (health == 2) {
            healthbarWidth = 66;
        } else {
            healthbarWidth = 33;
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
            new Size(healthbarWidth, healthbarHeight)
            );

        return this.healthbarSprite;
    }

    private HealthbarBackgroundTwo createHealthbarBackgroundTwo ()
    {
        this.backgroundTwo = new HealthbarBackgroundTwo(
                new Coordinate2D(10,10));

        return this.backgroundTwo;
    }
}
