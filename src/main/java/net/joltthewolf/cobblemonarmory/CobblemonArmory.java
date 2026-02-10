/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory;

import net.fabricmc.api.ModInitializer;
import net.joltthewolf.cobblemonarmory.drops.*;
import net.joltthewolf.cobblemonarmory.recipe.ArmoryRecipeRegistry;
import net.joltthewolf.cobblemonarmory.registry.*;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.joltthewolf.cobblemonarmory.command.ArmoryDebugCommand;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CobblemonArmory implements ModInitializer {
	public static final String MOD_ID = "cobblemonarmory";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
	public void onInitialize() {
        verifySignature();
        ArmoryDrops.init();
        ArmoryDropHooks.register();
        ArmoryDropsReload.register();
        ArmoryRecipeRegistry.init();
        ItemRegistry.init();
        ArmorRegistry.init();
        ItemGroupRegistry.init();
        LootInjectorRegistry.init();
        RightClickEntityRegistry.init();
        ComponentRegistry.init();
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            ArmoryDebugCommand.register(dispatcher);
        });

    }
    private static void verifySignature() {
        final String expected = "JTWCA";
        try {
            String actual = net.joltthewolf.cobblemonarmory.registry.ArmorySignature.SIGNATURE;
            if (!expected.equals(actual)) {
                LOGGER.warn("[{}] Signature mismatch.", MOD_ID);
            }
        } catch (Throwable t) {
            LOGGER.warn("[{}] Signature missing.", MOD_ID);
        }
    }
}