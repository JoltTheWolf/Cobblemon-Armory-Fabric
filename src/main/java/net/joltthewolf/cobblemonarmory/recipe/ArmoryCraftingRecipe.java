package net.joltthewolf.cobblemonarmory.recipe;

import net.joltthewolf.cobblemonarmory.registry.ComponentRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomModelData;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public class ArmoryCraftingRecipe implements Recipe<CraftingInput> {

    private final ArmoryCraftingSerializer.IngredientSpec ingredient;
    private final ArmoryCraftingSerializer.ResultSpec result;

    public ArmoryCraftingRecipe(
            ArmoryCraftingSerializer.IngredientSpec ingredient,
            ArmoryCraftingSerializer.ResultSpec result
    ) {
        this.ingredient = ingredient;
        this.result = result;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        ItemStack preview = new ItemStack(result.item());
        preview.set(ComponentRegistry.ARMOR_SET_ID, result.armorSetId());
        preview.set(DataComponents.CUSTOM_MODEL_DATA,
                new net.minecraft.world.item.component.CustomModelData(result.customModelData()));
        return preview;
    }


    public ArmoryCraftingSerializer.IngredientSpec ingredient() { return ingredient; }
    public ArmoryCraftingSerializer.ResultSpec result() { return result; }

    @Override
    public boolean matches(CraftingInput input, Level level) {
        int found = 0;

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (stack.isEmpty()) continue;

            if (stack.getItem() != ingredient.item()) return false;

            ResourceLocation mat = stack.get(ComponentRegistry.MATERIAL_ID);
            if (mat == null || !mat.equals(ingredient.materialId())) return false;

            found += stack.getCount();
        }

        return found >= ingredient.count();
    }

    @Override
    public ItemStack assemble(CraftingInput input, HolderLookup.Provider registries) {
        ItemStack out = new ItemStack(result.item());
        out.set(ComponentRegistry.ARMOR_SET_ID, result.armorSetId());
        out.set(DataComponents.CUSTOM_MODEL_DATA, new CustomModelData(result.customModelData()));
        return out;
    }

    // Keep this (your mappings require it)
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 1;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ArmoryRecipes.ARMORY_CRAFTING_SERIALIZER;
    }

    @Override
    public RecipeType<?> getType() {
        return RecipeType.CRAFTING;
    }
}
