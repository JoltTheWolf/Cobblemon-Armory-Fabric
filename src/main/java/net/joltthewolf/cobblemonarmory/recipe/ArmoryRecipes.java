package net.joltthewolf.cobblemonarmory.recipe;

import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;


public final class ArmoryRecipes {

    public static void register() {
        Registry.register(
                BuiltInRegistries.RECIPE_SERIALIZER,
                ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "armory_crafting"),
                new ArmoryCraftingSerializer()
        );
    }
}

