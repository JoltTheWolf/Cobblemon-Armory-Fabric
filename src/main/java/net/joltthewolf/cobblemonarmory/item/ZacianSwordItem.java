package net.joltthewolf.cobblemonarmory.item;

import net.joltthewolf.cobblemonarmory.client.renderer.item.ZacianSwordRenderer;
import net.joltthewolf.cobblemonarmory.registry.ItemRegistry;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.SingletonGeoAnimatable;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

public class ZacianSwordItem extends SwordItem implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    private static final ResourceLocation ATTACK_DAMAGE_ID =
            ResourceLocation.fromNamespaceAndPath("cobblemonarmory", "zacian_sword_attack_damage");
    private static final ResourceLocation ATTACK_SPEED_ID  =
            ResourceLocation.fromNamespaceAndPath("cobblemonarmory", "zacian_sword_attack_speed");

    private static final ItemAttributeModifiers DEFAULTS = ItemAttributeModifiers.builder()
            .add(Attributes.ATTACK_DAMAGE,
                    new AttributeModifier(ATTACK_DAMAGE_ID, 7.0, AttributeModifier.Operation.ADD_VALUE),
                    EquipmentSlotGroup.MAINHAND)
            .add(Attributes.ATTACK_SPEED,
                    new AttributeModifier(ATTACK_SPEED_ID, -2.4, AttributeModifier.Operation.ADD_VALUE),
                    EquipmentSlotGroup.MAINHAND)
            .build();

    public ZacianSwordItem(Properties properties) {
        super(Tiers.DIAMOND, properties.stacksTo(1).durability(1750));
        SingletonGeoAnimatable.registerSyncedAnimatable(this);
    }

    @Override
    public ItemAttributeModifiers getDefaultAttributeModifiers() {
        return DEFAULTS;
    }

    //Consume durability on use
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.hurtAndBreak(1, attacker, EquipmentSlot.MAINHAND);
        return true;
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level level, BlockState state,
                             BlockPos pos, LivingEntity miner) {
        if (!level.isClientSide && state.getDestroySpeed(level, pos) > 0) {
            stack.hurtAndBreak(2, miner, EquipmentSlot.MAINHAND);
        }
        return true;
    }

    /*@Override
    public boolean isValidRepairItem(ItemStack toRepair, ItemStack ingredient) {
        return ingredient.is(ItemRegistry.STARMIE_PIECES) || super.isValidRepairItem(toRepair, ingredient);
    }*/

    @Override
    public int getEnchantmentValue() {
        return 11;
    }
    //GeoRenderer Stuff
    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private ZacianSwordRenderer renderer;

            @Override
            @Nullable
            public BlockEntityWithoutLevelRenderer getGeoItemRenderer() {
                if (this.renderer == null)
                    this.renderer = new ZacianSwordRenderer();
                return this.renderer;
            }
        });
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        final RawAnimation IDLE = RawAnimation.begin().thenLoop("idle");
        controllers.add(new AnimationController<>(this, 0, state -> state.setAndContinue(IDLE)));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}
