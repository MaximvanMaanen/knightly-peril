package com.github.hanyaeger.knightlyperil.entities.collectibles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.knightlyperil.entities.collectibles.ConfigurationModels.MoneyBagConfigurationModel;
import com.github.hanyaeger.knightlyperil.entities.characters.knight.KnightHitbox;

import java.util.List;

/**
 * This class is a moneybag used for the knight to pick up. The moneybag will give a certain amount of score.
 * This class binds the moneybag sprite and score worth with each other.
 */
public class MoneyBag extends BaseCollectible {
    private int scoreWorth;

    /**
     * Create a new {@code BaseCollectible} with the given {@code size} and {@code configurationModel} on the given {@code location}.
     *
     * @param location the location at which this {@link BaseCollectible} should be placed.
     * @param size the size of the resource the {@link BaseCollectible} will be using.
     * @param configurationModel the configurationModel the {@link BaseCollectible} is using.
     */
    public MoneyBag(final Coordinate2D location, final Size size, MoneyBagConfigurationModel configurationModel) {
        super(location, size, configurationModel.moneyBagSprite);

        this.scoreWorth = configurationModel.scoreWorth;
    }

    @Override
    public void onCollision(List<Collider> collidingObjects) {
        for (Collider collider: collidingObjects) {
            if(collider instanceof KnightHitbox knightHitbox)
            {
                knightHitbox.knight.score.totalScore += this.scoreWorth;
                super.onCollision(collidingObjects);
            }
        }
    }
}
