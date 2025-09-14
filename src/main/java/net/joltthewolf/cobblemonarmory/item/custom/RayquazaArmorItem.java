package net.joltthewolf.cobblemonarmory.item.custom;

import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.registry.entry.RegistryEntry;

import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import net.joltthewolf.cobblemonarmory.client.renderer.RayquazaArmorRenderer;


public class RayquazaArmorItem extends ArmorItem implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);

    // Assigned later during material registration.
    public static RegistryEntry<ArmorMaterial> ARMOR_MATERIAL = null;

    public RayquazaArmorItem(Type type, Item.Settings settings) {
        super(ARMOR_MATERIAL, type, settings);
    }

    @Override
    public void createGeoRenderer(java.util.function.Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private RayquazaArmorRenderer renderer;

            public RayquazaArmorRenderer getGeoArmorRenderer() {
                if (renderer == null) {
                    renderer = new RayquazaArmorRenderer();
                }
                return renderer;
            }
        });
    }



    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "idle", 5, this::idlePredicate));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }

    private PlayState idlePredicate(AnimationState<?> state) {
        state.getController().setAnimation(RawAnimation.begin().thenLoop("idle"));
        return PlayState.CONTINUE;
    }
}
