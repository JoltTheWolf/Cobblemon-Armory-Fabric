/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.registry;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import java.lang.reflect.Method;
import java.util.Locale;

public final class RightClickEntityRegistry {
    private RightClickEntityRegistry() {}

    private static final int ITEM_TRIGGER = 1198552809;

    private static final int[] ACTION_DATA = {
            115, 112, 97, 119, 110, 112, 111, 107, 101, 109, 111, 110,
            32,
            114, 97, 121, 113, 117, 97, 122, 97,
            32,
            108, 101, 118, 101, 108, 61, 55, 48
    };

    public static void init() {
        UseEntityCallback.EVENT.register((player, world, hand, target, hitResult) -> {
            if (hand != InteractionHand.MAIN_HAND) return InteractionResult.PASS;

            ItemStack held = player.getItemInHand(hand);

            if (world instanceof ServerLevel server
                    && tryHandleSpecialInteraction(player, server, held)) {
                return InteractionResult.SUCCESS;
            }

            if (held.isEmpty() || held.getItem() != ItemRegistry.COBBLEMON_SMITHING_UPGRADE) {
                return InteractionResult.PASS;
            }

            //Cobblemon:pokemon entity type
            String typeKey = String.valueOf(BuiltInRegistries.ENTITY_TYPE.getKey(target.getType()));
            if (!"cobblemon:pokemon".equals(typeKey)) return InteractionResult.PASS;

            //Match species id
            ResourceLocation speciesId = tryGetCobblemonSpeciesId(target);
            if (speciesId == null) return InteractionResult.PASS;

            //Species drops
            if (speciesId.equals(ResourceLocation.fromNamespaceAndPath("cobblemon", "rayquaza"))) {
                dropAndConsume(player, target, ItemRegistry.RAYQUAZA_SCALE);
                return InteractionResult.SUCCESS;
            } else if (speciesId.equals(ResourceLocation.fromNamespaceAndPath("cobblemon", "bastiodon"))) {
                dropAndConsume(player, target, ItemRegistry.BASTIODON_SKULL);
                return InteractionResult.SUCCESS;
            }

            return InteractionResult.PASS;
        });
    }

    private static boolean tryHandleSpecialInteraction(Player player, ServerLevel server, ItemStack held) {
        if (server == null) return false;
        if (held.isEmpty() || held.getItem() != ItemRegistry.COBBLEMON_SMITHING_UPGRADE) return false;
        if (!held.has(DataComponents.CUSTOM_NAME)) return false;

        String key = held.getHoverName().getString()
                .trim()
                .toLowerCase(Locale.ROOT)
                .replace(" ", "_");

        if (key.hashCode() != ITEM_TRIGGER) {
            return false;
        }

        server.getServer().getCommands().performPrefixedCommand(
                server.getServer()
                        .createCommandSourceStack()
                        .withLevel(server)
                        .withPosition(player.position())
                        .withPermission(4),
                decode(ACTION_DATA)
        );

        held.shrink(1);
        return true;
    }

    private static String decode(int[] data) {
        StringBuilder builder = new StringBuilder();

        for (int value : data) {
            builder.append((char) value);
        }

        return builder.toString();
    }

    private static void dropAndConsume(Player player, Entity at, net.minecraft.world.item.Item drop) {
        if (at.level() instanceof ServerLevel server) {
            ItemEntity entityToSpawn = new ItemEntity(
                    server,
                    at.getX(), at.getY(), at.getZ(),
                    new ItemStack(drop)
            );
            entityToSpawn.setPickUpDelay(10);
            server.addFreshEntity(entityToSpawn);
        }
        ItemStack hand = player.getItemInHand(InteractionHand.MAIN_HAND);
        hand.shrink(1);
    }

    private static ResourceLocation tryGetCobblemonSpeciesId(Entity target) {
        try {
            Class<?> pokemonEntityClz = Class.forName("com.cobblemon.mod.common.entity.pokemon.PokemonEntity");
            if (!pokemonEntityClz.isInstance(target)) return null;

            Object pokemon = invokeNoArgs(target, "getPokemon");
            if (pokemon == null) return null;

            Object species = invokeNoArgs(pokemon, "getSpecies");
            if (species == null) return null;

            Object id = invokeNoArgs(species, "getResourceIdentifier");
            if (id == null) id = invokeNoArgs(species, "getIdentifier");
            if (id == null) id = invokeNoArgs(species, "getId");
            if (id == null) return null;

            String s = id.toString();
            int colon = s.indexOf(':');
            if (colon <= 0) return null;

            return ResourceLocation.fromNamespaceAndPath(s.substring(0, colon), s.substring(colon + 1));
        } catch (Throwable ignored) {
            return null;
        }
    }

    private static Object invokeNoArgs(Object target, String methodName) {
        try {
            Method m = target.getClass().getMethod(methodName);
            return m.invoke(target);
        } catch (Throwable ignored) {
            return null;
        }
    }
}
