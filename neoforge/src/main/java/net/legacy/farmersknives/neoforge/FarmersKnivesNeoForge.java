package net.legacy.farmersknives.neoforge;

import net.neoforged.fml.common.Mod;

import net.legacy.farmersknives.FarmersKnives;

@Mod(FarmersKnives.MOD_ID)
public final class FarmersKnivesNeoForge {
    public FarmersKnivesNeoForge() {
        // Run our common setup.
        FarmersKnives.init();
    }
}
