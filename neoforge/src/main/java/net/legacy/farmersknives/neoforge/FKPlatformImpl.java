package net.legacy.farmersknives.neoforge;

import net.minecraft.world.item.Item;

public class FKPlatformImpl {
    public static Item createKnifeItem(Item.Properties properties) {
        return new net.legacy.farmersknives.neoforge.item.KnifeItemNeoForge(properties);
    }
}
