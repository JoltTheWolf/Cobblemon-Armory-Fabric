/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class ArmorySmithingSerializer implements RecipeSerializer<ArmorySmithingRecipe> {

    public static final ResourceLocation ID =
            ResourceLocation.fromNamespaceAndPath("cobblemonarmory", "armory_smithing");

    public static final ArmorySmithingSerializer INSTANCE = new ArmorySmithingSerializer();

    public static void register() {
        Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, ID, INSTANCE);
    }

    public record TemplateSpec(Item item) {
        public static final MapCodec<TemplateSpec> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(TemplateSpec::item)
        ).apply(inst, TemplateSpec::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, TemplateSpec> STREAM_CODEC =
                StreamCodec.composite(
                        ByteBufCodecs.registry(Registries.ITEM), TemplateSpec::item,
                        TemplateSpec::new
                );
    }

    public record BaseSpec(Item item) {
        public static final MapCodec<BaseSpec> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(BaseSpec::item)
        ).apply(inst, BaseSpec::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, BaseSpec> STREAM_CODEC =
                StreamCodec.composite(
                        ByteBufCodecs.registry(Registries.ITEM), BaseSpec::item,
                        BaseSpec::new
                );
    }

    public record AdditionSpec(Item item, ResourceLocation materialId) {
        public static final MapCodec<AdditionSpec> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(AdditionSpec::item),
                ResourceLocation.CODEC.fieldOf("material_id").forGetter(AdditionSpec::materialId)
        ).apply(inst, AdditionSpec::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, AdditionSpec> STREAM_CODEC =
                StreamCodec.composite(
                        ByteBufCodecs.registry(Registries.ITEM), AdditionSpec::item,
                        ResourceLocation.STREAM_CODEC, AdditionSpec::materialId,
                        AdditionSpec::new
                );
    }

    public record ResultSpec(Item item, ResourceLocation armorSetId, int customModelData) {
        public static final MapCodec<ResultSpec> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(ResultSpec::item),
                ResourceLocation.CODEC.fieldOf("armor_set_id").forGetter(ResultSpec::armorSetId),
                Codec.INT.fieldOf("custom_model_data").forGetter(ResultSpec::customModelData)
        ).apply(inst, ResultSpec::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, ResultSpec> STREAM_CODEC =
                StreamCodec.composite(
                        ByteBufCodecs.registry(Registries.ITEM), ResultSpec::item,
                        ResourceLocation.STREAM_CODEC, ResultSpec::armorSetId,
                        ByteBufCodecs.INT, ResultSpec::customModelData,
                        ResultSpec::new
                );
    }

    public static final MapCodec<ArmorySmithingRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            TemplateSpec.CODEC.fieldOf("template").forGetter(ArmorySmithingRecipe::template),
            BaseSpec.CODEC.fieldOf("base").forGetter(ArmorySmithingRecipe::base),
            AdditionSpec.CODEC.fieldOf("addition").forGetter(ArmorySmithingRecipe::addition),
            ResultSpec.CODEC.fieldOf("result").forGetter(ArmorySmithingRecipe::result)
    ).apply(inst, ArmorySmithingRecipe::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, ArmorySmithingRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    TemplateSpec.STREAM_CODEC, ArmorySmithingRecipe::template,
                    BaseSpec.STREAM_CODEC, ArmorySmithingRecipe::base,
                    AdditionSpec.STREAM_CODEC, ArmorySmithingRecipe::addition,
                    ResultSpec.STREAM_CODEC, ArmorySmithingRecipe::result,
                    ArmorySmithingRecipe::new
            );

    @Override public MapCodec<ArmorySmithingRecipe> codec() { return CODEC; }
    @Override public StreamCodec<RegistryFriendlyByteBuf, ArmorySmithingRecipe> streamCodec() { return STREAM_CODEC; }
}
