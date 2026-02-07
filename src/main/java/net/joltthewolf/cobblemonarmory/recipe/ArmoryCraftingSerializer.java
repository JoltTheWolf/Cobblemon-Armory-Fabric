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

public class ArmoryCraftingSerializer implements RecipeSerializer<ArmoryCraftingRecipe> {

    // Serializer ID used in recipe JSON:
    // "type": "cobblemonarmory:armory_crafting"
    public static final ResourceLocation ID =
            ResourceLocation.fromNamespaceAndPath("cobblemonarmory", "armory_crafting");

    // Use a singleton instance
    public static final ArmoryCraftingSerializer INSTANCE = new ArmoryCraftingSerializer();

    /**
     * Call this once during mod init (onInitialize) to register the serializer.
     */
    public static void register() {
        Registry.register(BuiltInRegistries.RECIPE_SERIALIZER, ID, INSTANCE);
    }

    // ----------------------------
    // Ingredient + Result specs
    // ----------------------------
    public record IngredientSpec(Item item, ResourceLocation materialId, int count) {
        public static final MapCodec<IngredientSpec> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
                BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(IngredientSpec::item),
                ResourceLocation.CODEC.fieldOf("material_id").forGetter(IngredientSpec::materialId),
                Codec.INT.fieldOf("count").forGetter(IngredientSpec::count)
        ).apply(inst, IngredientSpec::new));

        public static final StreamCodec<RegistryFriendlyByteBuf, IngredientSpec> STREAM_CODEC =
                StreamCodec.composite(
                        ByteBufCodecs.registry(Registries.ITEM), IngredientSpec::item,
                        ResourceLocation.STREAM_CODEC, IngredientSpec::materialId,
                        ByteBufCodecs.INT, IngredientSpec::count,
                        IngredientSpec::new
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

    // ----------------------------
    // Recipe codecs
    // ----------------------------
    public static final MapCodec<ArmoryCraftingRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            IngredientSpec.CODEC.fieldOf("ingredient").forGetter(ArmoryCraftingRecipe::ingredient),
            ResultSpec.CODEC.fieldOf("result").forGetter(ArmoryCraftingRecipe::result)
    ).apply(inst, ArmoryCraftingRecipe::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, ArmoryCraftingRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    IngredientSpec.STREAM_CODEC, ArmoryCraftingRecipe::ingredient,
                    ResultSpec.STREAM_CODEC, ArmoryCraftingRecipe::result,
                    ArmoryCraftingRecipe::new
            );

    @Override
    public MapCodec<ArmoryCraftingRecipe> codec() {
        return CODEC;
    }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, ArmoryCraftingRecipe> streamCodec() {
        return STREAM_CODEC;
    }
}
