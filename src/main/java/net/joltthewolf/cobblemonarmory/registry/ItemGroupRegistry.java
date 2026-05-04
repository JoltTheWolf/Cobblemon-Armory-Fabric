package net.joltthewolf.cobblemonarmory.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public final class ItemGroupRegistry {
    public static void init() {}

    public static final CreativeModeTab COBBLEMON_ARMORY_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "cobblemon_armory"),
            FabricItemGroup.builder()
                    .title(Component.translatable("item." + CobblemonArmory.MOD_ID + ".cobblemon_armory"))
                    .icon(() -> new ItemStack(ItemRegistry.COBBLEMON_SMITHING_UPGRADE))
                    .displayItems((parameters, output) -> {

                        //Items
                        output.accept(ItemRegistry.COBBLEMON_SMITHING_UPGRADE);
                        output.accept(ItemRegistry.CHARIZARD_SCALES);
                        output.accept(ItemRegistry.PRIMEAPE_FUR);
                        output.accept(ItemRegistry.BASTIODON_SKULL);
                        output.accept(ItemRegistry.EEVEE_FUR);
                        output.accept(ItemRegistry.HAXORUS_SHARD);
                        output.accept(ItemRegistry.STARMIE_PIECES);
                        output.accept(ItemRegistry.TINKATON_HAMMER_PIECE);
                        output.accept(ItemRegistry.TINKATON_HANDLE_PIECE);
                        output.accept(ItemRegistry.RAYQUAZA_SCALE);
                        output.accept(ItemRegistry.BLASTOISE_SHELL);
                        output.accept(ItemRegistry.BLAZIKEN_FEATHERS);
                        output.accept(ItemRegistry.CINDERACE_FUR);
                        output.accept(ItemRegistry.DECIDUEYE_FEATHERS);
                        output.accept(ItemRegistry.DELPHOX_FUR);
                        output.accept(ItemRegistry.EMBOAR_SKIN);
                        output.accept(ItemRegistry.EMPOLEON_HORNS);
                        output.accept(ItemRegistry.FERALIGATR_SCALE);
                        output.accept(ItemRegistry.INCINEROAR_FUR);
                        output.accept(ItemRegistry.INFERNAPE_PLATING);
                        output.accept(ItemRegistry.GRENINJA_SKIN);
                        output.accept(ItemRegistry.INTELEON_SHED);
                        output.accept(ItemRegistry.MEGANIUM_PETALS);
                        output.accept(ItemRegistry.SAMUROTT_PLATING);
                        output.accept(ItemRegistry.SCEPTILE_LEAVES);
                        output.accept(ItemRegistry.SERPERIOR_TAIL);
                        output.accept(ItemRegistry.SWAMPERT_SKIN);
                        output.accept(ItemRegistry.TORTERRA_SHELL);
                        output.accept(ItemRegistry.TYPHLOSION_FUR);
                        output.accept(ItemRegistry.VENUSAUR_FLOWER);
                        output.accept(ItemRegistry.METAGROSS_PLATE);
                        output.accept(ItemRegistry.CORVIKNIGHT_FEATHERS);

                        //Weapons
                        output.accept(ItemRegistry.TINKATON_HAMMER);
                        output.accept(ItemRegistry.STARMIE_SWORD);
                        output.accept(ItemRegistry.PRIMEAPE_GLOVES);
                        output.accept(ItemRegistry.SIRFETCHD_SWORD);
                        output.accept(ItemRegistry.BASTIODON_SHIELD);
                        output.accept(ItemRegistry.CERULEDGE_SWORD);
                        output.accept(ItemRegistry.ZACIAN_SWORD);
                        output.accept(ItemRegistry.METAGROSS_HAMMER);

                        //Trainer Hats
                        output.accept(ItemRegistry.REDS_HAT);
                        output.accept(ItemRegistry.LEAFS_HAT);
                        output.accept(ItemRegistry.ETHANS_HAT);
                        output.accept(ItemRegistry.KRISS_HAT);
                        output.accept(ItemRegistry.LYRAS_HAT);
                        output.accept(ItemRegistry.BRENDANS_HAT);
                        output.accept(ItemRegistry.MAYS_HAT);
                        output.accept(ItemRegistry.LUCASS_HAT);
                        output.accept(ItemRegistry.DAWNS_HAT);
                        output.accept(ItemRegistry.HILBERTS_HAT);
                        output.accept(ItemRegistry.HILDAS_HAT);
                        output.accept(ItemRegistry.NATES_HAT);
                        output.accept(ItemRegistry.ROSAS_HAT);
                        output.accept(ItemRegistry.CALEMS_HAT);
                        output.accept(ItemRegistry.SERENAS_HAT);
                        output.accept(ItemRegistry.ELIOS_HAT);
                        output.accept(ItemRegistry.SELENES_HAT);
                        output.accept(ItemRegistry.VICTORS_HAT);
                        output.accept(ItemRegistry.GLORIAS_HAT);

                        //Armors
                        output.accept(ItemRegistry.CHARIZARD_HELMET);
                        output.accept(ItemRegistry.CHARIZARD_CHESTPLATE);
                        output.accept(ItemRegistry.CHARIZARD_LEGGINGS);
                        output.accept(ItemRegistry.CHARIZARD_BOOTS);

                        output.accept(ItemRegistry.SHINY_CHARIZARD_HELMET);
                        output.accept(ItemRegistry.SHINY_CHARIZARD_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_CHARIZARD_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_CHARIZARD_BOOTS);

                        output.accept(ItemRegistry.SQUIRTLE_GLASSES);

                        output.accept(ItemRegistry.TORTERRA_HELMET);
                        output.accept(ItemRegistry.TORTERRA_CHESTPLATE);
                        output.accept(ItemRegistry.TORTERRA_LEGGINGS);
                        output.accept(ItemRegistry.TORTERRA_BOOTS);

                        output.accept(ItemRegistry.SHINY_TORTERRA_HELMET);
                        output.accept(ItemRegistry.SHINY_TORTERRA_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_TORTERRA_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_TORTERRA_BOOTS);

                        output.accept(ItemRegistry.BLAZIKEN_HELMET);
                        output.accept(ItemRegistry.BLAZIKEN_CHESTPLATE);
                        output.accept(ItemRegistry.BLAZIKEN_LEGGINGS);
                        output.accept(ItemRegistry.BLAZIKEN_BOOTS);

                        output.accept(ItemRegistry.SHINY_BLAZIKEN_HELMET);
                        output.accept(ItemRegistry.SHINY_BLAZIKEN_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_BLAZIKEN_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_BLAZIKEN_BOOTS);

                        output.accept(ItemRegistry.ARMAROUGE_HELMET);
                        output.accept(ItemRegistry.ARMAROUGE_CHESTPLATE);
                        output.accept(ItemRegistry.ARMAROUGE_LEGGINGS);
                        output.accept(ItemRegistry.ARMAROUGE_BOOTS);

                        output.accept(ItemRegistry.CERULEDGE_HELMET);
                        output.accept(ItemRegistry.CERULEDGE_CHESTPLATE);
                        output.accept(ItemRegistry.CERULEDGE_LEGGINGS);
                        output.accept(ItemRegistry.CERULEDGE_BOOTS);

                        output.accept(ItemRegistry.HAXORUS_HELMET);
                        output.accept(ItemRegistry.HAXORUS_CHESTPLATE);
                        output.accept(ItemRegistry.HAXORUS_LEGGINGS);
                        output.accept(ItemRegistry.HAXORUS_BOOTS);

                        output.accept(ItemRegistry.SHINY_HAXORUS_HELMET);
                        output.accept(ItemRegistry.SHINY_HAXORUS_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_HAXORUS_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_HAXORUS_BOOTS);

                        output.accept(ItemRegistry.CORVIKNIGHT_HELMET);
                        output.accept(ItemRegistry.CORVIKNIGHT_CHESTPLATE);
                        output.accept(ItemRegistry.CORVIKNIGHT_LEGGINGS);
                        output.accept(ItemRegistry.CORVIKNIGHT_BOOTS);

                        output.accept(ItemRegistry.SHINY_CORVIKNIGHT_HELMET);
                        output.accept(ItemRegistry.SHINY_CORVIKNIGHT_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_CORVIKNIGHT_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_CORVIKNIGHT_BOOTS);

                        output.accept(ItemRegistry.EEVEE_HELMET);
                        output.accept(ItemRegistry.EEVEE_CHESTPLATE);
                        output.accept(ItemRegistry.EEVEE_LEGGINGS);
                        output.accept(ItemRegistry.EEVEE_BOOTS);

                        output.accept(ItemRegistry.SHINY_EEVEE_HELMET);
                        output.accept(ItemRegistry.SHINY_EEVEE_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_EEVEE_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_EEVEE_BOOTS);

                        output.accept(ItemRegistry.ESPEON_HELMET);
                        output.accept(ItemRegistry.ESPEON_CHESTPLATE);
                        output.accept(ItemRegistry.ESPEON_LEGGINGS);
                        output.accept(ItemRegistry.ESPEON_BOOTS);

                        output.accept(ItemRegistry.SHINY_ESPEON_HELMET);
                        output.accept(ItemRegistry.SHINY_ESPEON_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_ESPEON_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_ESPEON_BOOTS);

                        output.accept(ItemRegistry.FLAREON_HELMET);
                        output.accept(ItemRegistry.FLAREON_CHESTPLATE);
                        output.accept(ItemRegistry.FLAREON_LEGGINGS);
                        output.accept(ItemRegistry.FLAREON_BOOTS);

                        output.accept(ItemRegistry.SHINY_FLAREON_HELMET);
                        output.accept(ItemRegistry.SHINY_FLAREON_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_FLAREON_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_FLAREON_BOOTS);

                        output.accept(ItemRegistry.GLACEON_HELMET);
                        output.accept(ItemRegistry.GLACEON_CHESTPLATE);
                        output.accept(ItemRegistry.GLACEON_LEGGINGS);
                        output.accept(ItemRegistry.GLACEON_BOOTS);

                        output.accept(ItemRegistry.SHINY_GLACEON_HELMET);
                        output.accept(ItemRegistry.SHINY_GLACEON_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_GLACEON_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_GLACEON_BOOTS);

                        output.accept(ItemRegistry.JOLTEON_HELMET);
                        output.accept(ItemRegistry.JOLTEON_CHESTPLATE);
                        output.accept(ItemRegistry.JOLTEON_LEGGINGS);
                        output.accept(ItemRegistry.JOLTEON_BOOTS);

                        output.accept(ItemRegistry.SHINY_JOLTEON_HELMET);
                        output.accept(ItemRegistry.SHINY_JOLTEON_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_JOLTEON_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_JOLTEON_BOOTS);

                        output.accept(ItemRegistry.LEAFEON_HELMET);
                        output.accept(ItemRegistry.LEAFEON_CHESTPLATE);
                        output.accept(ItemRegistry.LEAFEON_LEGGINGS);
                        output.accept(ItemRegistry.LEAFEON_BOOTS);

                        output.accept(ItemRegistry.SHINY_LEAFEON_HELMET);
                        output.accept(ItemRegistry.SHINY_LEAFEON_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_LEAFEON_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_LEAFEON_BOOTS);

                        output.accept(ItemRegistry.SYLVEON_HELMET);
                        output.accept(ItemRegistry.SYLVEON_CHESTPLATE);
                        output.accept(ItemRegistry.SYLVEON_LEGGINGS);
                        output.accept(ItemRegistry.SYLVEON_BOOTS);

                        output.accept(ItemRegistry.SHINY_SYLVEON_HELMET);
                        output.accept(ItemRegistry.SHINY_SYLVEON_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_SYLVEON_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_SYLVEON_BOOTS);

                        output.accept(ItemRegistry.UMBREON_HELMET);
                        output.accept(ItemRegistry.UMBREON_CHESTPLATE);
                        output.accept(ItemRegistry.UMBREON_LEGGINGS);
                        output.accept(ItemRegistry.UMBREON_BOOTS);

                        output.accept(ItemRegistry.SHINY_UMBREON_HELMET);
                        output.accept(ItemRegistry.SHINY_UMBREON_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_UMBREON_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_UMBREON_BOOTS);

                        output.accept(ItemRegistry.VAPOREON_HELMET);
                        output.accept(ItemRegistry.VAPOREON_CHESTPLATE);
                        output.accept(ItemRegistry.VAPOREON_LEGGINGS);
                        output.accept(ItemRegistry.VAPOREON_BOOTS);

                        output.accept(ItemRegistry.SHINY_VAPOREON_HELMET);
                        output.accept(ItemRegistry.SHINY_VAPOREON_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_VAPOREON_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_VAPOREON_BOOTS);

                        output.accept(ItemRegistry.RAYQUAZA_HELMET);
                        output.accept(ItemRegistry.RAYQUAZA_CHESTPLATE);
                        output.accept(ItemRegistry.RAYQUAZA_LEGGINGS);
                        output.accept(ItemRegistry.RAYQUAZA_BOOTS);

                        output.accept(ItemRegistry.SHINY_RAYQUAZA_HELMET);
                        output.accept(ItemRegistry.SHINY_RAYQUAZA_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_RAYQUAZA_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_RAYQUAZA_BOOTS);

                        output.accept(ItemRegistry.METAGROSS_HELMET);
                        output.accept(ItemRegistry.METAGROSS_CHESTPLATE);
                        output.accept(ItemRegistry.METAGROSS_LEGGINGS);
                        output.accept(ItemRegistry.METAGROSS_BOOTS);

                        output.accept(ItemRegistry.SHINY_METAGROSS_HELMET);
                        output.accept(ItemRegistry.SHINY_METAGROSS_CHESTPLATE);
                        output.accept(ItemRegistry.SHINY_METAGROSS_LEGGINGS);
                        output.accept(ItemRegistry.SHINY_METAGROSS_BOOTS);

                        output.accept(ItemRegistry.GALARIAN_WEEZING_HAT);

                        output.accept(ItemRegistry.SLOWKING_CROWN);

                        output.accept(ItemRegistry.GRENINJA_SCARF);



                    })
                    .build()
    );
}
