package net.joltthewolf.cobblemonarmory.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public final class ModLootTableModifiers {
    private ModLootTableModifiers() {}

    private static final Identifier BURIED_TREASURE = Identifier.of("minecraft", "chests/buried_treasure");
    private static boolean loggedAny = false;

    public static void modifyLootTables() {
        CobblemonArmory.LOGGER.info("[{}] LootTableEvents.MODIFY: registering handler", CobblemonArmory.MOD_ID);

        LootTableEvents.MODIFY.register((id, tableBuilder, source, registries) -> {
            if (!loggedAny) {
                CobblemonArmory.LOGGER.info(
                        "[{}] First loot table seen: {} (source={}, builtin={})",
                        CobblemonArmory.MOD_ID, id, source.toString(), source.isBuiltin()
                );

                loggedAny = true;
            }
            if (id.equals(BURIED_TREASURE)) {
                CobblemonArmory.LOGGER.warn("[{}] >>> Saw buried_treasure: {}", CobblemonArmory.MOD_ID, id);
            }
        });
    }
}