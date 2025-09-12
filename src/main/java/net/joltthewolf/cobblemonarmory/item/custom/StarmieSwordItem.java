package net.joltthewolf.cobblemonarmory.item.custom;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.SingletonGeoAnimatable;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;


public final class StarmieSwordItem extends Item implements GeoItem {
    private static final RawAnimation ACTIVATE = RawAnimation.begin().thenPlay("use.activate");
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    public StarmieSwordItem(Settings settings) {
        super(settings.maxDamage(500));
        // enables network sync for triggerAnim
        SingletonGeoAnimatable.registerSyncedAnimatable(this);
    }

    // Geckolib controllers
    public void registerControllers(AnimatableManager.ControllerRegistrar ctrls) {
        ctrls.add(new AnimationController<>(this, "Activation", 0, state -> PlayState.STOP)
                .triggerableAnim("activate", ACTIVATE));
    }

    // Right-click to trigger animation
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            long id = GeoItem.getId(user.getStackInHand(hand));
            this.triggerAnim(user, id, "Activation", "activate");
        }
        return TypedActionResult.pass(user.getStackInHand(hand));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
