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

public class DatapackArmorModel extends GeoModel<DatapackArmorItem> {

    private ItemStack currentStack = ItemStack.EMPTY;

    public void setCurrentStack(ItemStack stack) {
        this.currentStack = (stack == null) ? ItemStack.EMPTY : stack;
    }

    private ResourceLocation getSetIdOrMissing() {
        if (currentStack == null || currentStack.isEmpty()) {
            return ResourceLocation.fromNamespaceAndPath("cobblemonarmory", "missing_set");
        }
        ResourceLocation setId = DatapackArmorItem.getSetId(currentStack);
        return setId != null ? setId : ResourceLocation.fromNamespaceAndPath("cobblemonarmory", "missing_set");
    }

    @Override
    public ResourceLocation getModelResource(DatapackArmorItem animatable) {
        return ArmorAssetUtil.geo(getSetIdOrMissing());
    }

    @Override
    public ResourceLocation getTextureResource(DatapackArmorItem animatable) {
        return ArmorAssetUtil.texture(getSetIdOrMissing());
    }

    @Override
    public ResourceLocation getAnimationResource(DatapackArmorItem animatable) {
        return ArmorAssetUtil.animation(getSetIdOrMissing());
    }
}

