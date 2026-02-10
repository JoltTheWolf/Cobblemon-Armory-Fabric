/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.registry;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public final class ArmorRegistry {

    private ArmorRegistry() {}

    // === All materials share the same stats===
    public static final Holder<ArmorMaterial> CHARIZARD_ARMOR_MATERIAL = reg("charizard");
    public static final Holder<ArmorMaterial> SHINY_CHARIZARD_ARMOR_MATERIAL = reg("shiny_charizard");
    public static final Holder<ArmorMaterial> ARMAROUGE_ARMOR_MATERIAL = reg("armarouge");
    public static final Holder<ArmorMaterial> CERULEDGE_ARMOR_MATERIAL = reg("ceruledge");
    public static final Holder<ArmorMaterial> EEVEE_ARMOR_MATERIAL = reg("eevee");
    public static final Holder<ArmorMaterial> ESPEON_ARMOR_MATERIAL = reg("espeon");
    public static final Holder<ArmorMaterial> FLAREON_ARMOR_MATERIAL = reg("flareon");
    public static final Holder<ArmorMaterial> GLACEON_ARMOR_MATERIAL = reg("glaceon");
    public static final Holder<ArmorMaterial> HAXORUS_ARMOR_MATERIAL = reg("haxorus");
    public static final Holder<ArmorMaterial> JOLTEON_ARMOR_MATERIAL = reg("jolteon");
    public static final Holder<ArmorMaterial> LEAFEON_ARMOR_MATERIAL = reg("leafeon");
    public static final Holder<ArmorMaterial> METAGROSS_ARMOR_MATERIAL = reg("metagross");
    public static final Holder<ArmorMaterial> RAYQUAZA_ARMOR_MATERIAL = reg("rayquaza");
    public static final Holder<ArmorMaterial> SHINY_EEVEE_ARMOR_MATERIAL = reg("shiny_eevee");
    public static final Holder<ArmorMaterial> SHINY_ESPEON_ARMOR_MATERIAL = reg("shiny_espeon");
    public static final Holder<ArmorMaterial> SHINY_FLAREON_ARMOR_MATERIAL = reg("shiny_flareon");
    public static final Holder<ArmorMaterial> SHINY_GLACEON_ARMOR_MATERIAL = reg("shiny_glaceon");
    public static final Holder<ArmorMaterial> SHINY_HAXORUS_ARMOR_MATERIAL = reg("shiny_haxorus");
    public static final Holder<ArmorMaterial> SHINY_JOLTEON_ARMOR_MATERIAL = reg("shiny_jolteon");
    public static final Holder<ArmorMaterial> SHINY_LEAFEON_ARMOR_MATERIAL = reg("shiny_leafeon");
    public static final Holder<ArmorMaterial> SHINY_METAGROSS_ARMOR_MATERIAL = reg("shiny_metagross");
    public static final Holder<ArmorMaterial> SHINY_RAYQUAZA_ARMOR_MATERIAL = reg("shiny_rayquaza");
    public static final Holder<ArmorMaterial> SHINY_SYLVEON_ARMOR_MATERIAL = reg("shiny_sylveon");
    public static final Holder<ArmorMaterial> SHINY_UMBREON_ARMOR_MATERIAL = reg("shiny_umbreon");
    public static final Holder<ArmorMaterial> SHINY_VAPOREON_ARMOR_MATERIAL = reg("shiny_vaporeon");
    public static final Holder<ArmorMaterial> SYLVEON_ARMOR_MATERIAL = reg("sylveon");
    public static final Holder<ArmorMaterial> UMBREON_ARMOR_MATERIAL = reg("umbreon");
    public static final Holder<ArmorMaterial> VAPOREON_ARMOR_MATERIAL = reg("vaporeon");
    public static final Holder<ArmorMaterial> GALARIAN_WEEZING_HAT_ARMOR_MATERIAL = reg("galarian_weezing_hat");
    public static final Holder<ArmorMaterial> SQUIRTLE_GLASSES_ARMOR_MATERIAL = reg("squirtle_glasses");
    public static final Holder<ArmorMaterial> SLOWKING_CROWN_ARMOR_MATERIAL = reg("slowking_crown");
    public static final Holder<ArmorMaterial> GRENINJA_SCARF_ARMOR_MATERIAL = reg("greninja_scarf");
    // Trainer Hats
    public static final Holder<ArmorMaterial> REDS_HAT_ARMOR_MATERIAL = regLeather("reds_hat");
    public static final Holder<ArmorMaterial> ETHANS_HAT_ARMOR_MATERIAL = regLeather("ethans_hat");
    public static final Holder<ArmorMaterial> KRISS_HAT_ARMOR_MATERIAL = regLeather("kriss_hat");
    public static final Holder<ArmorMaterial> MAYS_HAT_ARMOR_MATERIAL = regLeather("mays_hat");
    public static final Holder<ArmorMaterial> DAWNS_HAT_ARMOR_MATERIAL = regLeather("dawns_hat");
    public static final Holder<ArmorMaterial> LEAFS_HAT_ARMOR_MATERIAL = regLeather("leafs_hat");
    public static final Holder<ArmorMaterial> LYRAS_HAT_ARMOR_MATERIAL = regLeather("lyras_hat");
    public static final Holder<ArmorMaterial> NATES_HAT_ARMOR_MATERIAL = regLeather("nates_hat");
    public static final Holder<ArmorMaterial> CALEMS_HAT_ARMOR_MATERIAL = regLeather("calems_hat");
    public static final Holder<ArmorMaterial> BRENDANS_HAT_ARMOR_MATERIAL = regLeather("brendans_hat");
    public static final Holder<ArmorMaterial> LUCASS_HAT_ARMOR_MATERIAL = regLeather("lucass_hat");
    public static final Holder<ArmorMaterial> HILBERTS_HAT_ARMOR_MATERIAL = regLeather("hilbertss_hat");
    public static final Holder<ArmorMaterial> HILDAS_HAT_ARMOR_MATERIAL = regLeather("hildas_hat");
    public static final Holder<ArmorMaterial> ROSAS_HAT_ARMOR_MATERIAL = regLeather("rosas_hat");
    public static final Holder<ArmorMaterial> SERENAS_HAT_ARMOR_MATERIAL = regLeather("serenas_hat");
    public static final Holder<ArmorMaterial> SELENES_HAT_ARMOR_MATERIAL = regLeather("selenes_hat");
    public static final Holder<ArmorMaterial> ELIOS_HAT_ARMOR_MATERIAL = regLeather("elios_hat");
    public static final Holder<ArmorMaterial> GLORIAS_HAT_ARMOR_MATERIAL = regLeather("glorias_hat");
    public static final Holder<ArmorMaterial> VICTORS_HAT_ARMOR_MATERIAL = regLeather("victors_hat");


    public static void init() {
        CobblemonArmory.LOGGER.info("Registering armor materials for {}", CobblemonArmory.MOD_ID);
        Holder<ArmorMaterial> _a = ARMOR_BASE_MATERIAL;
        Holder<ArmorMaterial> _b = REG_LEATHER_MATERIAL;
    }

    // - Helpers -

    public static final Holder<ArmorMaterial> ARMOR_BASE_MATERIAL =
            registerArmorMaterial("armor_base", createArmorMaterialFor("armor_base"));
    public static final Holder<ArmorMaterial> REG_LEATHER_MATERIAL =
            registerArmorMaterial("leather_base", createLeatherArmorMaterialFor("leather_base"));

    //- Datapack Support -
    public static Holder<ArmorMaterial> resolveDatapackMaterial(String key) {
        return switch (key) {
            case "armor_base" -> ARMOR_BASE_MATERIAL;
            case "leather_base" -> REG_LEATHER_MATERIAL;
            default -> ARMOR_BASE_MATERIAL;
        };
    }

    // Regular Armor Stats
    private static Holder<ArmorMaterial> reg(String key) {
        return registerArmorMaterial(key, createArmorMaterialFor(key));
    }

    // Leather Armor Stats
    private static Holder<ArmorMaterial> regLeather(String key) {
        return registerArmorMaterial(key, createLeatherArmorMaterialFor(key));
    }

    private static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, path);
    }

    private static Holder<ArmorMaterial> registerArmorMaterial(String path, ArmorMaterial material) {
        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, id(path), material);
    }

    private static ArmorMaterial createArmorMaterialFor(String layerKey) {
        Map<ArmorItem.Type, Integer> defense = new EnumMap<>(ArmorItem.Type.class);
        //Armor Base
        defense.put(ArmorItem.Type.HELMET, 3);
        defense.put(ArmorItem.Type.CHESTPLATE, 8);
        defense.put(ArmorItem.Type.LEGGINGS, 6);
        defense.put(ArmorItem.Type.BOOTS, 3);

        Supplier<Ingredient> repairSupplier = () -> Ingredient.of(Items.DIAMOND);

        return new ArmorMaterial(
                defense,
                12, // enchantability
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                repairSupplier,
                List.of(new ArmorMaterial.Layer(id(layerKey))),
                2.5F, // toughness
                0.0F // knockback resistance
        );
    }

    private static ArmorMaterial createLeatherArmorMaterialFor(String layerKey) {
        Map<ArmorItem.Type, Integer> defense = new EnumMap<>(ArmorItem.Type.class);
        // Vanilla leather-ish values
        defense.put(ArmorItem.Type.HELMET, 1);
        defense.put(ArmorItem.Type.CHESTPLATE, 3);
        defense.put(ArmorItem.Type.LEGGINGS, 2);
        defense.put(ArmorItem.Type.BOOTS, 1);

        Supplier<Ingredient> repairSupplier = () -> Ingredient.of(Items.LEATHER);

        return new ArmorMaterial(
                defense,
                15, // enchantability
                SoundEvents.ARMOR_EQUIP_LEATHER, // equip sound
                repairSupplier,
                List.of(new ArmorMaterial.Layer(id(layerKey))),
                0.0F, // toughness
                0.0F // knockback resistance
        );
    }


    // - Durability helper (used when registering items) -
    // Vanilla base health per slot: HELMET=11, CHEST=16, LEGS=15, BOOTS=13
    private static final int HELMET_BASE = 11, CHEST_BASE = 16, LEGS_BASE = 15, BOOTS_BASE = 13;

    /*  35x durability per slot */
    public static Item.Properties commonProps(ArmorItem.Type type) {
        int base = switch (type) {
            case HELMET -> HELMET_BASE;
            case CHESTPLATE -> CHEST_BASE;
            case LEGGINGS -> LEGS_BASE;
            case BOOTS -> BOOTS_BASE;
            default         -> 0;
        };
        return new Item.Properties().stacksTo(1).durability(base * 35);
    }
    /* 5x durability per slot */
    public static Item.Properties commonHatProps(ArmorItem.Type type) {
        int base = switch (type) {
            case HELMET -> HELMET_BASE;
            case CHESTPLATE -> CHEST_BASE;
            case LEGGINGS -> LEGS_BASE;
            case BOOTS -> BOOTS_BASE;
            default         -> 0;
        };
        return new Item.Properties().stacksTo(1).durability(base * 5);
    }


}
