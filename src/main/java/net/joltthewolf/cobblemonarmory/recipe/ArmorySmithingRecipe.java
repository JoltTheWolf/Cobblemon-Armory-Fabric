/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.recipe;

import net.joltthewolf.cobblemonarmory.registry.ComponentRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.CustomModelData;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SmithingRecipe;
import net.minecraft.world.item.crafting.SmithingRecipeInput;
import net.minecraft.world.level.Level;

public class ArmorySmithingRecipe implements SmithingRecipe {

    private final ArmorySmithingSerializer.TemplateSpec template;
    private final ArmorySmithingSerializer.BaseSpec base;
    private final ArmorySmithingSerializer.AdditionSpec addition;
    private final ArmorySmithingSerializer.ResultSpec result;

    public ArmorySmithingRecipe(
            ArmorySmithingSerializer.TemplateSpec template,
            ArmorySmithingSerializer.BaseSpec base,
            ArmorySmithingSerializer.AdditionSpec addition,
            ArmorySmithingSerializer.ResultSpec result
    ) {
        this.template = template;
        this.base = base;
        this.addition = addition;
        this.result = result;
    }

    public ArmorySmithingSerializer.TemplateSpec template() { return template; }
    public ArmorySmithingSerializer.BaseSpec base() { return base; }
    public ArmorySmithingSerializer.AdditionSpec addition() { return addition; }
    public ArmorySmithingSerializer.ResultSpec result() { return result; }

    @Override
    public boolean matches(SmithingRecipeInput input, Level level) {
        ItemStack t = input.template();
        ItemStack b = input.base();
        ItemStack a = input.addition();

        if (t.isEmpty() || b.isEmpty() || a.isEmpty()) return false;

        // Template item
        if (t.getItem() != template.item()) return false;

        // Base = diamond helmet (or dp_helmet)
        if (b.getItem() != base.item()) return false;

        // Addition = dp_item + material_id check
        if (a.getItem() != addition.item()) return false;
        ResourceLocation mat = a.get(ComponentRegistry.MATERIAL_ID);
        return mat != null && mat.equals(addition.materialId());

    }



    @Override
    public ItemStack assemble(SmithingRecipeInput input, HolderLookup.Provider registries) {
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

    @Override public boolean isTemplateIngredient(ItemStack stack) { return stack.getItem() == template.item(); }
    @Override public boolean isBaseIngredient(ItemStack stack) { return stack.getItem() == base.item(); }
    @Override public boolean isAdditionIngredient(ItemStack stack) { return stack.getItem() == addition.item(); }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ArmorySmithingSerializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return RecipeType.SMITHING;
    }
}
