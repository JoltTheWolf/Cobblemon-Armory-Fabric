package net.joltthewolf.cobblemonarmory;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.joltthewolf.cobblemonarmory.client.renderer.PrimeapeGloveRenderer;
import net.joltthewolf.cobblemonarmory.client.renderer.SirfetchdSwordRenderer;
import net.joltthewolf.cobblemonarmory.client.renderer.StarmieSwordRenderer;
import net.joltthewolf.cobblemonarmory.client.renderer.TinkatonHammerRenderer;
import net.joltthewolf.cobblemonarmory.item.ModItems;

public class CobblemonArmoryClient implements ClientModInitializer {
    @Override public void onInitializeClient() {
        System.out.println("[CobblemonArmory] Client init running");
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.STARMIE_SWORD,  new StarmieSwordRenderer()::render);
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.TINKATON_HAMMER, new TinkatonHammerRenderer()::render);
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.SIRFETCHD_SWORD, new SirfetchdSwordRenderer()::render);
        BuiltinItemRendererRegistry.INSTANCE.register(ModItems.PRIMEAPE_GLOVE, new PrimeapeGloveRenderer()::render);
        System.out.println("[CobblemonArmory] Registered builtin renderers");
    }
}
