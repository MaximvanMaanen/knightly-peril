package com.github.hanyaeger.tutorial.entities.collectibles.ConfigurationModels;

public class MoneyBagConfigurationModel {
    public final String moneyBagSprite;
    public int scoreWorth;

    public MoneyBagConfigurationModel(String moneyBagSprite, int scoreWorth){
        this.moneyBagSprite = moneyBagSprite;
        this.scoreWorth = scoreWorth;
    }
}