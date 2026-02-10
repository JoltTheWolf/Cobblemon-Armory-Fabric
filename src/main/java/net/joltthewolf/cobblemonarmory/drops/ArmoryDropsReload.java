/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.drops;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.minecraft.server.packs.PackType;

public final class ArmoryDropsReload {
    private ArmoryDropsReload() {}

    public static void register() {
        ResourceManagerHelper.get(PackType.SERVER_DATA)
                .registerReloadListener(new ArmoryDrops.Loader());
    }
}
