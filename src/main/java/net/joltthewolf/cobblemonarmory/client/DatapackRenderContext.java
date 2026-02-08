/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.client;

import net.minecraft.resources.ResourceLocation;

public final class DatapackRenderContext {
    private DatapackRenderContext() {}

    private static final ThreadLocal<ResourceLocation> CURRENT_SET_ID = new ThreadLocal<>();

    public static void set(ResourceLocation id) { CURRENT_SET_ID.set(id); }
    public static ResourceLocation get() { return CURRENT_SET_ID.get(); }
    public static void clear() { CURRENT_SET_ID.remove(); }
}
