package net.joltthewolf.cobblemonarmory.recipe;

import net.joltthewolf.cobblemonarmory.registry.ComponentRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomModelData;

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

    public ArmoryCraftingSerializer.IngredientSpec ingredient() {
        return ingredient;
    }

    public ArmoryCraftingSerializer.ResultSpec result() {
        return result;
    }

    @Override
    public boolean matches(CraftingInput input, Level level) {
        int found = 0;

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (stack.isEmpty()) continue;

            // Only allow the specified ingredient item in the grid
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

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        ItemStack preview = new ItemStack(result.item());
        preview.set(ComponentRegistry.ARMOR_SET_ID, result.armorSetId());
        preview.set(DataComponents.CUSTOM_MODEL_DATA, new CustomModelData(result.customModelData()));
        return preview;
    }

    // --- IMPORTANT: consume the correct total count across the grid ---
    @Override
    public NonNullList<ItemStack> getRemainingItems(CraftingInput input) {
        NonNullList<ItemStack> remaining = NonNullList.withSize(input.size(), ItemStack.EMPTY);

        int toConsume = ingredient.count();

        for (int i = 0; i < input.size(); i++) {
            ItemStack stack = input.getItem(i);
            if (stack.isEmpty()) continue;

            // matches() already guarantees only our ingredient item + correct material are present
            int take = Math.min(toConsume, stack.getCount());
            toConsume -= take;

            ItemStack after = stack.copy();
            after.shrink(take);

            // Note: vanilla will also remove 1 per non-empty slot before applying remaining.
            // So we "refund" that 1 by adding it back when needed:
            // If we consumed at least 1 from this slot, vanilla removes 1 anyway, so add it back.
            if (take > 0) {
                after.grow(1);
            }

            remaining.set(i, after.isEmpty() ? ItemStack.EMPTY : after);

            if (toConsume <= 0) {
                // For any later slots: they weren't supposed to be consumed.
                // vanilla would remove 1 from them if non-empty, so we must "refund" that too.
                for (int j = i + 1; j < input.size(); j++) {
                    ItemStack s2 = input.getItem(j);
                    if (!s2.isEmpty()) {
                        ItemStack refund = s2.copy();
                        refund.grow(1); // refund vanilla’s -1
                        remaining.set(j, refund);
                    }
                }
                break;
            }
        }

        return remaining;
    }

    // Recipe book / client helpers (won’t encode material_id, but keeps vanilla happy)
    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(Ingredient.of(ingredient.item()));
        return list;
    }

    // Your mappings require this method
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 1;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ArmoryCraftingSerializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return RecipeType.CRAFTING;
    }
}
