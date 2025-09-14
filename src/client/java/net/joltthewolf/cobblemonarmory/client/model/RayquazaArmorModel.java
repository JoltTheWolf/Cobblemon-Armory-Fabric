package net.joltthewolf.cobblemonarmory.client.model;

import net.joltthewolf.cobblemonarmory.item.custom.RayquazaArmorItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class RayquazaArmorModel extends GeoModel<RayquazaArmorItem> {
    @Override
    public Identifier getModelResource(RayquazaArmorItem animatable) {
        return Identifier.of("cobblemonarmory", "geo/rayquaza_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(RayquazaArmorItem animatable) {
        return Identifier.of("cobblemonarmory", "textures/models/armor/rayquaza_armor.png");
    }

    @Override
    public Identifier getAnimationResource(RayquazaArmorItem animatable) {
        return Identifier.of("cobblemonarmory", "animations/rayquaza_armor.animation.json");
    }
}
