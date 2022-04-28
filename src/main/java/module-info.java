module waterworld {
    requires hanyaeger;

    exports com.github.hanyaeger.knightlyperil;
    exports com.github.hanyaeger.knightlyperil.entities.map;
    exports com.github.hanyaeger.knightlyperil.entities.collectibles;

    opens audio;
    opens backgrounds;
    opens sprites.knight;
    opens sprites.skeleton;
    opens sprites.floor;
    opens sprites.decorations;
    opens sprites.decorations.valuables;
    opens sprites.user_interface;
    opens sprites.ceiling;
    opens sprites.king;
    exports com.github.hanyaeger.knightlyperil.entities.collectibles.ConfigurationModels;
    exports com.github.hanyaeger.knightlyperil.entities.map.structures;
}
