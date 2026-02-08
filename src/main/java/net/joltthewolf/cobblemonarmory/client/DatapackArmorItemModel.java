/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.client;

import net.joltthewolf.cobblemonarmory.item.DatapackArmorItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.model.GeoModel;

public class DatapackArmorItemModel extends GeoModel<DatapackArmorItem> {

    private ItemStack currentStack = ItemStack.EMPTY;

    public void setCurrentStack(ItemStack stack) {
        this.currentStack = stack == null ? ItemStack.EMPTY : stack;
    }

    private ResourceLocation iconTexture(DatapackArmorItem animatable) {
        if (currentStack.isEmpty())
            return ResourceLocation.fromNamespaceAndPath("cobblemonarmory", "textures/item/missing.png");

        ResourceLocation setId = DatapackArmorItem.getSetId(currentStack);
        if (setId == null)
            return ResourceLocation.fromNamespaceAndPath("cobblemonarmory", "textures/item/missing.png");

        String piece = DatapackArmorItem.pieceSuffixFor(animatable.getType());

        return ResourceLocation.fromNamespaceAndPath(
                setId.getNamespace(),
                "textures/item/" + setId.getPath() + "_" + piece + ".png"
        );
    }

    @Override
    public ResourceLocation getModelResource(DatapackArmorItem animatable) {
        return ResourceLocation.fromNamespaceAndPath("cobblemonarmory", "geo/item/flat_icon.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DatapackArmorItem animatable) {
        return iconTexture(animatable);
    }

    @Override
    public ResourceLocation getAnimationResource(DatapackArmorItem animatable) {
        return null;
    }
}
