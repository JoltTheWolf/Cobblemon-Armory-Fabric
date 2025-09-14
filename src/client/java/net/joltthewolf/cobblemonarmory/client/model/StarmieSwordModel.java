package net.joltthewolf.cobblemonarmory.client.model;

import net.joltthewolf.cobblemonarmory.item.custom.StarmieSwordItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class StarmieSwordModel extends DefaultedItemGeoModel<StarmieSwordItem> {
    public StarmieSwordModel() {
        super(net.minecraft.util.Identifier.of("cobblemonarmory", "starmie_sword"));
        // Resolves to:
        // geo/starmie_sword.geo.json
        // animations/starmie_sword.animation.json
        // textures/item/starmie_sword.png
    }
}