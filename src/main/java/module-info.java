module waterworld {
    requires hanyaeger;

    exports com.github.hanyaeger.tutorial;
    exports com.github.hanyaeger.tutorial.entities.map;
    exports com.github.hanyaeger.tutorial.entities.collectibles;

    opens audio;
    opens backgrounds;
    opens sprites.knight;
    opens sprites.floor;
    opens sprites.decorations;
    opens sprites.decorations.valuables;
    opens sprites.user_interface;
    exports com.github.hanyaeger.tutorial.entities.collectibles.ConfigurationModels;
}
