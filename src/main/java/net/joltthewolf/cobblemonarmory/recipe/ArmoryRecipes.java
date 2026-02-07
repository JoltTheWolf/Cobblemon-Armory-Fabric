package net.joltthewolf.cobblemonarmory.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.joltthewolf.cobblemonarmory.CobblemonArmory;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;

public final class ArmoryRecipes {

    public static final RecipeSerializer<ArmoryCraftingRecipe> ARMORY_CRAFTING_SERIALIZER =
            Registry.register(BuiltInRegistries.RECIPE_SERIALIZER,
                    ResourceLocation.fromNamespaceAndPath(CobblemonArmory.MOD_ID, "armory_crafting"),
                    new ArmoryCraftingSerializer());

    public static void init() {}
}
