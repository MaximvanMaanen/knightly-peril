package com.github.hanyaeger.knightlyperil.entities.characters.knight.helpers;

import com.github.hanyaeger.api.entities.Collider;
import com.github.hanyaeger.knightlyperil.constants.SceneConstants;
import com.github.hanyaeger.knightlyperil.entities.characters.BaseBody;
import com.github.hanyaeger.knightlyperil.entities.characters.enemy.IEnemy;
import com.github.hanyaeger.knightlyperil.entities.characters.knight.Knight;

import java.util.List;

/**
 * This class is used for handling the collision between knight and enemy.
 */
public class KnightEnemyCollisionHandler {
    public Knight knight;

    /**
     * Instantiate the knight.
     *
     * @param knight the knight which we need to use.
     */
    public KnightEnemyCollisionHandler(Knight knight) {
        this.knight = knight;
    }

    /**
     * Handles the collision for knight and enemy.
     *
     * @param collidingObjects a {@code List} of all instances of Collider this Collided has collided with, during the last Game World Update.
     */
    public void handleEnemyCollision(List<Collider> collidingObjects) {
        for (Collider collider : collidingObjects) {
            if(collider instanceof IEnemy enemy)
            {
                if(enemy instanceof BaseBody collisionBody) {
                    var bodyBoundingBox = this.knight.hitbox.getBoundingBox();
                    var traversableBoundingBox = collisionBody.getBoundingBox();

                    if((bodyBoundingBox.getMaxY() - traversableBoundingBox.getMinY()) <= 3 &&
                            (bodyBoundingBox.getMaxY() - traversableBoundingBox.getMinY()) > 0
                    ) {
                        handleKillingCollision(collisionBody);
                    }
                    else {
                        handleDamagingCollision();
                    }
                }

            }
        }
    }

    private void handleKillingCollision(BaseBody collisionBody) {
        collisionBody.character.remove();
    }

    private boolean isHitInvincibilityActive = false;
    private final long invincibilityInterval = 3000;
    private long currentTime = 0;
    private void handleDamagingCollision() {
        handleDamage();
        handleKnightDeath();
    }

    private void handleDamage()
    {
        if(isHitInvincibilityActive == false) {
            currentTime = System.currentTimeMillis();
            isHitInvincibilityActive = true;

            if (this.knight.health.totalHealth >= 1) {
                this.knight.health.totalHealth--;
            }
        }
        else if(currentTime <= (System.currentTimeMillis() - invincibilityInterval)) {
            isHitInvincibilityActive = false;
        }
    }

    private void handleKnightDeath()
    {
        if (this.knight.health.totalHealth <= 0) {
            this.knight.main.setActiveScene(SceneConstants.GAME_OVER);
            this.knight.remove();
        }
    }
}
