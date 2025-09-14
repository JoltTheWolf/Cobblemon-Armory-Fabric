package net.joltthewolf.cobblemonarmory.client.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.joltthewolf.cobblemonarmory.item.custom.SirfetchdSwordItem;
import net.joltthewolf.cobblemonarmory.client.model.SirfetchdSwordModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

@Environment(EnvType.CLIENT)
public class SirfetchdSwordRenderer extends GeoItemRenderer<SirfetchdSwordItem> {
    public SirfetchdSwordRenderer() { super(new SirfetchdSwordModel()); }
}