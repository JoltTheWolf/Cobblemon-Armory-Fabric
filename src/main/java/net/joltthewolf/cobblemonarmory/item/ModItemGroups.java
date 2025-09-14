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
                        entries.add(ModItems.CHARIZARD_ARMOR_HELMET);
                        entries.add(ModItems.CHARIZARD_ARMOR_CHESTPLATE);
                        entries.add(ModItems.CHARIZARD_ARMOR_LEGGINGS);
                        entries.add(ModItems.CHARIZARD_ARMOR_BOOTS);
                        entries.add(ModItems.SHINY_CHARIZARD_ARMOR_HELMET);
                        entries.add(ModItems.SHINY_CHARIZARD_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SHINY_CHARIZARD_ARMOR_LEGGINGS);
                        entries.add(ModItems.SHINY_CHARIZARD_ARMOR_BOOTS);
                        entries.add(ModItems.CERULEDGE_ARMOR_HELMET);
                        entries.add(ModItems.CERULEDGE_ARMOR_CHESTPLATE);
                        entries.add(ModItems.CERULEDGE_ARMOR_LEGGINGS);
                        entries.add(ModItems.CERULEDGE_ARMOR_BOOTS);
                        entries.add(ModItems.ARMAROUGE_ARMOR_HELMET);
                        entries.add(ModItems.ARMAROUGE_ARMOR_CHESTPLATE);
                        entries.add(ModItems.ARMAROUGE_ARMOR_LEGGINGS);
                        entries.add(ModItems.ARMAROUGE_ARMOR_BOOTS);
                        entries.add(ModItems.HAXORUS_ARMOR_HELMET);
                        entries.add(ModItems.HAXORUS_ARMOR_CHESTPLATE);
                        entries.add(ModItems.HAXORUS_ARMOR_LEGGINGS);
                        entries.add(ModItems.HAXORUS_ARMOR_BOOTS);
                        entries.add(ModItems.SHINY_HAXORUS_ARMOR_HELMET);
                        entries.add(ModItems.SHINY_HAXORUS_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SHINY_HAXORUS_ARMOR_LEGGINGS);
                        entries.add(ModItems.SHINY_HAXORUS_ARMOR_BOOTS);
                        entries.add(ModItems.EEVEE_ARMOR_HELMET);
                        entries.add(ModItems.EEVEE_ARMOR_CHESTPLATE);
                        entries.add(ModItems.EEVEE_ARMOR_LEGGINGS);
                        entries.add(ModItems.EEVEE_ARMOR_BOOTS);
                        entries.add(ModItems.SHINY_EEVEE_ARMOR_HELMET);
                        entries.add(ModItems.SHINY_EEVEE_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SHINY_EEVEE_ARMOR_LEGGINGS);
                        entries.add(ModItems.SHINY_EEVEE_ARMOR_BOOTS);
                        entries.add(ModItems.UMBREON_ARMOR_HELMET);
                        entries.add(ModItems.UMBREON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.UMBREON_ARMOR_LEGGINGS);
                        entries.add(ModItems.UMBREON_ARMOR_BOOTS);
                        entries.add(ModItems.SHINY_UMBREON_ARMOR_HELMET);
                        entries.add(ModItems.SHINY_UMBREON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SHINY_UMBREON_ARMOR_LEGGINGS);
                        entries.add(ModItems.SHINY_UMBREON_ARMOR_BOOTS);
                        entries.add(ModItems.ESPEON_ARMOR_HELMET);
                        entries.add(ModItems.ESPEON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.ESPEON_ARMOR_LEGGINGS);
                        entries.add(ModItems.ESPEON_ARMOR_BOOTS);
                        entries.add(ModItems.SHINY_ESPEON_ARMOR_HELMET);
                        entries.add(ModItems.SHINY_ESPEON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SHINY_ESPEON_ARMOR_LEGGINGS);
                        entries.add(ModItems.SHINY_ESPEON_ARMOR_BOOTS);
                        entries.add(ModItems.LEAFEON_ARMOR_HELMET);
                        entries.add(ModItems.LEAFEON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.LEAFEON_ARMOR_LEGGINGS);
                        entries.add(ModItems.LEAFEON_ARMOR_BOOTS);
                        entries.add(ModItems.SHINY_LEAFEON_ARMOR_HELMET);
                        entries.add(ModItems.SHINY_LEAFEON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SHINY_LEAFEON_ARMOR_LEGGINGS);
                        entries.add(ModItems.SHINY_LEAFEON_ARMOR_BOOTS);
                        entries.add(ModItems.GLACEON_ARMOR_HELMET);
                        entries.add(ModItems.GLACEON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.GLACEON_ARMOR_LEGGINGS);
                        entries.add(ModItems.GLACEON_ARMOR_BOOTS);
                        entries.add(ModItems.SHINY_GLACEON_ARMOR_HELMET);
                        entries.add(ModItems.SHINY_GLACEON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SHINY_GLACEON_ARMOR_LEGGINGS);
                        entries.add(ModItems.SHINY_GLACEON_ARMOR_BOOTS);
                        entries.add(ModItems.SYLVEON_ARMOR_HELMET);
                        entries.add(ModItems.SYLVEON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SYLVEON_ARMOR_LEGGINGS);
                        entries.add(ModItems.SYLVEON_ARMOR_BOOTS);
                        entries.add(ModItems.SHINY_SYLVEON_ARMOR_HELMET);
                        entries.add(ModItems.SHINY_SYLVEON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SHINY_SYLVEON_ARMOR_LEGGINGS);
                        entries.add(ModItems.SHINY_SYLVEON_ARMOR_BOOTS);
                        entries.add(ModItems.VAPOREON_ARMOR_HELMET);
                        entries.add(ModItems.VAPOREON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.VAPOREON_ARMOR_LEGGINGS);
                        entries.add(ModItems.VAPOREON_ARMOR_BOOTS);
                        entries.add(ModItems.SHINY_VAPOREON_ARMOR_HELMET);
                        entries.add(ModItems.SHINY_VAPOREON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SHINY_VAPOREON_ARMOR_LEGGINGS);
                        entries.add(ModItems.SHINY_VAPOREON_ARMOR_BOOTS);
                        entries.add(ModItems.FLAREON_ARMOR_HELMET);
                        entries.add(ModItems.FLAREON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.FLAREON_ARMOR_LEGGINGS);
                        entries.add(ModItems.FLAREON_ARMOR_BOOTS);
                        entries.add(ModItems.SHINY_FLAREON_ARMOR_HELMET);
                        entries.add(ModItems.SHINY_FLAREON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SHINY_FLAREON_ARMOR_LEGGINGS);
                        entries.add(ModItems.SHINY_FLAREON_ARMOR_BOOTS);
                        entries.add(ModItems.JOLTEON_ARMOR_HELMET);
                        entries.add(ModItems.JOLTEON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.JOLTEON_ARMOR_LEGGINGS);
                        entries.add(ModItems.JOLTEON_ARMOR_BOOTS);
                        entries.add(ModItems.SHINY_JOLTEON_ARMOR_HELMET);
                        entries.add(ModItems.SHINY_JOLTEON_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SHINY_JOLTEON_ARMOR_LEGGINGS);
                        entries.add(ModItems.SHINY_JOLTEON_ARMOR_BOOTS);
                        entries.add(ModItems.SHINY_RAYQUAZA_ARMOR_HELMET);
                        entries.add(ModItems.SHINY_RAYQUAZA_ARMOR_CHESTPLATE);
                        entries.add(ModItems.SHINY_RAYQUAZA_ARMOR_LEGGINGS);
                        entries.add(ModItems.SHINY_RAYQUAZA_ARMOR_BOOTS);
                        entries.add(ModItems.STARMIE_SWORD);
                        entries.add(ModItems.TINKATON_HAMMER);
                        entries.add(ModItems.SIRFETCHD_SWORD);
                        entries.add(ModItems.PRIMEAPE_GLOVE);

                    }).build());

    public static void registerItemGroups() {
        CobblemonArmory.LOGGER.info("Registering Item Groups for " + CobblemonArmory.MOD_ID);


    }
}
