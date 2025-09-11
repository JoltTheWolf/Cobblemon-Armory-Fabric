package net.joltthewolf.cobblemonarmory.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COBBLEMON_ARMORY = Registry.register(Registries.ITEM_GROUP, Identifier.of(CobblemonArmory.MOD_ID, "cobblemon_armory"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.COBBLEMON_SMITHING_UPGRADE))
                    .displayName(Text.translatable("item_group.cobblemonarmory.cobblemon_armory"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.COBBLEMON_SMITHING_UPGRADE);
                        entries.add(ModItems.CHARIZARD_SCALES);
                        entries.add(ModItems.TINKATON_HAMMER_PIECE);
                        entries.add(ModItems.TINKATON_HANDLE_PIECE);
                        entries.add(ModItems.PRIMEAPE_FUR);
                        entries.add(ModItems.BASTIODON_SKULL);
                        entries.add(ModItems.HAXORUS_SHARD);
                        entries.add(ModItems.EEVEE_FUR);
                        entries.add(ModItems.STARMIE_PIECES);
                        entries.add(ModItems.RAYQUAZA_SCALE);


                    }).build());

    public static void registerItemGroups() {
        CobblemonArmory.LOGGER.info("Registering Item Groups for " + CobblemonArmory.MOD_ID);


    }
}
