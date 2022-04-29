package com.github.hanyaeger.knightlyperil.ui.healthbar;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.UpdateExposer;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;
import com.github.hanyaeger.knightlyperil.entities.characters.knight.Knight;

/**
 * This class creates the healthbar. It binds the two backgrounds and the healthbar itself.
 * It also defines the width of the healthbar.
 */
public class Healthbar extends DynamicCompositeEntity implements UpdateExposer {
    private HealthbarBackgroundOne backgroundOne;
    private HealthbarRectangle healthbarRectangle;
    private HealthbarBackgroundTwo backgroundTwo;
    private Knight knight;
    private final int maxHealthbarWidth = 100;
    private final int maxHealthbarHeight = 7;

    /**
     * Create a new {@code DynamicCompositeEntity} with the given {@code initialLocation}.
     *
     * @param initialLocation the initial position at which this {@link DynamicCompositeEntity} should be placed.
     * @param knight the knight is given trough because of needing to keep track of total health of the knight.
     */
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
        switch (health){
            case 3:
                healthbarRectangle.setWidth(100);
                break;
            case 2:
                healthbarRectangle.setWidth(66);
                break;
            case 1:
                healthbarRectangle.setWidth(33);
                break;
            case 0:
                healthbarRectangle.setWidth(0);
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
