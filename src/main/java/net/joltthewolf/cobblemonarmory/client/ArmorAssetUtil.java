/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.client;

import net.minecraft.resources.ResourceLocation;

public final class ArmorAssetUtil {
    private ArmorAssetUtil() {}

    private static String sharedKey(ResourceLocation setId) {
        return setId.getPath() + "_armor";
    }

    public static ResourceLocation geo(ResourceLocation setId) {
        return ResourceLocation.fromNamespaceAndPath(
                setId.getNamespace(),
                "geo/item/armor/" + sharedKey(setId) + ".geo.json"
        );
    }

    public static ResourceLocation texture(ResourceLocation setId) {
        return ResourceLocation.fromNamespaceAndPath(
                setId.getNamespace(),
                "textures/item/armor/" + sharedKey(setId) + ".png"
        );
    }

    public static ResourceLocation animation(ResourceLocation setId) {
        return ResourceLocation.fromNamespaceAndPath(
                setId.getNamespace(),
                "animations/item/armor/" + sharedKey(setId) + ".animation.json"
        );
    }
}
