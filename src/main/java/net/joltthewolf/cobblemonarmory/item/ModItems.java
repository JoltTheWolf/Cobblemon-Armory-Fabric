package net.joltthewolf.cobblemonarmory.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CobblemonArmory.MOD_ID, name), item);
    }


    public static void registerModItems() {
        CobblemonArmory.LOGGER.info("Registering Mod Items for " + CobblemonArmory.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CHARIZARD_SCALES);
            entries.add(COBBLEMON_SMITHING_UPGRADE);
            entries.add(TINKATON_HAMMER_PIECE);
            entries.add(TINKATON_HANDLE_PIECE);
            entries.add(PRIMEAPE_FUR);
            entries.add(BASTIODON_SKULL);
            entries.add(HAXORUS_SHARD);
            entries.add(EEVEE_FUR);
            entries.add(STARMIE_PIECES);
            entries.add(RAYQUAZA_SCALE);
        });
    }


}
