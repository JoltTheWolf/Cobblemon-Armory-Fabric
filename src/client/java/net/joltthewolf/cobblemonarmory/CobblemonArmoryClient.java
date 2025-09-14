package net.joltthewolf.cobblemonarmory;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BuiltinItemRendererRegistry;
import net.joltthewolf.cobblemonarmory.renderer.*;
import net.joltthewolf.cobblemonarmory.item.ModItems;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

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
