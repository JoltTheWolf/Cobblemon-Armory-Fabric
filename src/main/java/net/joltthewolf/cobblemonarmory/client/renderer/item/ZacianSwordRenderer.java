package net.joltthewolf.cobblemonarmory.client.renderer.item;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.ZacianSwordItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.DefaultedItemGeoModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;


public class ZacianSwordRenderer extends GeoItemRenderer<ZacianSwordItem> {
    public ZacianSwordRenderer() {
        super(new DefaultedItemGeoModel<>(ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "zacian_sword")));
    }
}