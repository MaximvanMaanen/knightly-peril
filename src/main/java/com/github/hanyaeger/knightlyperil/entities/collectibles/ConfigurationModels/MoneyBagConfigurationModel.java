package com.github.hanyaeger.knightlyperil.entities.collectibles.ConfigurationModels;

/**
 * This class is used for setting the sprite and score for the moneybag class.
 */
public class MoneyBagConfigurationModel {
    public final String moneyBagSprite;
    public int scoreWorth;

    /**
     * Create a new class to configure the moneybag with the given {@code moneyBagSprite} and {@code scoreWorth}.
     *
     * @param moneyBagSprite the sprite that will be used for the moneybag class.
     * @param scoreWorth the worth of the score when picking up a moneybag.
     */
    public MoneyBagConfigurationModel(String moneyBagSprite, int scoreWorth){
        this.moneyBagSprite = moneyBagSprite;
        this.scoreWorth = scoreWorth;
    }
}
