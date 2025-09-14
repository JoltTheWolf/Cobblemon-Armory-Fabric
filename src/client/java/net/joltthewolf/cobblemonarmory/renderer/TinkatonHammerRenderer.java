package net.joltthewolf.cobblemonarmory.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.joltthewolf.cobblemonarmory.item.custom.TinkatonHammerItem;
import net.joltthewolf.cobblemonarmory.model.TinkatonHammerModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

@Environment(EnvType.CLIENT)
public class TinkatonHammerRenderer extends GeoItemRenderer<TinkatonHammerItem> {
    public TinkatonHammerRenderer() { super(new TinkatonHammerModel()); }
}