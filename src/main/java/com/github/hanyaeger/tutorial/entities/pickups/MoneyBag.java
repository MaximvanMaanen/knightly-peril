package com.github.hanyaeger.tutorial.entities.pickups;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.Collided;
import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.tutorial.entities.knight.KnightHitbox;
import com.github.hanyaeger.tutorial.entities.pickups.ConfigurationModels.MoneyBagConfigurationModel;

public class MoneyBag extends BaseCollectible {
    private int scoreWorth;

    public MoneyBag(final Coordinate2D location, final Size size, MoneyBagConfigurationModel configurationModel) {
        super(location, size, configurationModel.moneyBagSprite);

        this.scoreWorth = configurationModel.scoreWorth;
    }

    @Override
    public void onCollision(Collider collider) {
        if(collider instanceof KnightHitbox knightHitbox)
        {
            knightHitbox.knight.score.totalScore += this.scoreWorth;
            super.onCollision(collider);
        }
    }
}
