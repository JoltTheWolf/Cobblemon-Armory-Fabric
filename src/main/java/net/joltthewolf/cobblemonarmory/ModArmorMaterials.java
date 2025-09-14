package net.joltthewolf.cobblemonarmory;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public final class ModArmorMaterials {
    private ModArmorMaterials() {}

    public static RegistryEntry<ArmorMaterial> register(
            String id,
            Map<ArmorItem.Type, Integer> defensePoints,
            int enchantability,
            RegistryEntry<SoundEvent> equipSound,   // <-- accept RegistryEntry directly
            Supplier<Ingredient> repairIngredient,
            float toughness,
            float knockbackResistance,
            boolean dyeable
    ) {
        ArmorMaterial material = new ArmorMaterial(
                defensePoints,
                enchantability,
                equipSound, // <-- pass through
                repairIngredient,
                List.of(new ArmorMaterial.Layer(Identifier.of("cobblemonarmory", id))),
                toughness,
                knockbackResistance
        );

        Identifier identifier = Identifier.of("cobblemonarmory", id);
        Registry.register(Registries.ARMOR_MATERIAL, identifier, material);

        RegistryKey<ArmorMaterial> key = RegistryKey.of(RegistryKeys.ARMOR_MATERIAL, identifier);
        return Registries.ARMOR_MATERIAL
                .getEntry(key)
                .orElseThrow(() -> new IllegalStateException("ArmorMaterial not registered: " + identifier));
    }
}
