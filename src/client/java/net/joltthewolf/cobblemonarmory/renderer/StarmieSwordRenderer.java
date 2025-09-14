package net.joltthewolf.cobblemonarmory.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.joltthewolf.cobblemonarmory.item.custom.StarmieSwordItem;
import net.joltthewolf.cobblemonarmory.model.StarmieSwordModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

@Environment(EnvType.CLIENT)
public class StarmieSwordRenderer extends GeoItemRenderer<StarmieSwordItem> {
    public StarmieSwordRenderer() { super(new StarmieSwordModel()); }
}