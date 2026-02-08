/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.recipe;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;


public class ArmoryRecipeRegistry {

    public static void init() {
        Registry.register(
                BuiltInRegistries.RECIPE_SERIALIZER,
                ArmorySmithingSerializer.ID,
                ArmorySmithingSerializer.INSTANCE
        );
    }
}
