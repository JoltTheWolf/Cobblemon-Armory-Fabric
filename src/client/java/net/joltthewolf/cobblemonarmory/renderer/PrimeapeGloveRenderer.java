package net.joltthewolf.cobblemonarmory.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.joltthewolf.cobblemonarmory.item.custom.PrimeapeGloveItem;
import net.joltthewolf.cobblemonarmory.model.PrimeapeGloveModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

@Environment(EnvType.CLIENT)
public class PrimeapeGloveRenderer extends GeoItemRenderer<PrimeapeGloveItem> {
    public PrimeapeGloveRenderer() { super(new PrimeapeGloveModel()); }
}