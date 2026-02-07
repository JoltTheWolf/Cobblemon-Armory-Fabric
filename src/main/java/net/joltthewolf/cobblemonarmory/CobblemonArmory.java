package net.joltthewolf.cobblemonarmory;

import net.fabricmc.api.ModInitializer;
import net.joltthewolf.cobblemonarmory.recipe.ArmorySmithingSerializer;
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
        ArmorySmithingSerializer.register();
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
}