package net.joltthewolf.cobblemonarmory.client.renderer;

import net.joltthewolf.cobblemonarmory.client.model.RayquazaArmorModel;
import net.joltthewolf.cobblemonarmory.item.custom.RayquazaArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RayquazaArmorRenderer extends GeoArmorRenderer<RayquazaArmorItem> {
    public RayquazaArmorRenderer() {
        super(new RayquazaArmorModel());

    }
}
