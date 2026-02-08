/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.registry;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public final class LootInjectorRegistry {
    private LootInjectorRegistry() {}

    // Vanilla chest loot tables
    private static final ResourceKey<LootTable> BURIED_TREASURE =
            ResourceKey.create(Registries.LOOT_TABLE,
                    ResourceLocation.fromNamespaceAndPath("minecraft", "chests/buried_treasure"));

    private static final ResourceKey<LootTable> BASTION_TREASURE =
            ResourceKey.create(Registries.LOOT_TABLE,
                    ResourceLocation.fromNamespaceAndPath("minecraft", "chests/bastion_treasure"));

    private static final ResourceKey<LootTable> ANCIENT_CITY =
            ResourceKey.create(Registries.LOOT_TABLE,
                    ResourceLocation.fromNamespaceAndPath("minecraft", "chests/ancient_city"));


    private static final Item TEMPLATE_ITEM = ItemRegistry.COBBLEMON_SMITHING_UPGRADE;


    public static void init() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, provider) -> {
            if (BURIED_TREASURE.equals(key)) {
                tableBuilder.withPool(pool(0.35f));
            } else if (BASTION_TREASURE.equals(key)) {
                tableBuilder.withPool(pool(0.25f));
            } else if (ANCIENT_CITY.equals(key)) {
                tableBuilder.withPool(pool(0.20f));
            }
        });
    }

    private static LootPool.Builder pool(float chance) {
        return LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1))
                .when(LootItemRandomChanceCondition.randomChance(chance))
                .add(LootItem.lootTableItem(TEMPLATE_ITEM)
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1))));
    }
}
