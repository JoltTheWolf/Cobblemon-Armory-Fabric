package net.joltthewolf.cobblemonarmory.client.model;

import net.joltthewolf.cobblemonarmory.item.custom.TinkatonHammerItem;
import software.bernie.geckolib.model.DefaultedItemGeoModel;

public class TinkatonHammerModel extends DefaultedItemGeoModel<TinkatonHammerItem> {
    public TinkatonHammerModel() {
        super(net.minecraft.util.Identifier.of("cobblemonarmory", "tinkaton_hammer"));
        // Resolves to:
        // geo/starmie_sword.geo.json
        // animations/starmie_sword.animation.json
        // textures/item/starmie_sword.png
    }
}