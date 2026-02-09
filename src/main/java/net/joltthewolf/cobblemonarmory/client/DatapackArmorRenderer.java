/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */


package net.joltthewolf.cobblemonarmory.client;

import net.joltthewolf.cobblemonarmory.item.DatapackArmorItem;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DatapackArmorRenderer extends GeoArmorRenderer<DatapackArmorItem> {

    private final DatapackArmorModel model;

    public DatapackArmorRenderer() {
        super(new DatapackArmorModel());
        this.model = (DatapackArmorModel) this.getGeoModel();
    }

    public void setCurrentStack(ItemStack stack) {
        model.setCurrentStack(stack);
    }
}
