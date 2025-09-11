package net.joltthewolf.cobblemonarmory;

import net.fabricmc.api.ModInitializer;

import net.joltthewolf.cobblemonarmory.item.ModItemGroups;
import net.joltthewolf.cobblemonarmory.item.ModItems;
import net.joltthewolf.cobblemonarmory.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CobblemonArmory implements ModInitializer {
	public static final String MOD_ID = "cobblemonarmory";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        LOGGER.info("Cobblemon:Armory is loading!");
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModLootTableModifiers.modifyLootTables();
    }
}