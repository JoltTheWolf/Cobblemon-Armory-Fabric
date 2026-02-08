/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.command;

import com.mojang.brigadier.CommandDispatcher;
import net.joltthewolf.cobblemonarmory.registry.ComponentRegistry;
import net.minecraft.ChatFormatting;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.registries.BuiltInRegistries;

public final class ArmoryDebugCommand {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(
                Commands.literal("carmory")
                        .then(Commands.literal("debugheld")
                                .executes(ctx -> debugHeld(ctx.getSource())))
        );
    }

    private static int debugHeld(CommandSourceStack source) {
        ServerPlayer player;
        try {
            player = source.getPlayerOrException();
        } catch (Exception e) {
            source.sendFailure(Component.literal("This command must be run by a player."));
            return 0;
        }

        ItemStack stack = player.getMainHandItem();
        if (stack.isEmpty()) {
            source.sendFailure(Component.literal("Main hand is empty."));
            return 0;
        }

        ResourceLocation itemId = BuiltInRegistries.ITEM.getKey(stack.getItem());

        var cmdObj = stack.get(DataComponents.CUSTOM_MODEL_DATA); // CustomModelData or null
        Integer cmd = (cmdObj == null) ? null : cmdObj.value();
        ResourceLocation armorSet = stack.get(ComponentRegistry.ARMOR_SET_ID); // may be null
        ResourceLocation materialId = stack.get(ComponentRegistry.MATERIAL_ID); // may be null

        // Pretty output
        source.sendSuccess(() -> Component.literal("CobblemonArmory Debug (Held Item)")
                .withStyle(ChatFormatting.GOLD), false);

        source.sendSuccess(() -> Component.literal("Item: ").withStyle(ChatFormatting.YELLOW)
                .append(Component.literal(String.valueOf(itemId)).withStyle(ChatFormatting.WHITE)), false);

        source.sendSuccess(() -> Component.literal("Count: ").withStyle(ChatFormatting.YELLOW)
                .append(Component.literal(String.valueOf(stack.getCount())).withStyle(ChatFormatting.WHITE)), false);

        source.sendSuccess(() -> Component.literal("custom_model_data: ").withStyle(ChatFormatting.YELLOW)
                .append(Component.literal(cmd == null ? "null" : cmd.toString()).withStyle(ChatFormatting.WHITE)), false);

        source.sendSuccess(() -> Component.literal("armor_set_id: ").withStyle(ChatFormatting.YELLOW)
                .append(Component.literal(armorSet == null ? "null" : armorSet.toString()).withStyle(ChatFormatting.WHITE)), false);

        source.sendSuccess(() -> Component.literal("material_id: ").withStyle(ChatFormatting.YELLOW)
                .append(Component.literal(materialId == null ? "null" : materialId.toString()).withStyle(ChatFormatting.WHITE)), false);

        return 1;
    }
}
