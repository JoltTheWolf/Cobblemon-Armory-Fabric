/*
 * Cobblemon: Armory
 * Copyright (c) 2026 JoltTheWolf
 * SPDX-License-Identifier: LicenseRef-Cobblemon-Armory
 */

package net.joltthewolf.cobblemonarmory.drops;

import com.google.gson.*;
import net.minecraft.resources.ResourceLocation;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.util.RandomSource;

import java.util.*;

public final class ArmoryDrops {
    private ArmoryDrops() {}

    private static final Map<ResourceLocation, DropTable> TABLES = new HashMap<>();

    public static void init() {

    }

    public static DropTable get(ResourceLocation target) {
        return TABLES.get(target);
    }

    public static final class DropTable {
        public final int amount;
        public final List<Entry> entries;

        public DropTable(int amount, List<Entry> entries) {
            this.amount = amount;
            this.entries = entries;
        }
    }

    public static final class Entry {
        public final ResourceLocation materialId;
        public final int customModelData;
        public final double percentage;
        public final IntRange quantityRange;

        public Entry(ResourceLocation materialId, int customModelData, double percentage, IntRange quantityRange) {
            this.materialId = materialId;
            this.customModelData = customModelData;
            this.percentage = percentage;
            this.quantityRange = quantityRange;
        }
    }

    public static final class IntRange {
        public final int min;
        public final int max;

        public IntRange(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int roll(RandomSource rand) {
            if (max <= min) return min;
            return min + rand.nextInt((max - min) + 1);
        }

        public static IntRange parse(String s) {
            if (s == null || s.isBlank()) return new IntRange(1, 1);
            String t = s.trim();
            int dash = t.indexOf('-');
            if (dash < 0) {
                int v = Integer.parseInt(t);
                return new IntRange(v, v);
            }
            int a = Integer.parseInt(t.substring(0, dash).trim());
            int b = Integer.parseInt(t.substring(dash + 1).trim());
            return new IntRange(Math.min(a, b), Math.max(a, b));
        }
    }

    public static final class Loader extends SimpleJsonResourceReloadListener implements IdentifiableResourceReloadListener {
        private static final Gson GSON = new GsonBuilder().create();

        // data/*/armory_drops/*.json
        public Loader() {
            super(GSON, "armory_drops");
        }

        @Override
        public ResourceLocation getFabricId() {
            return ResourceLocation.fromNamespaceAndPath("cobblemonarmory", "armory_drops");
        }


        @Override
        protected void apply(Map<ResourceLocation, JsonElement> objects,
                             ResourceManager resourceManager,
                             ProfilerFiller profiler) {
            TABLES.clear();

            for (Map.Entry<ResourceLocation, JsonElement> e : objects.entrySet()) {
                try {
                    JsonObject root = e.getValue().getAsJsonObject();

                    ResourceLocation target = ResourceLocation.parse(root.get("target").getAsString());

                    JsonObject drops = root.getAsJsonObject("drops");
                    int amount = drops.get("amount").getAsInt();

                    List<Entry> entries = new ArrayList<>();
                    JsonArray arr = drops.getAsJsonArray("entries");
                    for (JsonElement je : arr) {
                        JsonObject o = je.getAsJsonObject();
                        ResourceLocation materialId = ResourceLocation.parse(o.get("material_id").getAsString());
                        int cmd = o.has("custom_model_data") ? o.get("custom_model_data").getAsInt() : 0;
                        double pct = o.has("percentage") ? o.get("percentage").getAsDouble() : 100.0;
                        String qty = o.has("quantityRange") ? o.get("quantityRange").getAsString() : "1";
                        entries.add(new Entry(materialId, cmd, pct, IntRange.parse(qty)));
                    }

                    TABLES.put(target, new DropTable(amount, entries));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
