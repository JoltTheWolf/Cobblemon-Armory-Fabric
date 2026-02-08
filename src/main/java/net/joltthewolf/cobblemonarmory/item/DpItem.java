/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.item;

import net.joltthewolf.cobblemonarmory.registry.ComponentRegistry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class DpItem extends Item {
    public DpItem(Properties properties) {
        super(properties);
    }
    @Override
    public Component getName(ItemStack stack) {
        ResourceLocation id = stack.get(ComponentRegistry.MATERIAL_ID);
        if (id == null) return super.getName(stack);
        String path = id.getPath().replace("_", " ");
        String pretty = path.isEmpty() ? "Material" : (Character.toUpperCase(path.charAt(0)) + path.substring(1));
        return Component.literal(pretty);
    }
}
