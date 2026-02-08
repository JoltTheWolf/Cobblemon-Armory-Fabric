/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */


package net.joltthewolf.cobblemonarmory.registry;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

import java.util.function.UnaryOperator;

public final class ComponentRegistry {

    public static final DataComponentType<ResourceLocation> ARMOR_SET_ID =
            register("armor_set_id", b -> b.persistent(ResourceLocation.CODEC));

    public static final DataComponentType<ResourceLocation> MATERIAL_ID =
            register("material_id", b -> b
                    .persistent(ResourceLocation.CODEC)
                    .networkSynchronized(ResourceLocation.STREAM_CODEC)
            );

    private static <T> DataComponentType<T> register(String path, UnaryOperator<DataComponentType.Builder<T>> op) {
        return Registry.register(
                BuiltInRegistries.DATA_COMPONENT_TYPE,
                ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, path),
                op.apply(DataComponentType.builder()).build());
    }

    public static void init() {}
}

