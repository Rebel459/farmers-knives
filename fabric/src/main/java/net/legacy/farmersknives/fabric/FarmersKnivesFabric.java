package net.legacy.farmersknives.fabric;

import net.fabricmc.api.ModInitializer;

import net.legacy.farmersknives.FarmersKnives;

public final class FarmersKnivesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        FarmersKnives.init();
    }
}
