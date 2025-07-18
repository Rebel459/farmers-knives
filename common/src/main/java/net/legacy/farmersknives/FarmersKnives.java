package net.legacy.farmersknives;

import net.legacy.farmersknives.registry.FKCreativeTab;
import net.legacy.farmersknives.registry.FKItems;
import net.minecraft.resources.ResourceLocation;

public final class FarmersKnives {
    public static final String MOD_ID = "farmersknives";
    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static void init() {
        // Write common init code here.
        FKItems.init();
        FKCreativeTab.init();
    }
}
