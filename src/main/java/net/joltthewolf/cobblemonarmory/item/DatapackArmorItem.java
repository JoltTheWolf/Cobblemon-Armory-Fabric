/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.item;


import net.joltthewolf.cobblemonarmory.client.DatapackArmorRenderer;
import net.joltthewolf.cobblemonarmory.registry.ComponentRegistry;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.animation.AnimatableManager;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import java.util.List;




import java.util.function.Consumer;

public class DatapackArmorItem extends ArmorItem implements GeoItem {

    private  final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public DatapackArmorItem(Holder<ArmorMaterial> material, Type type, Properties props) {
        super(material, type, props);
    }

    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        ResourceLocation id = getSetId(stack);
        tooltip.add(Component.literal("set_id =" + (id == null ? "null" : id.toString())));
    }


    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
    }


    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    public static ResourceLocation getSetId(ItemStack stack) {
        return stack.get(ComponentRegistry.ARMOR_SET_ID);
    }

    public static String pieceSuffixFor(Type type) {
        return switch (type) {
            case HELMET -> "helmet";
            case CHESTPLATE -> "chestplate";
            case LEGGINGS -> "leggings";
            case BOOTS -> "boots";
            default -> "helmet";
        };
    }


    public static Type getArmorType(ItemStack stack) {
        if (stack.getItem() instanceof DatapackArmorItem item) {
            return item.getType();
        }
        return Type.HELMET;
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private DatapackArmorRenderer renderer;
            private ItemStack lastStack = ItemStack.EMPTY;

            @Override
            public <T extends LivingEntity> HumanoidModel<?> getGeoArmorRenderer(
                    @Nullable T livingEntity,
                    ItemStack itemStack,
                    @Nullable EquipmentSlot equipmentSlot,
                    @Nullable HumanoidModel<T> original) {

                this.lastStack = itemStack;

                if (this.renderer == null)
                    this.renderer = new DatapackArmorRenderer();

                this.renderer.setCurrentStack(itemStack);

                return this.renderer;
            }
        });
    }
}
