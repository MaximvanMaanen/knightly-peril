package com.github.hanyaeger.knightlyperil.entities.collectibles;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.knightlyperil.entities.collectibles.ConfigurationModels.MoneyBagConfigurationModel;
import com.github.hanyaeger.knightlyperil.entities.characters.knight.KnightHitbox;

import java.util.List;

public class MoneyBag extends BaseCollectible {
    private int scoreWorth;

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
