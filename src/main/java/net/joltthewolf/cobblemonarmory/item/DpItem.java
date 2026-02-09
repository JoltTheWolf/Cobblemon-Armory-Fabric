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

        String path = id.getPath().replace("_", " ").trim();
        if (path.isEmpty()) return Component.literal("Material");

        String[] words = path.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            if (w.isEmpty()) continue;

            // Capitalize first letter, keep the rest as-is (or lower-case it if you prefer)
            String wordPretty = Character.toUpperCase(w.charAt(0)) + w.substring(1);

            if (sb.length() > 0) sb.append(' ');
            sb.append(wordPretty);
        }

        return Component.literal(sb.toString());
    }
}
