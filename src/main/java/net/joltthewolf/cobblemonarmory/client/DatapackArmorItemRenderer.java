/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.joltthewolf.cobblemonarmory.item.DatapackArmorItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class DatapackArmorItemRenderer extends GeoItemRenderer<DatapackArmorItem> {

    public DatapackArmorItemRenderer() {
        super(new DatapackArmorItemModel()); // can be unused now; kept to satisfy Geo
    }

    @Override
    public void renderByItem(ItemStack stack,
                             ItemDisplayContext displayContext,
                             PoseStack poseStack,
                             MultiBufferSource bufferSource,
                             int packedLight,
                             int packedOverlay) {

        ResourceLocation setId = DatapackArmorItem.getSetId(stack);
        if (setId == null) {
            // fallback: render the item’s own model if no set id
            Minecraft.getInstance().getItemRenderer().renderStatic(
                    stack, displayContext, packedLight, packedOverlay, poseStack, bufferSource,
                    Minecraft.getInstance().level, 0
            );
            return;
        }

        String piece = DatapackArmorItem.pieceSuffixFor(((DatapackArmorItem) stack.getItem()).getType());
        ResourceLocation modelId = ResourceLocation.fromNamespaceAndPath(
                setId.getNamespace(),
                setId.getPath() + "_" + piece
        );

        // Baked model for assets/<ns>/models/item/<path>.json
        ModelResourceLocation mrl = new ModelResourceLocation(modelId, "inventory");
        BakedModel baked = Minecraft.getInstance().getModelManager().getModel(mrl);

        boolean leftHand = displayContext == ItemDisplayContext.FIRST_PERSON_LEFT_HAND
                || displayContext == ItemDisplayContext.THIRD_PERSON_LEFT_HAND;

        Minecraft.getInstance().getItemRenderer().render(
                stack, displayContext, leftHand, poseStack, bufferSource,
                packedLight, packedOverlay, baked
        );
    }
}
