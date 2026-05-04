package net.joltthewolf.cobblemonarmory.client.renderer.item;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.MetagrossHammerItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;


public class MetagrossHammerRenderer extends GeoItemRenderer<MetagrossHammerItem> {
    public MetagrossHammerRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "metagross_hammer")));
    }
}