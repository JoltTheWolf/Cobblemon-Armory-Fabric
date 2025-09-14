package net.joltthewolf.cobblemonarmory;

import net.fabricmc.api.ModInitializer;
import net.joltthewolf.cobblemonarmory.item.ModItemGroups;
import net.joltthewolf.cobblemonarmory.item.ModItems;
import net.joltthewolf.cobblemonarmory.item.custom.RayquazaArmorItem;
import net.joltthewolf.cobblemonarmory.util.ModLootTableModifiers;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class CobblemonArmory implements ModInitializer {
	public static final String MOD_ID = "cobblemonarmory";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        LOGGER.info("Cobblemon:Armory is loading!");
        RayquazaArmorItem.ARMOR_MATERIAL = ModArmorMaterials.register(
                "rayquaza_armor",
                Map.of(
                        ArmorItem.Type.BOOTS, 3,
                        ArmorItem.Type.LEGGINGS, 6,
                        ArmorItem.Type.CHESTPLATE, 8,
                        ArmorItem.Type.HELMET, 3,
                        ArmorItem.Type.BODY, 8
                ),
                12,
                SoundEvents.ITEM_ARMOR_EQUIP_IRON,      // ← pass SoundEvent, not RegistryEntry
                () -> Ingredient.ofItems(Items.DIAMOND),
                2.5f,
                0.0f,
                false
        );
        
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModLootTableModifiers.modifyLootTables();
    }
}