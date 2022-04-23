package com.github.hanyaeger.knightlyperil.entities.map.structures;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;

public class Floor extends BaseStaticStructure {
    public Floor(final Coordinate2D location, final Size size, final String resource) {
        super(location, size, resource);
    }
}

