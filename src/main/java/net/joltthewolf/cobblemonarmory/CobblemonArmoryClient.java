package net.joltthewolf.cobblemonarmory;

import net.fabricmc.api.ClientModInitializer;
import net.joltthewolf.cobblemonarmory.item.ModItemGroups;
import net.joltthewolf.cobblemonarmory.item.ModItems;
import net.joltthewolf.cobblemonarmory.util.ModLootTableModifiers;

import static com.mojang.text2speech.Narrator.LOGGER;

public class CobblemonArmoryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        LOGGER.info("Cobblemon:Armory is loading!");
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModLootTableModifiers.modifyLootTables();
    }
}
