package net.joltthewolf.cobblemonarmory.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.joltthewolf.cobblemonarmory.item.custom.PrimeapeGloveItem;
import net.joltthewolf.cobblemonarmory.item.custom.SirfetchdSwordItem;
import net.joltthewolf.cobblemonarmory.item.custom.StarmieSwordItem;
import net.joltthewolf.cobblemonarmory.item.custom.TinkatonHammerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item CHARIZARD_SCALES = registerItem("charizard_scales", new Item(new Item.Settings()));
    public static final Item COBBLEMON_SMITHING_UPGRADE = registerItem("cobblemon_smithing_upgrade", new Item(new Item.Settings()));
    public static final Item TINKATON_HAMMER_PIECE = registerItem("tinkaton_hammer_piece", new Item(new Item.Settings()));
    public static final Item TINKATON_HANDLE_PIECE = registerItem("tinkaton_handle_piece", new Item(new Item.Settings()));
    public static final Item PRIMEAPE_FUR = registerItem("primeape_fur", new Item(new Item.Settings()));
    public static final Item BASTIODON_SKULL = registerItem("bastiodon_skull", new Item(new Item.Settings()));
    public static final Item HAXORUS_SHARD = registerItem("haxorus_shard", new Item(new Item.Settings()));
    public static final Item EEVEE_FUR = registerItem("eevee_fur", new Item(new Item.Settings()));
    public static final Item STARMIE_PIECES = registerItem("starmie_pieces", new Item(new Item.Settings()));
    public static final Item RAYQUAZA_SCALE = registerItem("rayquaza_scale", new Item(new Item.Settings()));
    public static final Item CHARIZARD_ARMOR_HELMET = registerItem("charizard_armor_helmet", new Item(new Item.Settings()));
    public static final Item CHARIZARD_ARMOR_CHESTPLATE = registerItem("charizard_armor_chestplate", new Item(new Item.Settings()));
    public static final Item CHARIZARD_ARMOR_LEGGINGS = registerItem("charizard_armor_leggings", new Item(new Item.Settings()));
    public static final Item CHARIZARD_ARMOR_BOOTS = registerItem("charizard_armor_boots", new Item(new Item.Settings()));
    public static final Item SHINY_CHARIZARD_ARMOR_HELMET = registerItem("shiny_charizard_armor_helmet", new Item(new Item.Settings()));
    public static final Item SHINY_CHARIZARD_ARMOR_CHESTPLATE = registerItem("shiny_charizard_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SHINY_CHARIZARD_ARMOR_LEGGINGS = registerItem("shiny_charizard_armor_leggings", new Item(new Item.Settings()));
    public static final Item SHINY_CHARIZARD_ARMOR_BOOTS = registerItem("shiny_charizard_armor_boots", new Item(new Item.Settings()));
    public static final Item CERULEDGE_ARMOR_HELMET = registerItem("ceruledge_armor_helmet", new Item(new Item.Settings()));
    public static final Item CERULEDGE_ARMOR_CHESTPLATE = registerItem("ceruledge_armor_chestplate", new Item(new Item.Settings()));
    public static final Item CERULEDGE_ARMOR_LEGGINGS = registerItem("ceruledge_armor_leggings", new Item(new Item.Settings()));
    public static final Item CERULEDGE_ARMOR_BOOTS = registerItem("ceruledge_armor_boots", new Item(new Item.Settings()));
    public static final Item ARMAROUGE_ARMOR_HELMET = registerItem("armarouge_armor_helmet", new Item(new Item.Settings()));
    public static final Item ARMAROUGE_ARMOR_CHESTPLATE = registerItem("armarouge_armor_chestplate", new Item(new Item.Settings()));
    public static final Item ARMAROUGE_ARMOR_LEGGINGS = registerItem("armarouge_armor_leggings", new Item(new Item.Settings()));
    public static final Item ARMAROUGE_ARMOR_BOOTS = registerItem("armarouge_armor_boots", new Item(new Item.Settings()));
    public static final Item HAXORUS_ARMOR_HELMET = registerItem("haxorus_armor_helmet", new Item(new Item.Settings()));
    public static final Item HAXORUS_ARMOR_CHESTPLATE = registerItem("haxorus_armor_chestplate", new Item(new Item.Settings()));
    public static final Item HAXORUS_ARMOR_LEGGINGS = registerItem("haxorus_armor_leggings", new Item(new Item.Settings()));
    public static final Item HAXORUS_ARMOR_BOOTS = registerItem("haxorus_armor_boots", new Item(new Item.Settings()));
    public static final Item SHINY_HAXORUS_ARMOR_HELMET = registerItem("shiny_haxorus_armor_helmet", new Item(new Item.Settings()));
    public static final Item SHINY_HAXORUS_ARMOR_CHESTPLATE = registerItem("shiny_haxorus_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SHINY_HAXORUS_ARMOR_LEGGINGS = registerItem("shiny_haxorus_armor_leggings", new Item(new Item.Settings()));
    public static final Item SHINY_HAXORUS_ARMOR_BOOTS = registerItem("shiny_haxorus_armor_boots", new Item(new Item.Settings()));
    public static final Item EEVEE_ARMOR_HELMET = registerItem("eevee_armor_helmet", new Item(new Item.Settings()));
    public static final Item EEVEE_ARMOR_CHESTPLATE = registerItem("eevee_armor_chestplate", new Item(new Item.Settings()));
    public static final Item EEVEE_ARMOR_LEGGINGS = registerItem("eevee_armor_leggings", new Item(new Item.Settings()));
    public static final Item EEVEE_ARMOR_BOOTS = registerItem("eevee_armor_boots", new Item(new Item.Settings()));
    public static final Item SHINY_EEVEE_ARMOR_HELMET = registerItem("shiny_eevee_armor_helmet", new Item(new Item.Settings()));
    public static final Item SHINY_EEVEE_ARMOR_CHESTPLATE = registerItem("shiny_eevee_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SHINY_EEVEE_ARMOR_LEGGINGS = registerItem("shiny_eevee_armor_leggings", new Item(new Item.Settings()));
    public static final Item SHINY_EEVEE_ARMOR_BOOTS = registerItem("shiny_eevee_armor_boots", new Item(new Item.Settings()));
    public static final Item UMBREON_ARMOR_HELMET = registerItem("umbreon_armor_helmet", new Item(new Item.Settings()));
    public static final Item UMBREON_ARMOR_CHESTPLATE = registerItem("umbreon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item UMBREON_ARMOR_LEGGINGS = registerItem("umbreon_armor_leggings", new Item(new Item.Settings()));
    public static final Item UMBREON_ARMOR_BOOTS = registerItem("umbreon_armor_boots", new Item(new Item.Settings()));
    public static final Item SHINY_UMBREON_ARMOR_HELMET = registerItem("shiny_umbreon_armor_helmet", new Item(new Item.Settings()));
    public static final Item SHINY_UMBREON_ARMOR_CHESTPLATE = registerItem("shiny_umbreon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SHINY_UMBREON_ARMOR_LEGGINGS = registerItem("shiny_umbreon_armor_leggings", new Item(new Item.Settings()));
    public static final Item SHINY_UMBREON_ARMOR_BOOTS = registerItem("shiny_umbreon_armor_boots", new Item(new Item.Settings()));
    public static final Item ESPEON_ARMOR_HELMET = registerItem("espeon_armor_helmet", new Item(new Item.Settings()));
    public static final Item ESPEON_ARMOR_CHESTPLATE = registerItem("espeon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item ESPEON_ARMOR_LEGGINGS = registerItem("espeon_armor_leggings", new Item(new Item.Settings()));
    public static final Item ESPEON_ARMOR_BOOTS = registerItem("espeon_armor_boots", new Item(new Item.Settings()));
    public static final Item SHINY_ESPEON_ARMOR_HELMET = registerItem("shiny_espeon_armor_helmet", new Item(new Item.Settings()));
    public static final Item SHINY_ESPEON_ARMOR_CHESTPLATE = registerItem("shiny_espeon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SHINY_ESPEON_ARMOR_LEGGINGS = registerItem("shiny_espeon_armor_leggings", new Item(new Item.Settings()));
    public static final Item SHINY_ESPEON_ARMOR_BOOTS = registerItem("shiny_espeon_armor_boots", new Item(new Item.Settings()));
    public static final Item LEAFEON_ARMOR_HELMET = registerItem("leafeon_armor_helmet", new Item(new Item.Settings()));
    public static final Item LEAFEON_ARMOR_CHESTPLATE = registerItem("leafeon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item LEAFEON_ARMOR_LEGGINGS = registerItem("leafeon_armor_leggings", new Item(new Item.Settings()));
    public static final Item LEAFEON_ARMOR_BOOTS = registerItem("leafeon_armor_boots", new Item(new Item.Settings()));
    public static final Item SHINY_LEAFEON_ARMOR_HELMET = registerItem("shiny_leafeon_armor_helmet", new Item(new Item.Settings()));
    public static final Item SHINY_LEAFEON_ARMOR_CHESTPLATE = registerItem("shiny_leafeon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SHINY_LEAFEON_ARMOR_LEGGINGS = registerItem("shiny_leafeon_armor_leggings", new Item(new Item.Settings()));
    public static final Item SHINY_LEAFEON_ARMOR_BOOTS = registerItem("shiny_leafeon_armor_boots", new Item(new Item.Settings()));
    public static final Item GLACEON_ARMOR_HELMET = registerItem("glaceon_armor_helmet", new Item(new Item.Settings()));
    public static final Item GLACEON_ARMOR_CHESTPLATE = registerItem("glaceon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item GLACEON_ARMOR_LEGGINGS = registerItem("glaceon_armor_leggings", new Item(new Item.Settings()));
    public static final Item GLACEON_ARMOR_BOOTS = registerItem("glaceon_armor_boots", new Item(new Item.Settings()));
    public static final Item SHINY_GLACEON_ARMOR_HELMET = registerItem("shiny_glaceon_armor_helmet", new Item(new Item.Settings()));
    public static final Item SHINY_GLACEON_ARMOR_CHESTPLATE = registerItem("shiny_glaceon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SHINY_GLACEON_ARMOR_LEGGINGS = registerItem("shiny_glaceon_armor_leggings", new Item(new Item.Settings()));
    public static final Item SHINY_GLACEON_ARMOR_BOOTS = registerItem("shiny_glaceon_armor_boots", new Item(new Item.Settings()));
    public static final Item SYLVEON_ARMOR_HELMET = registerItem("sylveon_armor_helmet", new Item(new Item.Settings()));
    public static final Item SYLVEON_ARMOR_CHESTPLATE = registerItem("sylveon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SYLVEON_ARMOR_LEGGINGS = registerItem("sylveon_armor_leggings", new Item(new Item.Settings()));
    public static final Item SYLVEON_ARMOR_BOOTS = registerItem("sylveon_armor_boots", new Item(new Item.Settings()));
    public static final Item SHINY_SYLVEON_ARMOR_HELMET = registerItem("shiny_sylveon_armor_helmet", new Item(new Item.Settings()));
    public static final Item SHINY_SYLVEON_ARMOR_CHESTPLATE = registerItem("shiny_sylveon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SHINY_SYLVEON_ARMOR_LEGGINGS = registerItem("shiny_sylveon_armor_leggings", new Item(new Item.Settings()));
    public static final Item SHINY_SYLVEON_ARMOR_BOOTS = registerItem("shiny_sylveon_armor_boots", new Item(new Item.Settings()));
    public static final Item VAPOREON_ARMOR_HELMET = registerItem("vaporeon_armor_helmet", new Item(new Item.Settings()));
    public static final Item VAPOREON_ARMOR_CHESTPLATE = registerItem("vaporeon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item VAPOREON_ARMOR_LEGGINGS = registerItem("vaporeon_armor_leggings", new Item(new Item.Settings()));
    public static final Item VAPOREON_ARMOR_BOOTS = registerItem("vaporeon_armor_boots", new Item(new Item.Settings()));
    public static final Item SHINY_VAPOREON_ARMOR_HELMET = registerItem("shiny_vaporeon_armor_helmet", new Item(new Item.Settings()));
    public static final Item SHINY_VAPOREON_ARMOR_CHESTPLATE = registerItem("shiny_vaporeon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SHINY_VAPOREON_ARMOR_LEGGINGS = registerItem("shiny_vaporeon_armor_leggings", new Item(new Item.Settings()));
    public static final Item SHINY_VAPOREON_ARMOR_BOOTS = registerItem("shiny_vaporeon_armor_boots", new Item(new Item.Settings()));
    public static final Item FLAREON_ARMOR_HELMET = registerItem("flareon_armor_helmet", new Item(new Item.Settings()));
    public static final Item FLAREON_ARMOR_CHESTPLATE = registerItem("flareon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item FLAREON_ARMOR_LEGGINGS = registerItem("flareon_armor_leggings", new Item(new Item.Settings()));
    public static final Item FLAREON_ARMOR_BOOTS = registerItem("flareon_armor_boots", new Item(new Item.Settings()));
    public static final Item SHINY_FLAREON_ARMOR_HELMET = registerItem("shiny_flareon_armor_helmet", new Item(new Item.Settings()));
    public static final Item SHINY_FLAREON_ARMOR_CHESTPLATE = registerItem("shiny_flareon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SHINY_FLAREON_ARMOR_LEGGINGS = registerItem("shiny_flareon_armor_leggings", new Item(new Item.Settings()));
    public static final Item SHINY_FLAREON_ARMOR_BOOTS = registerItem("shiny_flareon_armor_boots", new Item(new Item.Settings()));
    public static final Item JOLTEON_ARMOR_HELMET = registerItem("jolteon_armor_helmet", new Item(new Item.Settings()));
    public static final Item JOLTEON_ARMOR_CHESTPLATE = registerItem("jolteon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item JOLTEON_ARMOR_LEGGINGS = registerItem("jolteon_armor_leggings", new Item(new Item.Settings()));
    public static final Item JOLTEON_ARMOR_BOOTS = registerItem("jolteon_armor_boots", new Item(new Item.Settings()));
    public static final Item SHINY_JOLTEON_ARMOR_HELMET = registerItem("shiny_jolteon_armor_helmet", new Item(new Item.Settings()));
    public static final Item SHINY_JOLTEON_ARMOR_CHESTPLATE = registerItem("shiny_jolteon_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SHINY_JOLTEON_ARMOR_LEGGINGS = registerItem("shiny_jolteon_armor_leggings", new Item(new Item.Settings()));
    public static final Item SHINY_JOLTEON_ARMOR_BOOTS = registerItem("shiny_jolteon_armor_boots", new Item(new Item.Settings()));
    public static final Item RAYQUAZA_ARMOR_HELMET = registerItem("rayquaza_armor_helmet", new Item(new Item.Settings()));
    public static final Item RAYQUAZA_ARMOR_CHESTPLATE = registerItem("rayquaza_armor_chestplate", new Item(new Item.Settings()));
    public static final Item RAYQUAZA_ARMOR_LEGGINGS = registerItem("rayquaza_armor_leggings", new Item(new Item.Settings()));
    public static final Item RAYQUAZA_ARMOR_BOOTS = registerItem("rayquaza_armor_boots", new Item(new Item.Settings()));
    public static final Item SHINY_RAYQUAZA_ARMOR_HELMET = registerItem("shiny_rayquaza_armor_helmet", new Item(new Item.Settings()));
    public static final Item SHINY_RAYQUAZA_ARMOR_CHESTPLATE = registerItem("shiny_rayquaza_armor_chestplate", new Item(new Item.Settings()));
    public static final Item SHINY_RAYQUAZA_ARMOR_LEGGINGS = registerItem("shiny_rayquaza_armor_leggings", new Item(new Item.Settings()));
    public static final Item SHINY_RAYQUAZA_ARMOR_BOOTS = registerItem("shiny_rayquaza_armor_boots", new Item(new Item.Settings()));
    public static final Item STARMIE_SWORD = Registry.register(Registries.ITEM, Identifier.of("cobblemonarmory", "starmie_sword"), new StarmieSwordItem(new Item.Settings().maxCount(1)));
    public static final Item TINKATON_HAMMER = Registry.register(Registries.ITEM, Identifier.of("cobblemonarmory", "tinkaton_hammer"), new TinkatonHammerItem(new Item.Settings().maxCount(1)));
    public static final Item SIRFETCHD_SWORD = Registry.register(Registries.ITEM, Identifier.of("cobblemonarmory", "sirfetchd_sword"), new SirfetchdSwordItem(new Item.Settings().maxCount(1)));
    public static final Item PRIMEAPE_GLOVE = Registry.register(Registries.ITEM, Identifier.of("cobblemonarmory", "primeape_glove"), new PrimeapeGloveItem(new Item.Settings().maxCount(1)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CobblemonArmory.MOD_ID, name), item);
    }


    public static void registerModItems() {
        CobblemonArmory.LOGGER.info("Registering Mod Items for " + CobblemonArmory.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }


}
