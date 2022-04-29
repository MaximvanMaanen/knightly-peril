package com.github.hanyaeger.knightlyperil.entities.health;

public class Health {
    public int totalHealth;
//    public = access modifier
//    static = aan begin van de app maak ik gelijk een instatie aan van 'this' en je kan er maar 1 hebben
//    final = waarde gaat niet aanpassen. dit is de waarde en niks anders
//    int = datatype (oftewel een nummer)
    public static final int maxTotalHealth = 3;

    /**
     * Create a new class to set and keep track of the total health.
     */
    public Health() {
        totalHealth = maxTotalHealth;
    }
}
