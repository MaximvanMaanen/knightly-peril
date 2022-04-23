package com.github.hanyaeger.knightlyperil.entities.characters;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.entities.DynamicCompositeEntity;

public abstract class BaseCompositeCharacter extends DynamicCompositeEntity {
    protected BaseCompositeCharacter(Coordinate2D initialLocation) {
        super(initialLocation);
    }

    @Override
    protected void setupEntities() {}
}
