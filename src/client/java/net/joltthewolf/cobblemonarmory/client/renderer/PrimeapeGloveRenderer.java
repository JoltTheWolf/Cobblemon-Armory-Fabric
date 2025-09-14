package net.joltthewolf.cobblemonarmory.client.renderer;

import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;

/**
 * Fabric/Yarn 1.21.1 built-in item renderer.
 * (No reference to BuiltinModelItemRenderer.)
 */
public class PrimeapeGloveRenderer implements BuiltinItemRendererRegistry.DynamicItemRenderer {
    @Override
    public void render(ItemStack stack,
                       ModelTransformationMode mode,
                       MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers,
                       int light,
                       int overlay) {

    }
}
